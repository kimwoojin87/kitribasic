public class CarUser{
	public static void main(String[] args) {
		Car car1 = null;//선언. 레퍼런스 데이타타입은 null로 초기화.자바에서의 null은 참조할 값이 없다.
		car1 = new Car();

		System.out.println("1. 차이름 : " + car1.carName + " 색상: " + car1.color +" 제조사: " + car1.maker);
		car1.carName = "쏘나타";
		car1.color = "검정색";
		car1.maker = "현대";
		System.out.println("2. 차이름 : " + car1.carName + " 색상: " + car1.color +" 제조사: " + car1.maker);




		Car car2 = new Car();
		System.out.println("z. 차이름 : " + car2.carName + " 색상: " + car2.color +" 제조사: " + car2.maker);
		car2.carName = "K5";
		car2.color = "흰색";
		car2.maker = "기아";
		System.out.println("ZZ. 차이름 : " + car2.carName + " 색상: " + car2.color +" 제조사: " + car2.maker);
		System.out.println("car1 : " + car1);
		System.out.println("car2 : " + car2);

		System.out.println("최초 " + car1.carName + "의 속도 : " + car1.speed);
		System.out.println("car1의 속도를 2회 증가!!!");
		car1.speedUp();
		car1.speedUp();
		System.out.println("2회증가후 " + car1.carName + "의 속도 : " + car1.speed);
		System.out.println("car1의 속도를 8회 증가!!!");
		for(int i=0;i<8;i++){
			car1.speedUp();
		}
		System.out.println("8회증가후 " + car1.carName + "의 속도 : " + car1.speed);
		System.out.println("car1의 속도를 4회 감소!!!");
		for(int i=0;i<4;i++){
			car1.speedDown();
		}
		System.out.println("4회감소후 " + car1.carName + "의 속도 : " + car1.speed);
		System.out.println("car1의 속도를 10회 감소!!!");
		for(int i=0;i<10;i++){
			car1.speedDown();
		}
		System.out.println("10회감소후 " + car1.carName + "의 속도 : " + car1.speed);


	}
}