public class TaxiGuest{
	public static void main(String[] args) {
		Taxi t1 = new Taxi();
		System.out.println("t1 >> " + t1.toString() + " 기본요금 :" + t1.basicPrice);

		Taxi t2 = new Taxi("K5","감홍색","기아");
		System.out.println("t2 >> " + t2.toString() + " 기본요금 :" +t2.basicPrice);

		int km = 20;
		t2.initPrice();
		System.out.println(t2 + "를 타고 구디에서 강남까지 " + km + "km이동!!!");
		int price = t2.calcPrice(km);
		t2.sumPrice();
		System.out.println("요금 : " + price + "원");
		System.out.println("누적 수익 : " + t2.totalPrice + "원");

		km = 20;
		t2.initPrice();
		System.out.println(t2 + "를 타고 강남에서 구디까지 " + km + "km이동!!!");
		price = t2.calcPrice(km);
		t2.sumPrice();
		System.out.println("요금 : " + price + "원");
		System.out.println("누적 수익 : " + t2.totalPrice + "원");

		int upDown = 50;
		System.out.println("t2의 속도를 " + upDown + "만큼 가속!!!");
		int speed = t2.speedUp(upDown);
		System.out.println("t2의 속도를 " + speed + " "+ t2.speed);

		upDown = 250;
		System.out.println("t2의 속도를 " + upDown + "만큼 가속!!!");
		speed = t2.speedUp(upDown);
		System.out.println("t2의 속도를 " + speed + " "+ t2.speed);

		System.out.println(t1 + "  " + t2); //오브젝트에 문자열이 나오면 toString()이 자동 호출된다.
		System.out.println(t1.toString() + "  " + t2.toString());


		Taxi t3 = new Taxi("K5","감홍색","기아");
		System.out.println(t2 + "  " + t3);
		System.out.println(t2.hashCode() + "  " + t3.hashCode());
		if(t2 == t3)//==(비교연산자)는 기본데이터타입일 경우에 값을 비교,참조형데이터타입일 경우는 주소값을 비교.
			System.out.println("t2와 t3는 주소값이 같은 차이다  ");
		else
			System.out.println("t2와 t3는 주소값이 다른 차이다  ");

		if(t2.equals(t3))//오브젝트가 가지고 있는 이퀄스라는 것도 주소값비교.
			System.out.println("t2와 t3는 차이름이 같은 차이다  ");
		else
			System.out.println("t2와 t3는 차이름이 다른 차이다  ");


		//Car car = new Car();

		Car car = new Taxi(); //오늘 어떻게 해서라도 이해해야함.
		Taxi t = new Taxi();
		t = (Taxi)car; //강제형변환후 컴파일이 가능한 이유는 택시가 카를 상속받았기 떄문에.
						//실행시에는 에러가 발생한다. 컴파일에선 문법검사만함.

		//String s = "123"; // 기본은 기본끼리 참조형은 참조형끼리
		//int x = (int)s; // 바꿀수 있는 타입이 되어야한다.


		//Calendar cal = new GregorianCalendar(); // 하위클래스 참조.

	}
}

