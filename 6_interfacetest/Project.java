import java.awt.*;


public class Project extends Frame{
	Project(){
		super("색깔이 5초마다 변하는 배경");
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