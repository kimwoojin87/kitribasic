package practice;

import java.awt.*;
import java.awt.event.*;

public class DesignAdd extends Frame implements ItemListener,ActionListener{
	

	Panel Pn = new Panel();
	Panel Ps = new Panel();
	
	Label l = new Label("�Է�",Label.CENTER);
	TextField tf = new TextField();
	Button send = new Button("����");
	
	TextArea ta = new TextArea();
	
	Choice ch = new Choice();
	Button exit = new Button("����");
	
	
	public DesignAdd () {
		super("Design Test !!!");

		Pn.setLayout(new BorderLayout(10,0)); 
		l.setBackground(new Color(210,210,150));

		l.setForeground(Color.MAGENTA);
		Font f = new Font("����",Font.BOLD, 20);
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
		add(Ps,BorderLayout.SOUTH);
		

		setBounds(300, 200, 300, 500);
		setResizable(false);
		setVisible(true);
		
		
		send.addActionListener(this);
		exit.addActionListener(this);
		
		ch.addItemListener(this);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		
		if(ob == send) {
//			1.tf �� �ִ� ������
			String tmp = tf.getText().trim();
//			2.ta�� �Ű�����.
			if(tmp.isEmpty()) {
				return;
			}
			ta.append(tmp+"\n");
			tf.setText("");
//			4.tf�� �ִ� ������ �������.
			
			
		}
		
		if(ob == exit) {
			System.exit(0);
		}
		
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
//		1. ch ����� �����ϸ�
		String choi = ch.getSelectedItem();
//		2. ta �� FROM ch�� �ٴ´�.
		ta.setText("FROM ::  " +choi+"\n");
	}

	public static void main(String[] args) {
		
		
		new DesignAdd();
	}
}
