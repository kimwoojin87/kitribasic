package constructor;

/*
1. 반지름 radius
2. 넓이 : calcArea() 반지름x반지름x3.14
   둘레 : calcRound() 2x3.14x반지름
*/
public class Circle {
	
	int radius;

	public Circle(){
		this(4);
	}
	public Circle(int radius){
		this.radius = radius;
	}

	double calcArea(){
		return Math.pow(radius, 2)*Math.PI;
	}

	double calcRound(){
		return radius*2*Math.PI;
	}

	String info(){
		return "반지름이 "+ radius + " 인 원의 넓이는 " + calcArea() +" 둘레는 " + calcRound()+" 입니다.";
	}

} //static 으로 생성되어있는 객체는 객체생성없이 클래스이름으로 접근가능하다.-공유-