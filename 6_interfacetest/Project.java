import java.awt.*;


public class Project extends Frame{
	Project(){
		super("������ 5�ʸ��� ���ϴ� ���");
		setLocation(500,500);
		setSize(800,600);
		setVisible(true);

		WindowsListner wl = new WindowsListner(){};
		addWindowListener(a);
	}
	public static void main(String[] args) {
		Project a = new Project();
	}
}