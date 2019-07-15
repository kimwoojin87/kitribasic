package com.kitri.awt.design;

import java.awt.*;

//1. Frame �� ��ӹ޾ƾ���.
//2. ����ο� �ʿ��� ��ü ����.
//3. ��ġ�ο��� design(component ��ġ)
//** �۾��� ���� ���� �Ϳ��� ū �� ������ ��.

public class DesignTest extends Frame {
	
//	�����
	Panel Pn = new Panel();
	Panel Ps = new Panel();
	
	Label l = new Label("�Է�",Label.CENTER);
	TextField tf = new TextField();
	Button send = new Button("����");
	
	TextArea ta = new TextArea();
	
	Choice ch = new Choice();
	Button exit = new Button("����");
	
	
	public DesignTest() {
		super("Design Test !!!");
//  	��ġ��
//		1.setText("�Է�")
//		LayoutManager lm = new BorderLayout();
		Pn.setLayout(new BorderLayout(10,0)); // ������Ʈ������ �� �糡���� ����� ����.
		l.setBackground(new Color(210,210,150));
//		l.setForeground(new Color(255,0,255));
		l.setForeground(Color.MAGENTA);
		Font f = new Font("����",Font.BOLD, 20);//�ڹ�vm�� �ν� �� �� �ִ� �۲ø� ������.
		l.setFont(f);
		Pn.add(l, "West");
		Pn.add(tf,"Center");
		send.setFont(f);
		Pn.add(send,"East");
		
		Ps.setLayout(new GridLayout(1,2,10,0));
		ch.add("����");
		ch.add("���,��õ");
		ch.add("����");
		ch.add("��û");
		Ps.add(ch);
		exit.setFont(f);
		Ps.add(exit);
		setLayout(new BorderLayout(0,10));
		add(Pn,"North");
		add(ta,"Center");
		add(Ps,BorderLayout.SOUTH); // �޸𸮻󿡼� ��ġ�۾��� ����� ����ڴٶ�� �۾��� �� ��.
		
//		setSize(300, 400);
//		setLocation(300, 200); �Ź� ȣ���ϱⰡ ������.
		setBounds(300, 200, 300, 500); // setsize�� setlocation�� ���ĳ����� setbounds
		setResizable(false);
		setVisible(true); // ���� �� ������ �Ŀ� ȭ�鿡 ������ �����ϴ°� ����.
		
	}
	public static void main(String[] args) {
		
//		DesignTest dt = new DesignTest();
		new DesignTest(); // �̸����� �����ڸ� ȣ���Ѵ�.
	}

}
