public class DohyungTest{
	public static void main(String[] args) {
		Rect r1 = new Rect(4,3);
		//�������̵� �� ���� ����ض�. �߻�޼ҵ带 ����� �� ������ �������̵� �� �޽�带 ����ϰԵȴ�.

		System.out.println("���ΰ� " + r1.width + "�̰� ���ΰ� " +r1.height + "�� �簢���� ���̴� " 
			+ r1.getArea() + "�̰� �ѷ��� "+r1.getRound()+ "�Դϴ�.");
			

		Circle c1 = new Circle(4);
		System.out.println("�������� " + c1.radius + "�� ���� ���̴� " 
			+ c1.getArea() + "�̰� �ѷ��� "+c1.getRound()+ "�Դϴ�.");


		//Dohyung d = new Dohyung();
		Dohyung d1 = new Rect(5,7);
		System.out.println("�簢���� ���̴� " + d1.getArea() + "�̰� �ѷ��� "+d1.getRound()+ "�Դϴ�.");

		Rect r2 = (Rect) d1;

		System.out.println("���ΰ� " + r2.width + "�̰� ���ΰ� " +r2.height + "�� �簢���� ���̴� " 
			+ r2.getArea() + "�̰� �ѷ��� "+r2.getRound()+ "�Դϴ�.");

		//Circle c2 = (Circle) d1;//���������δ� ����ȯ ���������� �����ҋ��� ������ ����.
		
	}
}
