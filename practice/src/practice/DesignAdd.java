package practice;

import java.awt.*;
import java.awt.event.*;

public class DesignAdd extends Frame implements ItemListener,ActionListener{
	

	Panel Pn = new Panel();
	Panel Ps = new Panel();
	
	Label l = new Label("입력",Label.CENTER);
	TextField tf = new TextField();
	Button send = new Button("전송");
	
	TextArea ta = new TextArea();
	
	Choice ch = new Choice();
	Button exit = new Button("종료");
	
	
	public DesignAdd () {
		super("Design Test !!!");

		Pn.setLayout(new BorderLayout(10,0)); 
		l.setBackground(new Color(210,210,150));

		l.setForeground(Color.MAGENTA);
		Font f = new Font("굴림",Font.BOLD, 20);
		l.setFont(f);
		Pn.add(l, "West");
		Pn.add(tf,"Center");
		send.setFont(f);
		Pn.add(send,"East");
		
		Ps.setLayout(new GridLayout(1,2,10,0));
		ch.add("서울");
		ch.add("경기,인천");
		ch.add("강원");
		ch.add("충청");
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
//			1.tf 에 있는 내용을
			String tmp = tf.getText().trim();
//			2.ta로 옮겨진다.
			if(tmp.isEmpty()) {
				return;
			}
			ta.append(tmp+"\n");
			tf.setText("");
//			4.tf에 있는 내용이 사라진다.
			
			
		}
		
		if(ob == exit) {
			System.exit(0);
		}
		
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
//		1. ch 목록을 선택하면
		String choi = ch.getSelectedItem();
//		2. ta 에 FROM ch가 붙는다.
		ta.setText("FROM ::  " +choi+"\n");
	}

	public static void main(String[] args) {
		
		
		new DesignAdd();
	}
}
