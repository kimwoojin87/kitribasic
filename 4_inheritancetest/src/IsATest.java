import java.awt.*;

public class IsATest extends Frame{

	
	Button b1 = new Button("@눌러봐1@"); //버튼을 가지고있는 것
	Button b2 = new Button("@눌러봐2@");
	Button b3 = new Button("@눌러봐3@");
	Checkbox c = new Checkbox("선택");

	public IsATest(){
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
		
	}

	public static void main(String[] args) {
		IsATest hat = new IsATest();
	}
}