package practice;

public class ex2 {

	public static void main(String[] args) {
		// while문과 Math.random()메소드를 이용해서 눈의 합이 5가 아니면 주사위를 계속 던지고 5이면 실행을 멈춰라 
		int x = 0;
		int y = 0;
		
		while(x + y != 5) {
			x = (int)(Math.random()*6+1);
			y = (int)(Math.random()*6+1);
			System.out.println("("+x+" , "+y+")");
		}
	}
}
