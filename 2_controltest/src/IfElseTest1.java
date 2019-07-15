public class IfElseTest1{
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		/*
		if(x > y){
			System.out.println(x + "는 " + y + "보다 크다.");
		}else {
		System.out.println(x + "는 " + y + "보다 작다.");
		}*/
		String big;
		if(x>y){
			big = "크다";
		}else {
			big = "작다";

			if(x==y){
				big = "같다";
			}

		}
		System.out.println(x + "는 " + y + "보다" + big);
		System.out.println("프로그램 종료!!!");
	}
}