package com.kitri.awt.event;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListTest extends Frame implements ActionListener{

	Panel p1 = new Panel();
	Panel p2 = new Panel();
	Panel p3 = new Panel();
	//디자인하고 로직부분 중간에 제어하는 역할을 하나 둘것.
	List listL = new List();
	List listR = new List(0,true); // 10,true
	TextField tfL = new TextField();
	TextField tfR = new TextField();
	
	Button btR = new Button("▷");
	Button btRAll = new Button("▶");
	Button btL = new Button("◁");
	Button btLAll = new Button("◀");
	
	Font f = new Font("굴림", Font.BOLD, 20);
	
	public ListTest() {
		super("리스트 테스트");
		
		p1.setLayout(new BorderLayout(0, 10));
		p1.add(listL, "Center");
		p1.add(tfL, "South");
		
		p2.setLayout(new GridLayout(6, 1, 0, 20));
		p2.add(new Label(""));
		btR.setFont(f);
		btRAll.setFont(f);
		btL.setFont(f);
		btLAll.setFont(f);
		p2.add(btR);
		p2.add(btRAll);
		p2.add(btL);
		p2.add(btLAll);
		
		p3.setLayout(new BorderLayout(0, 10));
		p3.add(listR, "Center");
		p3.add(tfR, "South");
		
		setLayout(new GridLayout(1, 3, 10, 0));
		add(p1);
		add(p2);
		add(p3);
		
		setBounds(300, 200, 300, 500);
		setVisible(true);
		
		tfL.addActionListener(this);
		tfR.addActionListener(this);
		btL.addActionListener(this);
		btLAll.addActionListener(this);
		btR.addActionListener(this);
		btRAll.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		if(ob == tfL) {
//			1.tfl 의 값 get(유효성 검사)
			String tmp = tfL.getText().trim();
			tfL.setText("");
			if(tmp.isEmpty())
				return;
//			2.listl 에 추가
			listL.add(tmp);
//			3.비어있게 만들어라
			
		} else if(ob == tfR) {
			String tmp = tfR.getText().trim();
			tfR.setText("");
			if(tmp.isEmpty())
				return;
			listR.add(tmp);
		} else if(ob == btL) {
//			1.listR에서 선택한 문자열 get
			String tmp = listR.getSelectedItem();
			if(tmp == null) {
				return;
			}
//			2.r의 값을 listl에 추가
			listL.add(tmp);
//			3.선택한 r의 값을listr에서 제거
			listR.remove(tmp);
		} else if(ob == btLAll) {
//			1.listr의 값을 여러개 선택해 추가
			String tmp[] = listR.getSelectedItems();
//			2.r의 선택된 값을 listl에 모두 추가
			int len = tmp.length;
			for(int i = 0;i<len;i++) {
				listL.add(tmp[i]);
			}
//			3.r의 선택된 값을 listr에서 모두 제거
			for(int i =len-1;i>=0;i--) {
				listR.remove(tmp[i]);
			}
		} else if(ob == btR) {
//			1.listl에서 선택한 문자열 get
			String tmp = listL.getSelectedItem();
			if(tmp == null) {
				return;
			}
//			2.1의 값을 listr에 추가
			listR.add(tmp);
//			3 선택한 l의 값을 listl에서 제거.
			listL.remove(tmp);
		} else if(ob == btRAll) {
//			1.listl의 값을 모두 get
			String tmp[] = listL.getItems();
//			2.l값을 listr에 모두 추가
			int len = tmp.length;
			for (int i = 0; i < len; i++) {
				listR.add(tmp[i]);
			}	
//			3 1의 값을 listl에서 모두 제거
//			for(int i = len-1;i>=0;i--) {
//				listL.remove(i);
//			} //이런 방법도 있다.
			listL.removeAll();
//			len = tmp.length;
//			for (int i = 0; i < len; i++) {
//				listL.remove(tmp[i]);
//			}
//			
		}
	}
	
	public static void main(String[] args) {
		new ListTest();
	}


}
