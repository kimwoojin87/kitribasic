package constructor;

public class DohyungTest{
	public static void main(String[] args) {
		//Rect r1;
		//4������ ���ΰ� 4�̰� ���ΰ� 3�� �簢���� ���̴� 12�̰� �ѷ��� 14�Դϴ�.
		Rect rect1 = new Rect();
		System.out.println(rect1.info());
		//Rect r2;
		Rect rect2 = new Rect(5,7);
		System.out.println(rect2.info());

		//�� ����� ���ο� ���θ� ���ؼ� ���̿� �ѷ��� ���϶�

		//Circle c1;
		//�������� 4�� ���� ���̴� 48.xxx�̰� �ѷ��� 24.xxx�Դϴ�.
		Circle c1 = new Circle();
		System.out.println(c1.info());

		Circle c2 = new Circle(5);
		System.out.println(c2.info());
		//�� ����� �������� ���ؼ� ���̿� �ѷ��� ���϶�.

		
	}
}