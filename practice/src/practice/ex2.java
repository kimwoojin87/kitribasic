package practice;

public class ex2 {

	public static void main(String[] args) {
		// while���� Math.random()�޼ҵ带 �̿��ؼ� ���� ���� 5�� �ƴϸ� �ֻ����� ��� ������ 5�̸� ������ ����� 
		int x = 0;
		int y = 0;
		
		while(x + y != 5) {
			x = (int)(Math.random()*6+1);
			y = (int)(Math.random()*6+1);
			System.out.println("("+x+" , "+y+")");
		}
	}
}
