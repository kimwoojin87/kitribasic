//4. 자신의 생성자를 참조. 잘안씀.
import java.awt.*;
import java.awt.event.*;


public class abstractTest3 extends Frame{

	
	Button b1 = new Button("@눌러봐1@"); //버튼을 가지고있는 것
	Button b2 = new Button("@눌러봐2@");
	Button b3 = new Button("@눌러봐3@");
	Checkbox c = new Checkbox("선택");

	public abstractTest3(){
		super("Is A Test!!!!");
		//f.setTitle("Has A Test!!!");
		setLayout(new FlowLayout());
		//b.setLabel("눌러봐!!!");
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
		
//의미상의 추상메쏘드: 추상클래스라고 정의 되었으나 추상메쏘드는 하나도 없음
//이럴땐 메쏘드 중 아무거나 골라서 오버라이드해서 사용하면됨다.
		WindowListener w1 = new WindowAdapter(){ //윈도우 아답터를 가지고 윈도우 리스너를 생성함. 
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
			public void windowIconified(WindowEvent e){
				System.out.println("아이콘화!!!!!");
			}
		};

		

		addWindowListener(w1);
	}

	public static void main(String[] args) throws Exception {
		abstractTest3 hat = new abstractTest3();
	}
}