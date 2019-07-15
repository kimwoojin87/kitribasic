package freetest5;

public class Car {

	String color;
	int account;
	
	public Car() {
		
	}
	
	public Car(String color,int account) {
		super();
		this.color = color;
		this.account = account;
	}
	

	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}
	

	@Override
	public String toString() {
		return "[색상]"+" " + color + "\t"+ "[생산수량]" +" " +account + "\t";
	}


}
