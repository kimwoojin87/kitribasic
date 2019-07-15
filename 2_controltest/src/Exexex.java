public class Exexex{
	public static void main(String[] args) {
		int x =(int)(Math.random()*6+1);
		int y =(int)(Math.random()*6+1);
		while(x+y!=5){
			x =(int)(Math.random()*6+1);
			y =(int)(Math.random()*6+1);
			System.out.println("("+x+" , "+y+")");
		}  System.out.println("눈의 합이 5이므로 종료합니다!!!");
	}
}