public class DohyungTest{
	public static void main(String[] args) {
		Rect r1 = new Rect(4,3);
		//오버라이드 된 놈을 기억해라. 추상메소드를 출력할 수 없으니 오버라이드 된 메쏘드를 출력하게된다.

		System.out.println("가로가 " + r1.width + "이고 세로가 " +r1.height + "인 사각형의 넓이는 " 
			+ r1.getArea() + "이고 둘레는 "+r1.getRound()+ "입니다.");
			

		Circle c1 = new Circle(4);
		System.out.println("반지름이 " + c1.radius + "인 원의 넓이는 " 
			+ c1.getArea() + "이고 둘레는 "+c1.getRound()+ "입니다.");


		//Dohyung d = new Dohyung();
		Dohyung d1 = new Rect(5,7);
		System.out.println("사각형의 넓이는 " + d1.getArea() + "이고 둘레는 "+d1.getRound()+ "입니다.");

		Rect r2 = (Rect) d1;

		System.out.println("가로가 " + r2.width + "이고 세로가 " +r2.height + "인 사각형의 넓이는 " 
			+ r2.getArea() + "이고 둘레는 "+r2.getRound()+ "입니다.");

		//Circle c2 = (Circle) d1;//문법적으로는 형변환 가능하지만 실행할떄는 오류가 난다.
		
	}
}

