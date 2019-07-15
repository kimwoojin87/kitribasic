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

//		�Ϲ������� ������ �Ĺ̿� �̺�Ʈ ����� �ϸ�ȴ�.
//		login event ���
		nameTf.addActionListener(this);
		ok.addActionListener(this);
		cancel.addActionListener(this);

//		chatâ event ���
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

//		paperâ event ���
		paper.cancel.addActionListener(this);
		paper.ok.addActionListener(this);
		paper.answer.addActionListener(this);
//		rename event ���
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
			JOptionPane.showMessageDialog(chat, "��ȭ���� �Է��ϼ���","��ȭ�����",JOptionPane.WARNING_MESSAGE);
		}
		
		sendMessage(ChatConstance.CS_RENAME + "|" + newN); // ������ �����ش�.
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
		paper.letter.append("\n\n------------------------[����]\n\n");
		paper.card.show(paper.cardp,"ok");
		
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		String selName = chat.list.getSelectedValue();
		chat.whom.setText(selName);
	}

//	1.to,msg �޾ƶ�
//	2.������ �����ض�
//	3.paperâ �ݱ�
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

//	1.������ �����ٰ� �˷�����.
//	2.
	private void closeProcess() {
		sendMessage(ChatConstance.CS_DISCONNECT + "|");
	}

//	1.�޼��� get(��ȿ�� �˻� �����,�ڽ�,�޼���)
//	2.sever�� �޼��� ����
	private void whomsendProcess() {
		String msg = chat.whomsend.getText().trim();
		chat.whomsend.setText("");
		if (msg.isEmpty()) {
			return;
		}

		String to = chat.whom.getText();
		if (to.isEmpty()) {
			JOptionPane.showMessageDialog(chat, "����� ���������ʾҽ��ϴ�.", "����ڿ���", JOptionPane.ERROR_MESSAGE);
			return;
		}

		if (to.equals(myid)) {
			JOptionPane.showMessageDialog(chat, "�ڽſ��� �ӼӸ���???", "����ڿ���", JOptionPane.INFORMATION_MESSAGE);
			return;
		}

		sendMessage(ChatConstance.CS_TO + "|" + to + "|" + msg);
		viewMessage("��" + to + "��" + msg);
	}

//	1.�޼��� get (��ȿ���˻�)
//	2.server�� �޽��� ����.
//	3.

	private void globalsendProcess() {
		String msg = chat.globalsend.getText().trim();
		chat.globalsend.setText("");
		if (msg.isEmpty()) {
			return;
		}
		sendMessage(ChatConstance.CS_ALL + "|" + msg);
	}

//	1. ip , ��ȭ�� get(��ȿ���˻�(��ȭ�� 3���� �̻� ó��))
//	2. 1�� ip�� �̿��ؼ� socket ����.
//	3. IO(BufferedReader,OutputStream) ����.
//	4. login â �ݰ�, chat â ����.
//	5. server�� �޽��� ����.(�������� ����)
//	6. Thread ����.
	private void connectProcess() {
		String ip = ipTf.getText().trim();
		myid = nameTf.getText().trim();
		if (myid.length() < 3) {
			JOptionPane.showMessageDialog(this, "��ȭ���� 3�� �̻��Դϴ�.", "��ȭ�����", JOptionPane.WARNING_MESSAGE);
			return;
		}
		try {
			socket = new Socket(ip, ChatConstance.PORT);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = socket.getOutputStream();
			this.setVisible(false);
			chat.setVisible(true);
			sendMessage(ChatConstance.CS_CONNECT + "|" + myid);
			// ������ ���۵帮���� �޴µ� ���͸� �������� �ޱ⋚���� �ݵ�� "\n"�� ���ԵǾ���Ѵ�
			new Thread(this).start(); // �����带 �����Ѵ�.
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
				System.out.println("Ŭ���̾�Ʈ�� ���� �޽��� : " + msg);// protocol|�޽��� ����...
				StringTokenizer st = new StringTokenizer(msg, "|");
				int protocol = Integer.parseInt(st.nextToken());
				switch (protocol) {
				case ChatConstance.SC_CONNECT: { // Ŭ���̾�Ʈ ������ â. ȭ�鿡 �ѷ����� â��.
//					�������� 100|������ ��ȭ���� ����.
					String tmp = st.nextToken();
					viewMessage(" [�˸�] " + tmp + "���� �����Ͽ����ϴ�.");
					chat.listData.add(tmp);// ���Ϳ� �����Ѱ� ����Ʈ�� �ѷ�����.
					chat.list.setListData(chat.listData);
				}
					break;
				case ChatConstance.SC_MESSAGE: {
//					200|[��ȿ��] �ȳ��ϼ���...
					String tmp = st.nextToken();// [��ȿ��] �ȳ��ϼ���..
					viewMessage(tmp);
				}
					break;
				case ChatConstance.SC_PAPER: {
//					300|���������ȭ��|�޽���
					String from = st.nextToken();// ���� ��� ��ȭ��
					String tmp = st.nextToken().replace(ChatConstance.SPACE_DILIMITER, "\n");// �޽���.*/
//					�����޴� �ڵ�.
					paper.to.setText(myid);
					paper.from.setText(from);
					paper.letter.setText(tmp);
					paper.card.show(paper.cardp, "answer");
					paper.setVisible(true);
//					viewMessage(from+tmp);

				}
					break;
				case ChatConstance.SC_RENAME: {
//					��ȭ����				400|��������ȭ��|�����Ҵ�ȭ��

					String tmp = st.nextToken();// �ٲ� ��ȭ���� �޾Ҿ�.
					String old = st.nextToken();// ���� �� ��ȭ�� �޾Ҵ�.

					viewMessage(" [�˸�] "+ old +" ���� "+tmp + " ���� �г����� �����Ͽ����ϴ�.");
//					chat.listData.remove(old);
//					chat.listData.add(tmp);
					chat.listData.set(chat.listData.indexOf(old), tmp);
					chat.list.setListData(chat.listData);//������ �Ϸ����. 
					nameTf.setText(tmp); //�̸��� �ٲ�
				}
					break;
				case ChatConstance.SC_DISCONNECT: {
//					900|�����»��
					String tmp = st.nextToken();// ������ ���.
					if (!tmp.equals(myid)) {
						viewMessage(" [�˸�] " + tmp + " ���� ������ �����Ͽ����ϴ�.");
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
