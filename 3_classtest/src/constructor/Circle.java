package constructor;

/*
1. ������ radius
2. ���� : calcArea() ������x������x3.14
   �ѷ� : calcRound() 2x3.14x������
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
		return "�������� "+ radius + " �� ���� ���̴� " + calcArea() +" �ѷ��� " + calcRound()+" �Դϴ�.";
	}

} //static ���� �����Ǿ��ִ� ��ü�� ��ü�������� Ŭ�����̸����� ���ٰ����ϴ�.-����-