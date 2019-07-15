/*
승객수(pcount);
타다geton(int pcount);
내리다getout(int pcount);

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
		return "요금은 " +calPrice +" 입니다.";
	}

	String endDays(){
		
		sum += calPrice;
		return "오늘 번 총 요금은 " + sum + " 입니다.";

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