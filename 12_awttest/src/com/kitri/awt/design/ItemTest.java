package com.kitri.awt.design;

import java.awt.*;

public class ItemTest extends Frame{
 //선언부
	Panel Pn = new Panel();
	Panel Ps = new Panel();
	
	CheckboxGroup cbg = new CheckboxGroup();
	Checkbox cb = new Checkbox();
	
	TextArea ta = new TextArea();
	
	Choice ch = new Choice();
	Button exit = new Button("종료");
	public ItemTest() {
		//배치부
		
		Pn.setLayout(new GridLayout(2, 6));
		Pn.add(new Checkbox("아침",cbg,true));
		Pn.add(new Checkbox("점심",cbg,false));
		Pn.add(new Checkbox("저녁",cbg,false));
		Pn.add(new Checkbox("사과",null,true));
		Pn.add(new Checkbox("바나나"));
		Pn.add(new Checkbox("딸기"));

		Ps.setLayout(new BorderLayout(0, 10));
		ch.add("사과");
		ch.add("바나나");
		ch.add("딸기");
		Ps.add(ch);
		Ps.add(exit);
		Ps.add(ch,"Center");
		Ps.add(exit,"East");
		
		
		add(Pn,"North");
		add(ta,"Center");
		add(Ps,"South");
		setBounds(300, 200, 300, 500);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ItemTest();
	}

}
