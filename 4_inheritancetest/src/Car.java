public class Car{
	String carName;
	String maker;
	String color; //
	int speed;
//생성자 재정의

//public Car(){} --디폴트생성자 클래스가 가지고 있는 변수를 접근할떄, 객체.xxxxx 
	public Car(){/*
		carName = "쏘나타";
		color = "검정색";
		maker = "현대";
		*/
		this("쏘나타","검정색","현대");
	   }
	public Car(String color){/*
		carName = "쏘나타";
		this.color = color; // 지역변수와 전역변수가 가까울 때는 지역변수를 사용하기때문에
		maker = "현대";		// 자기 클래스를 참조할 수 있는 this를 사용해야한다.*/
		this("쏘나타",color,"현대");
	   }
	public Car(String carName,String color){/*
		this.carName = carName;
		this.color = color;
		maker = "현대";*/
		this(carName,color,"현대");  //this()는 생성자의 첫번째 줄에서만 호출 가능.
	   }
	public Car(String carName,String color,String maker){
		//this(carName,color,maker); 
		//super(); 
		this.carName = carName;
		this.color = color;
		this.maker = maker;//
	   }
//객체를 생성할때 객체를 초기화시킨다.
	public void speedUp(){
		speed += 10;
	}
	int speedUp(int speed){
		this.speed += speed;
		return this.speed;
	}
	int speedDown(int speed){
		this.speed -= speed;
		if(this.speed <0)
			stop();
		return this.speed;
	}

	public void speedDown(){
		speed -= 10;
		if(speed <0)
			stop();
	}

	public void stop(){
		speed = 0;
	}

	@Override
	public String toString() {//info
		return maker + " 에서 만든 " +color +" "+ carName;
	}


	@Override
	public boolean equals(Object obj){
		Car car = (Car) obj;
		//Bus t = (bus) obj;
		//if(carName == car.carName) // " " 일 경우는 true, new String("")일 경우는 false.가능하면 오브젝트 비교엔 equals()사용
		if(carName.equals(car.carName))
			return true;
		return false;
	}
	
}