package practice;

public class ex3 {

/*	public static void main(String[] args) {
		// 중첩 for문을 이용하여 방정식 4x+5y = 60의 모든 해를 구해서 x,y형태로 출력하라 단 x와 y는 10이하의 자연수
		for(int i=0;i<11;i++) {			
			for(int j=0;j<11;j++) {
				int x = i;
				int y = j;
				if(4*x+5*y==60) {
					System.out.println(x+" , "+y);
				}
			}
		}
	}*/
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		while(4*x+5*y !=60) {
			x= (int)(Math.random()*10+1);
			y= (int)(Math.random()*10+1);
			System.out.println(x+" "+y);
		}
	}
}