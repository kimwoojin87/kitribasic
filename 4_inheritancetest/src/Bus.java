/*
�°���(pcount);
Ÿ��geton(int pcount);
������getout(int pcount);

*/
public class Bus extends Car{
	int pcount;
	int Price = 1000;
	int calPrice;
	int sum;


	
	
	public Bus(String carName,String color,String maker){
		super (carName,color,maker); 
	}


	void geton(int pcount){
		this.pcount += pcount;
	}

	String getout(int pcount){
		calPrice = pcount*Price;
		return "����� " +calPrice +" �Դϴ�.";
	}

	String endDays(){
		
		sum += calPrice;
		return "���� �� �� ����� " + sum + " �Դϴ�.";

	}

	@Override
		int speedUp(int speed){
		if(speed<100){
		this.speed += speed;
		}
		else{
			this.speed= 99;
		}
		return this.speed;
	}
	@Override
		int speedDown(int speed){
		this.speed -= speed;
		if(this.speed <0)
			stop();
		return this.speed;
	}


}