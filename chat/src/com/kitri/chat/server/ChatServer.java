package com.kitri.chat.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;
import java.util.Vector;

import com.kitri.chat.util.ChatConstance;

public class ChatServer implements Runnable {

	ServerSocket ss;
	Vector<ChatClient> list = new Vector<ChatServer.ChatClient>();// ChatServer. 지워도 상관없음.

	public ChatServer() {
		try {
			ss = new ServerSocket(ChatConstance.PORT);
			System.out.println("클라이언트 접속 대기중.........");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {// 접속처리용
		while (true) {
			try {
				Socket socket = ss.accept();
				System.out.println("클라이언트 접속 성공 :: " + socket);
				new ChatClient(socket).start();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	class ChatClient extends Thread {// 이너클래스
		String name;
		BufferedReader in;
		OutputStream out;
		Socket socket;

		public ChatClient(Socket socket) {
			try {
				this.socket = socket;
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				out = socket.getOutputStream();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override
		public void run() {// 메시지처리
			boolean flag = true;
			while (flag) {
				try {
					String msg = in.readLine();
					System.out.println("클라이언트가 보낸 메시지 : " + msg);// protocol|메시지 형식...
					StringTokenizer st = new StringTokenizer(msg, "|");
					int protocol = Integer.parseInt(st.nextToken());
					switch (protocol) {
					case ChatConstance.CS_CONNECT: {
//						100|안효인
						name = st.nextToken();// 안효인
//						int size = list.size();
//						for(int i = 0;i<size;i++) {
//							ChatClient cc = list.get(i);
//						}
						multicast(ChatConstance.SC_CONNECT + "|" + name);

						list.add(this);// 이제는 나 자신에게 대화명을 보내라.
						for (ChatClient cc : list) {
							unicast(ChatConstance.SC_CONNECT + "|" + cc.name);

						}
					}
						break;
					case ChatConstance.CS_ALL: {
//						200|안녕하세요.
						String tmp = st.nextToken();// 안녕하세요
						multicast(ChatConstance.SC_MESSAGE + "|[" + name + "]" + tmp);

					}
						break;
					case ChatConstance.CS_TO: {
//						250|홍길동|안녕???
						String to = st.nextToken();//홍길동
						String tmp = st.nextToken();//안녕??
						for(ChatClient cc : list) {
							if(cc.name.equals(to)) {
								cc.unicast(ChatConstance.SC_MESSAGE + "|☆"+name+"☆ "+tmp);
								break;
							}
						}
					}
						break;
					case ChatConstance.CS_PAPER: {
//						300|대상자|메시지
						String to = st.nextToken(); //대상자
						String tmp = st.nextToken(); //메시지
						
						for(ChatClient cc : list) {
							if(cc.name.equals(to)) {
								cc.unicast(ChatConstance.SC_PAPER+"|"+this.name+"|"+tmp/*.replace(ChatConstance.SPACE_DILIMITER, "\n")*/);
								
								
							}
						}
					}
						break;
					case ChatConstance.CS_RENAME: {
//						대화명변경				400|변경할 대화명
						String newN = st.nextToken(); // 변경할 아이디
														// 변경전 대화명 보내야함.
						multicast(ChatConstance.SC_RENAME+"|"+newN+"|"+name);
						name = newN;//이것이 함정.
						
					}
						break;
					case ChatConstance.CS_DISCONNECT: {
//						900|
						multicast(ChatConstance.SC_DISCONNECT+"|"+name);
						list.remove(this);
						flag = false;
						in.close();
						out.close();
						socket.close();//애네들이 하나라도 널이었으면 여기에 들어오지도 못하기떄문에 이프문을 안돌리고 닫아라만 함.
					}
						break;
					}
				} catch (IOException e) {
					e.printStackTrace();
					break;
				}
			}
		}

		private void multicast(String msg) {
			for (ChatClient cc : list) {// 향상된 포문 . 나를 제외한 나머지 각각의 사람들에게 대화명을 전달하려는 의도
				cc.unicast(msg);
			}
		}

		private void unicast(String msg) {
			try {
				out.write((msg + "\n").getBytes());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}// 이너클래스 끝

	public static void main(String[] args) {
//		ChatServer cs = new ChatServer();
//		Thread t = new Thread(cs);
//		t.start();
		new Thread(new ChatServer()).start();
	}
}
