package com.kitri.chat.client;

import java.awt.event.*;
import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.StringTokenizer;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import com.kitri.chat.util.ChatConstance;

public class Login extends JFrame implements ActionListener, Runnable, ListSelectionListener {

	Socket socket;
	String myid;
	BufferedReader in;
	OutputStream out;

	JLabel ip;
	JLabel name;
	JTextField ipTf;
	JTextField nameTf;
	JButton cancel;
	JButton ok;

	Chat chat;
	Paper paper;
	Rename rename;

	public Login() {
		super("Login!!");
		initGUI();

		chat = new Chat();
		paper = new Paper();
		rename = new Rename();

//		일반적으로 생성자 후미에 이벤트 등록을 하면된다.
//		login event 등록
		nameTf.addActionListener(this);
		ok.addActionListener(this);
		cancel.addActionListener(this);

//		chat창 event 등록
		chat.globalsend.addActionListener(this);
		chat.whomsend.addActionListener(this);
		chat.paper.addActionListener(this);
		chat.rename.addActionListener(this);
		chat.exit.addActionListener(this);

		chat.list.addListSelectionListener(this);

		chat.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				closeProcess();
			}

		});

//		paper창 event 등록
		paper.cancel.addActionListener(this);
		paper.ok.addActionListener(this);
		paper.answer.addActionListener(this);
//		rename event 등록
		rename.ok.addActionListener(this);
		rename.cancel.addActionListener(this);

	}

	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			getContentPane().setBackground(new java.awt.Color(244, 243, 242));
			{
				ip = new JLabel();
				getContentPane().add(ip);
				ip.setText("\uc544\uc774\ud53c");
				ip.setBounds(12, 12, 60, 30);
				ip.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
				ip.setFocusable(false);
				ip.setRequestFocusEnabled(false);
				ip.setHorizontalAlignment(SwingConstants.CENTER);
			}
			{
				name = new JLabel();
				getContentPane().add(name);
				name.setText("\ub300\ud654\uba85");
				name.setBounds(12, 47, 60, 30);
				name.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
				name.setFocusable(false);
				name.setRequestFocusEnabled(false);
				name.setHorizontalAlignment(SwingConstants.CENTER);
			}
			{
				ipTf = new JTextField();
				getContentPane().add(ipTf);
				ipTf.setBounds(78, 12, 209, 30);
			}
			{
				nameTf = new JTextField();
				getContentPane().add(nameTf);
				nameTf.setBounds(78, 47, 209, 30);
			}
			{
				ok = new JButton();
				getContentPane().add(ok);
				ok.setText("\ub85c\uadf8\uc778");
				ok.setBounds(83, 83, 61, 32);
				ok.setBackground(new java.awt.Color(237, 236, 233));
				ok.setBorder(new LineBorder(new java.awt.Color(0, 0, 0), 1, false));
			}
			{
				cancel = new JButton();
				getContentPane().add(cancel);
				cancel.setText("\ucde8 \uc18c");
				cancel.setBounds(153, 83, 59, 32);
				cancel.setBackground(new java.awt.Color(237, 236, 233));
				cancel.setBorder(new LineBorder(new java.awt.Color(0, 0, 0), 1, false));
			}
			pack();
			this.setSize(303, 150);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Login inst = new Login();
				inst.setLocationRelativeTo(null);
				inst.setResizable(false);
				inst.setVisible(true);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		if (ob == nameTf || ob == ok) {
			connectProcess();
		} else if (ob == cancel) {
			System.exit(0);
		} else if (ob == chat.globalsend) {
			globalsendProcess();
		} else if (ob == chat.whomsend) {
			whomsendProcess();
		} else if (ob == chat.paper) {
			paperOpen();
		} else if (ob == chat.rename) {
			renameOpen();
		} else if (ob == chat.exit) {
			closeProcess();
		} else if (ob == paper.cancel) {
			paperClose();
		} else if (ob == paper.ok) {
			paperProcess();
		} else if (ob == paper.answer) {
			paperAnswer();
		} else if (ob == rename.ok) {
			renameProcess();
		} else if (ob == rename.cancel) {
			renameClose();
		}

	}

	private void renameClose() {
		rename.oldname.setText("");
		rename.setVisible(false);
		
	}

	private void renameProcess() {
		String newN = rename.newname.getText().trim();
		if(newN.isEmpty()) {
			JOptionPane.showMessageDialog(chat, "대화명을 입력하세요","대화명오류",JOptionPane.WARNING_MESSAGE);
		}
		
		sendMessage(ChatConstance.CS_RENAME + "|" + newN); // 서버에 보내준다.
		myid = newN;
		renameClose();
	}

	private void renameOpen() {
		rename.oldname.setText(myid);
		rename.setVisible(true);
	}

	private void paperAnswer() {
//		paperProcess();
		paper.to.setText(paper.from.getText());
		paper.from.setText(myid);
		paper.letter.append("\n\n------------------------[원글]\n\n");
		paper.card.show(paper.cardp,"ok");
		
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		String selName = chat.list.getSelectedValue();
		chat.whom.setText(selName);
	}

//	1.to,msg 받아라
//	2.서버에 전송해라
//	3.paper창 닫기
	private void paperProcess() {

		String to = paper.to.getText();
		String msg = paper.letter.getText().replace("\n", ChatConstance.SPACE_DILIMITER);

		sendMessage(ChatConstance.CS_PAPER + "|" + to + "|" + msg);

//		paper.setVisible(false);
//		paper.letter.setText("");
		paperClose();
	}

	private void paperOpen() {
		String to = chat.list.getSelectedValue();
		myid = nameTf.getText().trim();
		paper.from.setText(myid);
//		paper.to.setText(chat.whom.getText());
		paper.to.setText(to);
		
		paper.setVisible(true);

	}

	private void paperClose() {
		paper.from.setText("");
		paper.to.setText("");
		paper.letter.setText("");
		paper.setVisible(false);
	}

//	1.서버에 나간다고 알려야함.
//	2.
	private void closeProcess() {
		sendMessage(ChatConstance.CS_DISCONNECT + "|");
	}

//	1.메세지 get(유효성 검사 대상자,자신,메세지)
//	2.sever로 메세지 전송
	private void whomsendProcess() {
		String msg = chat.whomsend.getText().trim();
		chat.whomsend.setText("");
		if (msg.isEmpty()) {
			return;
		}

		String to = chat.whom.getText();
		if (to.isEmpty()) {
			JOptionPane.showMessageDialog(chat, "대상을 선택하지않았습니다.", "대상자오류", JOptionPane.ERROR_MESSAGE);
			return;
		}

		if (to.equals(myid)) {
			JOptionPane.showMessageDialog(chat, "자신에게 귓속말을???", "대상자오류", JOptionPane.INFORMATION_MESSAGE);
			return;
		}

		sendMessage(ChatConstance.CS_TO + "|" + to + "|" + msg);
		viewMessage("★" + to + "★" + msg);
	}

//	1.메세지 get (유효성검사)
//	2.server로 메시지 전송.
//	3.

	private void globalsendProcess() {
		String msg = chat.globalsend.getText().trim();
		chat.globalsend.setText("");
		if (msg.isEmpty()) {
			return;
		}
		sendMessage(ChatConstance.CS_ALL + "|" + msg);
	}

//	1. ip , 대화명 get(유효성검사(대화명 3글자 이상만 처리))
//	2. 1의 ip를 이용해서 socket 생성.
//	3. IO(BufferedReader,OutputStream) 생성.
//	4. login 창 닫고, chat 창 열기.
//	5. server로 메시지 전송.(프로토콜 정의)
//	6. Thread 실행.
	private void connectProcess() {
		String ip = ipTf.getText().trim();
		myid = nameTf.getText().trim();
		if (myid.length() < 3) {
			JOptionPane.showMessageDialog(this, "대화명은 3자 이상입니다.", "대화명오류", JOptionPane.WARNING_MESSAGE);
			return;
		}
		try {
			socket = new Socket(ip, ChatConstance.PORT);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = socket.getOutputStream();
			this.setVisible(false);
			chat.setVisible(true);
			sendMessage(ChatConstance.CS_CONNECT + "|" + myid);
			// 서버는 버퍼드리더로 받는데 엔터를 기준으로 받기떄문에 반드시 "\n"이 삽입되어야한다
			new Thread(this).start(); // 쓰레드를 실행한다.
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private void sendMessage(String msg) {
		try {
			out.write((msg + "\n").getBytes());
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		boolean flag = true;
		while (flag) {
			try {
				String msg = in.readLine();
				System.out.println("클라이언트가 보낸 메시지 : " + msg);// protocol|메시지 형식...
				StringTokenizer st = new StringTokenizer(msg, "|");
				int protocol = Integer.parseInt(st.nextToken());
				switch (protocol) {
				case ChatConstance.SC_CONNECT: { // 클라이언트 각각의 창. 화면에 뿌려지는 창임.
//					서버에서 100|접속자 대화명을 보냄.
					String tmp = st.nextToken();
					viewMessage(" [알림] " + tmp + "님이 접속하였습니다.");
					chat.listData.add(tmp);// 벡터에 적용한걸 리스트에 뿌려야함.
					chat.list.setListData(chat.listData);
				}
					break;
				case ChatConstance.SC_MESSAGE: {
//					200|[안효인] 안녕하세요...
					String tmp = st.nextToken();// [안효인] 안녕하세요..
					viewMessage(tmp);
				}
					break;
				case ChatConstance.SC_PAPER: {
//					300|보낸사람대화명|메시지
					String from = st.nextToken();// 보낸 사람 대화명
					String tmp = st.nextToken().replace(ChatConstance.SPACE_DILIMITER, "\n");// 메시지.*/
//					쪽지받는 코드.
					paper.to.setText(myid);
					paper.from.setText(from);
					paper.letter.setText(tmp);
					paper.card.show(paper.cardp, "answer");
					paper.setVisible(true);
//					viewMessage(from+tmp);

				}
					break;
				case ChatConstance.SC_RENAME: {
//					대화명변경				400|변경전대화명|변경할대화명

					String tmp = st.nextToken();// 바뀔 대화명을 받았어.
					String old = st.nextToken();// 변경 전 대화명도 받았다.

					viewMessage(" [알림] "+ old +" 님이 "+tmp + " 으로 닉네임을 변경하였습니다.");
//					chat.listData.remove(old);
//					chat.listData.add(tmp);
					chat.listData.set(chat.listData.indexOf(old), tmp);
					chat.list.setListData(chat.listData);//변경은 완료됐음. 
					nameTf.setText(tmp); //이름도 바꿈
				}
					break;
				case ChatConstance.SC_DISCONNECT: {
//					900|나가는사람
					String tmp = st.nextToken();// 나가는 사람.
					if (!tmp.equals(myid)) {
						viewMessage(" [알림] " + tmp + " 님이 접속을 종료하였습니다.");
						chat.listData.remove(tmp);
						chat.list.setListData(chat.listData);
					} else {
						in.close();
						out.close();
						socket.close();
						System.exit(0);
					}
				}
					break;
				}
			} catch (IOException e) {
				e.printStackTrace();
				break;
			}
		}
	}

	private void viewMessage(String msg) {
		chat.area.append(msg + "\n");
		chat.area.setCaretPosition(chat.area.getDocument().getLength());
	}
}
