package com.kitri.awt.event;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListTest extends Frame implements ActionListener{

	Panel p1 = new Panel();
	Panel p2 = new Panel();
	Panel p3 = new Panel();
	//�������ϰ� �����κ� �߰��� �����ϴ� ������ �ϳ� �Ѱ�.
	List listL = new List();
	List listR = new List(0,true); // 10,true
	TextField tfL = new TextField();
	TextField tfR = new TextField();
	
	Button btR = new Button("��");
	Button btRAll = new Button("��");
	Button btL = new Button("��");
	Button btLAll = new Button("��");
	
	Font f = new Font("����", Font.BOLD, 20);
	
	public ListTest() {
		super("����Ʈ �׽�Ʈ");
		
		p1.setLayout(new BorderLayout(0, 10));
		p1.add(listL, "Center");
		p1.add(tfL, "South");
		
		p2.setLayout(new GridLayout(6, 1, 0, 20));
		p2.add(new Label(""));
		btR.setFont(f);
		btRAll.setFont(f);
		btL.setFont(f);
		btLAll.setFont(f);
		p2.add(btR);
		p2.add(btRAll);
		p2.add(btL);
		p2.add(btLAll);
		
		p3.setLayout(new BorderLayout(0, 10));
		p3.add(listR, "Center");
		p3.add(tfR, "South");
		
		setLayout(new GridLayout(1, 3, 10, 0));
		add(p1);
		add(p2);
		add(p3);
		
		setBounds(300, 200, 300, 500);
		setVisible(true);
		
		tfL.addActionListener(this);
		tfR.addActionListener(this);
		btL.addActionListener(this);
		btLAll.addActionListener(this);
		btR.addActionListener(this);
		btRAll.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		if(ob == tfL) {
//			1.tfl �� �� get(��ȿ�� �˻�)
			String tmp = tfL.getText().trim();
			tfL.setText("");
			if(tmp.isEmpty())
				return;
//			2.listl �� �߰�
			listL.add(tmp);
//			3.����ְ� ������
			
		} else if(ob == tfR) {
			String tmp = tfR.getText().trim();
			tfR.setText("");
			if(tmp.isEmpty())
				return;
			listR.add(tmp);
		} else if(ob == btL) {
//			1.listR���� ������ ���ڿ� get
			String tmp = listR.getSelectedItem();
			if(tmp == null) {
				return;
			}
//			2.r�� ���� listl�� �߰�
			listL.add(tmp);
//			3.������ r�� ����listr���� ����
			listR.remove(tmp);
		} else if(ob == btLAll) {
//			1.listr�� ���� ������ ������ �߰�
			String tmp[] = listR.getSelectedItems();
//			2.r�� ���õ� ���� listl�� ��� �߰�
			int len = tmp.length;
			for(int i = 0;i<len;i++) {
				listL.add(tmp[i]);
			}
//			3.r�� ���õ� ���� listr���� ��� ����
			for(int i =len-1;i>=0;i--) {
				listR.remove(tmp[i]);
			}
		} else if(ob == btR) {
//			1.listl���� ������ ���ڿ� get
			String tmp = listL.getSelectedItem();
			if(tmp == null) {
				return;
			}
//			2.1�� ���� listr�� �߰�
			listR.add(tmp);
//			3 ������ l�� ���� listl���� ����.
			listL.remove(tmp);
		} else if(ob == btRAll) {
//			1.listl�� ���� ��� get
			String tmp[] = listL.getItems();
//			2.l���� listr�� ��� �߰�
			int len = tmp.length;
			for (int i = 0; i < len; i++) {
				listR.add(tmp[i]);
			}	
//			3 1�� ���� listl���� ��� ����
//			for(int i = len-1;i>=0;i--) {
//				listL.remove(i);
//			} //�̷� ����� �ִ�.
			listL.removeAll();
//			len = tmp.length;
//			for (int i = 0; i < len; i++) {
//				listL.remove(tmp[i]);
//			}
//			
		}
	}
	
	public static void main(String[] args) {
		new ListTest();
	}


}
