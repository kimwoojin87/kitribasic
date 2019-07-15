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
	
	Button btR = new Button("��");
	Button btRAll = new Button("��");
	Button btL = new Button("��");
	Button btLAll = new Button("��");
	
	Font f = new Font("����", Font.BOLD, 20);
	
	public ListAdd() {
		super("����Ʈ �׽�Ʈ");
		
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
//			1.tfl �� ���� ����(��ȿ�� �˻�)
			String tmp = tfL.getText();
			tfL.setText("");
			if(tmp.isEmpty()) {
				return;
			}
//			2.listl �� �߰�
			listL.add(tmp);
//			3.�ؽ�Ʈ�ʵ带 ����ְ� ������
			
			
		}else if (ob == tfR) {
			String tmp = tfR.getText();
			tfR.setText("");
			if(tmp.isEmpty()) {
				return;
			}
			listR.add(tmp);
		}else if (ob == btR) {
//			1.listL���� ���ڿ��� ������
			String tmp = listL.getSelectedItem();
			if(tmp==null) {
				return;
			}
//			2.listR�� �߰���Ű��
			listR.add(tmp);
//			3.listL���� �ش� �׸��� ������Ű��.
			listL.remove(tmp);
		}else if (ob == btL) {
			String tmp = listR.getSelectedItem();
			if(tmp==null) {
				return;
			}
			listL.add(tmp);
			listR.remove(tmp);
			
		}else if (ob == btRAll) {
//			1.listl�� �ִ� ��� ���ڿ��� �����Ѵ�.
			String tmp[] = listL.getItems();
//			2.listl�� �ִ� ��� ���ڿ��� listr�� ������.
			for(int i=0;i<tmp.length;i++) {
				listR.add(tmp[i]);
			}
//			3.listl�� ��� �����Ѵ�.
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