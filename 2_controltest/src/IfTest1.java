public class IfTest1{
	public static void main(String[] args) {
		int x = 10;
		int y = 70;
		if(x > y) {
			System.out.println("x가 크다");
		}
		//당신은 남자입니다 여자입니다.
		int jumin = 2;
		if(jumin % 2 ==0 ){
			System.out.println("여자");
		}
		if(jumin % 2 !=0){
		System.out.println("남자");
		}

		String gender = "남자";
		if(jumin % 2 ==0){
			gender = "여자";
		}
		System.out.println(gender);


		System.out.println("프로그램 종료!!!");
	}
}