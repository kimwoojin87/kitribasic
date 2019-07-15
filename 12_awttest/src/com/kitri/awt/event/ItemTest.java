package com.kitri.awt.event;

import java.awt.*;
import java.awt.event.*;

public class ItemTest extends Frame implements ItemListener, ActionListener{
//기능설명 아침점심저녁을 하면 초이스가 아침점심저녁으로 바뀐다.
//초이스 아침점심저녁을 바꾸면 체크박스그룹도 바뀐다.
//종료 누르면 꺼진다.
//저녁 선택후 체크박스 선택시  1.사과    먹었다로 바뀜
//		  			 2.바나나  안먹었다.
//		  			 3.딸기    안먹었다.
//	이벤트리스너 8개 버튼 6개 초이스는 아이템리스너2개
	Panel pN = new Panel();
	Panel pS = new Panel();
	
	CheckboxGroup cg = new CheckboxGroup();
	Checkbox mor = new Checkbox("아침", cg, true);
	Checkbox aft = new Checkbox("점심", cg, false);
	Checkbox eve = new Checkbox("저녁", cg, false);
	Checkbox app = new Checkbox("사과", true);
	Checkbox banana = new Checkbox("바나나");
	Checkbox straw = new Checkbox("딸기");
	
	TextArea ta = new TextArea();
	
	Choice ch = new Choice();
	Button exit = new Button("종료");
	
	ItemLogic itemLogic;
	
	public ItemTest() {
		super("아이템 테스트!!!");
		
		pN.setLayout(new GridLayout(2, 3, 10, 10));
		pN.add(mor);
		pN.add(aft);
		pN.add(eve);
		pN.add(app);
		pN.add(banana);
		pN.add(straw);
		
		pS.setLayout(new BorderLayout(10, 0));
		ch.add("아침");
		ch.add("점심");
		ch.add("저녁");
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
			if(str.equals("아침")) {
				mor.setState(true);
			}else if(str.equals("점심")) {
				aft.setState(true);
			}else {
				eve.setState(true);
			}
		}
		Checkbox sel = cg.getSelectedCheckbox();
		String selStr = sel.getLabel();
//		System.out.println(selStr);
		ta.setText("--- " + selStr + " ---\n");
		
		ta.append("1. 사과 : " + eat(app.getState())+"\n");
		ta.append("2. 바나나 : "+ eat(banana.getState())+"\n");
		ta.append("3. 딸기 : "+ eat(straw.getState())+"\n");
		ch.select(selStr);
		
	}
	private String eat(boolean flag) {
		return flag ? "먹었다." : "안먹었다.";
	}
}
