public class Car{
	
	public String carName;//전역변수
	String color;  //초기화 하지않으면 자동으로 null로 표기됨.
	String maker;  //
	int speed;     //

	//public Car() {} 생성자를 만들지 않으면 디폴트 생성자가 내부적으로 숨어있다. 생성자는 리턴타입을 사용하지않음.

	public void speedUp() {
		speed += 10; //지역변수에는 접근제어자를 사용할 수 없다.
	}

	public void speedDown() {
		speed -= 10;
		if(speed<0)    //if,for에 한줄코딩일경우 중괄호 생략가능 {}
			stop();    //변수나 클래스는 자기 것일경우 객체를 안써도됨.
	}
	
	public void stop(){
		speed = 0;
	}
	
}