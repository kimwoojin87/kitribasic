package practice;
/*
public class ex4 {

	public static void main(String[] args) {
		//for 문을 이용하여 별삼각형을 출력하라
		String a = "*";

		for(int i = 0; i < 5; i++) {
			System.out.println(a);
			a = a+"*";
		}
	}
}
*/
public class ex4 {

	public static void main(String[] args) {
		int a = 1;
		String b = "%";
		
		for (int i = 0; i < 5; i++) {
				System.out.println(a);
			for(int j =0;j<5;j++) {	
				System.out.println(a+b);
				
			} 
		} 
	}
}