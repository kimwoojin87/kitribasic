package com.kitri.awt.design;

import java.awt.*;

//1. Frame 을 상속받아야함.
//2. 선언부에 필요한 객체 생성.
//3. 배치부에서 design(component 배치)
//** 작업은 제일 작은 것에서 큰 거 순으로 함.

public class DesignTest extends Frame {
	
//	선언부
	Panel Pn = new Panel();
	Panel Ps = new Panel();
	
	Label l = new Label("입력",Label.CENTER);
	TextField tf = new TextField();
	Button send = new Button("전송");
	
	TextArea ta = new TextArea();
	
	Choice ch = new Choice();
	Button exit = new Button("종료");
	
	
	public DesignTest() {
		super("Design Test !!!");
//  	배치부
//		1.setText("입력")
//		LayoutManager lm = new BorderLayout();
		Pn.setLayout(new BorderLayout(10,0)); // 컴포넌트사이의 갭 양끝쪽은 상관이 없다.
		l.setBackground(new Color(210,210,150));
//		l.setForeground(new Color(255,0,255));
		l.setForeground(Color.MAGENTA);
		Font f = new Font("굴림",Font.BOLD, 20);//자바vm이 인식 할 수 있는 글꼴만 가능함.
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
		add(Ps,BorderLayout.SOUTH); // 메모리상에서 배치작업이 모양을 만들겠다라는 작업을 한 것.
		
//		setSize(300, 400);
//		setLocation(300, 200); 매번 호출하기가 귀찮다.
		setBounds(300, 200, 300, 500); // setsize와 setlocation을 합쳐놓은게 setbounds
		setResizable(false);
		setVisible(true); // 모든걸 다 지정한 후에 화면에 보여라를 지정하는게 좋다.
		
	}
	public static void main(String[] args) {
		
//		DesignTest dt = new DesignTest();
		new DesignTest(); // 이름없이 생성자를 호출한다.
	}

}
