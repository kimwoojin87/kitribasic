package com.kitri.awt.design;

import java.awt.*;

public class ItemTest extends Frame{
 //�����
	Panel Pn = new Panel();
	Panel Ps = new Panel();
	
	CheckboxGroup cbg = new CheckboxGroup();
	Checkbox cb = new Checkbox();
	
	TextArea ta = new TextArea();
	
	Choice ch = new Choice();
	Button exit = new Button("����");
	public ItemTest() {
		//��ġ��
		
		Pn.setLayout(new GridLayout(2, 6));
		Pn.add(new Checkbox("��ħ",cbg,true));
		Pn.add(new Checkbox("����",cbg,false));
		Pn.add(new Checkbox("����",cbg,false));
		Pn.add(new Checkbox("���",null,true));
		Pn.add(new Checkbox("�ٳ���"));
		Pn.add(new Checkbox("����"));

		Ps.setLayout(new BorderLayout(0, 10));
		ch.add("���");
		ch.add("�ٳ���");
		ch.add("����");
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
