package practice;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ListAdd extends Frame implements ActionListener{

	Panel p1 = new Panel();
	Panel p2 = new Panel();
	Panel p3 = new Panel();
	
	List listL = new List();
	List listR = new List();
	TextField tfL = new TextField();
	TextField tfR = new TextField();
	
	Button btR = new Button("▷");
	Button btRAll = new Button("▶");
	Button btL = new Button("◁");
	Button btLAll = new Button("◀");
	
	Font f = new Font("굴림", Font.BOLD, 20);
	
	public ListAdd() {
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
		
		btR.addActionListener(this);
		btL.addActionListener(this);
		btRAll.addActionListener(this);
		btLAll.addActionListener(this);
	}
	
	


	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		if(ob == tfL) {
//			1.tfl 의 값을 얻어라(유효성 검사)
			String tmp = tfL.getText();
			tfL.setText("");
			if(tmp.isEmpty()) {
				return;
			}
//			2.listl 에 추가
			listL.add(tmp);
//			3.텍스트필드를 비어있게 만들어라
			
			
		}else if (ob == tfR) {
			String tmp = tfR.getText();
			tfR.setText("");
			if(tmp.isEmpty()) {
				return;
			}
			listR.add(tmp);
		}else if (ob == btR) {
//			1.listL에서 문자열을 선택함
			String tmp = listL.getSelectedItem();
			if(tmp==null) {
				return;
			}
//			2.listR에 추가시키고
			listR.add(tmp);
//			3.listL에서 해당 항목을 삭제시키자.
			listL.remove(tmp);
		}else if (ob == btL) {
			String tmp = listR.getSelectedItem();
			if(tmp==null) {
				return;
			}
			listL.add(tmp);
			listR.remove(tmp);
			
		}else if (ob == btRAll) {
//			1.listl에 있는 모든 문자열을 선택한다.
			String tmp[] = listL.getItems();
//			2.listl에 있는 모든 문자열을 listr로 보낸다.
			for(int i=0;i<tmp.length;i++) {
				listR.add(tmp[i]);
			}
//			3.listl을 모두 삭제한다.
			listL.removeAll();
		}else if (ob == btLAll) {
			String tmp[] = listR.getItems();
			for(int i=0;i<tmp.length;i++) {
				listL.add(tmp[i]);
			}
			listR.removeAll();
		}
		
	}
	
	
	
	public static void main(String[] args) {
		new ListAdd();
	}
	
}