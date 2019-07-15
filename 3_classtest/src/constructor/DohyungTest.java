package constructor;

public class DohyungTest{
	public static void main(String[] args) {
		//Rect r1;
		//4각형은 가로가 4이고 세로가 3인 사각형의 넓이는 12이고 둘레는 14입니다.
		Rect rect1 = new Rect();
		System.out.println(rect1.info());
		//Rect r2;
		Rect rect2 = new Rect(5,7);
		System.out.println(rect2.info());

		//내 맘대로 가로와 세로를 정해서 넓이와 둘레를 구하라

		//Circle c1;
		//반지름이 4인 원의 넓이는 48.xxx이고 둘레는 24.xxx입니다.
		Circle c1 = new Circle();
		System.out.println(c1.info());

		Circle c2 = new Circle(5);
		System.out.println(c2.info());
		//내 맘대로 반지름을 정해서 넓이와 둘레를 구하라.

		
	}
}