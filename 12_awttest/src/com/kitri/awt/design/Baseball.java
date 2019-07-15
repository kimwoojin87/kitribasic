package com.kitri.awt.design;

import java.awt.*;

public class Baseball extends Frame{
//선언부
	
	
	Panel left = new Panel();
	Panel south = new Panel();
	
	Panel summenu = new Panel();
	
	Panel right = new Panel();
	
	TextArea ta = new TextArea();
	
	Button newg = new Button("새게임");
	Button clear = new Button("지우기");
	Button cor = new Button("정답");
	Button fontc = new Button("글자색");
	Button exit = new Button("종료");
	
	Label num = new Label("입력");
	TextField tf = new TextField();
	
	public Baseball() {
		//배치부	
		left.setLayout(new BorderLayout());
		left.add(ta);
		
		south.setLayout(new BorderLayout(10,0));
		south.add(num,BorderLayout.WEST);
		south.add(tf,BorderLayout.CENTER);
		
		summenu.setLayout(new BorderLayout());
		summenu.add(left,"Center");
		summenu.add(south,"South");
		
		
		right.setLayout(new GridLayout(5,1,0,10));
		right.add(newg);
		right.add(clear);
		right.add(cor);
		right.add(fontc);
		right.add(exit);
		
		
		
		add(summenu,"Center");
		add(right,"East");
		
		setBounds(300, 200, 500, 400);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Baseball();
		
	}

}
