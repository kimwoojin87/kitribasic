package com.kitri.awt.event;

import java.awt.*;
import java.awt.event.*;

public class ItemLogic  implements ItemListener, ActionListener{
	
//	ItemTest it = new ItemTest(); //new 하면 안되고 방금 띄운 주소창의 값을 찾아야한다.
	
	ItemTest itemTest;

	public ItemLogic(ItemTest itemTest) {
		this.itemTest = itemTest;
	}

	public static void main(String[] args) {

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
		
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		Object ob = e.getSource();
		if(ob == itemTest.ch) {
			String str = itemTest.ch.getSelectedItem();
			if(str.equals("아침")) {
				itemTest.mor.setState(true);
			}else if(str.equals("점심")) {
				itemTest.aft.setState(true);
			}else {
				itemTest.eve.setState(true);
			}
		}
		
		Checkbox sel = itemTest.cg.getSelectedCheckbox();
		String selStr = sel.getLabel();
//		System.out.println(selStr);
		itemTest.ta.setText("--- " + selStr + " ---\n");
		
		itemTest.ta.append("1. 사과 : " + eat(itemTest.app.getState())+"\n");
		itemTest.ta.append("2. 바나나 : "+ eat(itemTest.banana.getState())+"\n");
		itemTest.ta.append("3. 딸기 : "+ eat(itemTest.straw.getState())+"\n");
		itemTest.ch.select(selStr);
		
	}
	private String eat(boolean flag) {
		return flag ? "먹었다." : "안먹었다.";
	}

}
