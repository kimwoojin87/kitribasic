//4. �ڽ��� �����ڸ� ����. �߾Ⱦ�.
import java.awt.*;
import java.awt.event.*;


public class abstractTest3 extends Frame{

	
	Button b1 = new Button("@������1@"); //��ư�� �������ִ� ��
	Button b2 = new Button("@������2@");
	Button b3 = new Button("@������3@");
	Checkbox c = new Checkbox("����");

	public abstractTest3(){
		super("Is A Test!!!!");
		//f.setTitle("Has A Test!!!");
		setLayout(new FlowLayout());
		//b.setLabel("������!!!");
		b1.setBackground(new Color(210,255,210));
		c.setBackground(new Color(210,210,255));
		add(b1);
		add(b2);
		add(b3);
		add(c);
		setBackground(new Color(255,210,210));
		setSize(400,300);
		setLocation(300,200);
		setVisible(true);
		
//�ǹ̻��� �߻�޽��: �߻�Ŭ������� ���� �Ǿ����� �߻�޽��� �ϳ��� ����
//�̷��� �޽�� �� �ƹ��ų� ��� �������̵��ؼ� ����ϸ�ʴ�.
		WindowListener w1 = new WindowAdapter(){ //������ �ƴ��͸� ������ ������ �����ʸ� ������. 
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
			public void windowIconified(WindowEvent e){
				System.out.println("������ȭ!!!!!");
			}
		};

		

		addWindowListener(w1);
	}

	public static void main(String[] args) throws Exception {
		abstractTest3 hat = new abstractTest3();
	}
}