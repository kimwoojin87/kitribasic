package com.kitri.awt.event;

import java.awt.*;
import java.awt.event.*;

public class ItemTest extends Frame implements ItemListener, ActionListener{
//��ɼ��� ��ħ���������� �ϸ� ���̽��� ��ħ������������ �ٲ��.
//���̽� ��ħ���������� �ٲٸ� üũ�ڽ��׷쵵 �ٲ��.
//���� ������ ������.
//���� ������ üũ�ڽ� ���ý�  1.���    �Ծ��ٷ� �ٲ�
//		  			 2.�ٳ���  �ȸԾ���.
//		  			 3.����    �ȸԾ���.
//	�̺�Ʈ������ 8�� ��ư 6�� ���̽��� �����۸�����2��
	Panel pN = new Panel();
	Panel pS = new Panel();
	
	CheckboxGroup cg = new CheckboxGroup();
	Checkbox mor = new Checkbox("��ħ", cg, true);
	Checkbox aft = new Checkbox("����", cg, false);
	Checkbox eve = new Checkbox("����", cg, false);
	Checkbox app = new Checkbox("���", true);
	Checkbox banana = new Checkbox("�ٳ���");
	Checkbox straw = new Checkbox("����");
	
	TextArea ta = new TextArea();
	
	Choice ch = new Choice();
	Button exit = new Button("����");
	
	ItemLogic itemLogic;
	
	public ItemTest() {
		super("������ �׽�Ʈ!!!");
		
		pN.setLayout(new GridLayout(2, 3, 10, 10));
		pN.add(mor);
		pN.add(aft);
		pN.add(eve);
		pN.add(app);
		pN.add(banana);
		pN.add(straw);
		
		pS.setLayout(new BorderLayout(10, 0));
		ch.add("��ħ");
		ch.add("����");
		ch.add("����");
		pS.add(ch, "Center");
		pS.add(exit, "East");
		
		setLayout(new BorderLayout(0, 10));
		add(ta, "Center");
		add(pN, "North");
		add(pS, "South");
		
		setBounds(300, 200, 300, 500);
		setVisible(true);	
		
		
		itemLogic = new ItemLogic(this);
		
		exit.addActionListener(itemLogic);
		
		mor.addItemListener(itemLogic);
		aft.addItemListener(itemLogic);
		eve.addItemListener(itemLogic);
		app.addItemListener(itemLogic);
		banana.addItemListener(itemLogic);
		straw.addItemListener(itemLogic);
		ch.addItemListener(itemLogic);
	}
	
	public static void main(String[] args) {
		new ItemTest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		Object ob = e.getSource();
		if(ob == ch) {
			String str = ch.getSelectedItem();
			if(str.equals("��ħ")) {
				mor.setState(true);
			}else if(str.equals("����")) {
				aft.setState(true);
			}else {
				eve.setState(true);
			}
		}
		Checkbox sel = cg.getSelectedCheckbox();
		String selStr = sel.getLabel();
//		System.out.println(selStr);
		ta.setText("--- " + selStr + " ---\n");
		
		ta.append("1. ��� : " + eat(app.getState())+"\n");
		ta.append("2. �ٳ��� : "+ eat(banana.getState())+"\n");
		ta.append("3. ���� : "+ eat(straw.getState())+"\n");
		ch.select(selStr);
		
	}
	private String eat(boolean flag) {
		return flag ? "�Ծ���." : "�ȸԾ���.";
	}
}
