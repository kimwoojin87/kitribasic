public class Car{
	String carName;
	String maker;
	String color; //
	int speed;
//������ ������

//public Car(){} --����Ʈ������ Ŭ������ ������ �ִ� ������ �����ҋ�, ��ü.xxxxx 
	public Car(){/*
		carName = "�Ÿ";
		color = "������";
		maker = "����";
		*/
		this("�Ÿ","������","����");
	   }
	public Car(String color){/*
		carName = "�Ÿ";
		this.color = color; // ���������� ���������� ����� ���� ���������� ����ϱ⶧����
		maker = "����";		// �ڱ� Ŭ������ ������ �� �ִ� this�� ����ؾ��Ѵ�.*/
		this("�Ÿ",color,"����");
	   }
	public Car(String carName,String color){/*
		this.carName = carName;
		this.color = color;
		maker = "����";*/
		this(carName,color,"����");  //this()�� �������� ù��° �ٿ����� ȣ�� ����.
	   }
	public Car(String carName,String color,String maker){
		//this(carName,color,maker); 
		//super(); 
		this.carName = carName;
		this.color = color;
		this.maker = maker;//
	   }
//��ü�� �����Ҷ� ��ü�� �ʱ�ȭ��Ų��.
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
		return maker + " ���� ���� " +color +" "+ carName;
	}


	@Override
	public boolean equals(Object obj){
		Car car = (Car) obj;
		//Bus t = (bus) obj;
		//if(carName == car.carName) // " " �� ���� true, new String("")�� ���� false.�����ϸ� ������Ʈ �񱳿� equals()���
		if(carName.equals(car.carName))
			return true;
		return false;
	}
	
}