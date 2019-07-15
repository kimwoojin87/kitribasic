package constructor;

/*
1.���� width,���� height
2.���� : calcArea()
  �ѷ� : calcRound()
*/
public class Rect{
	int width;
	int height;

	public Rect(){
		this(3,4);
	}
	public Rect(int width,int height){
		this.width = width;
		this.height = height;
	}
	int calcArea(){
		return (width*height);
	}
	int calcRound(){	
		return (width*2+height*2);
	}

	String info(){
		return "�簢���� ���ΰ� "+width+"�̰� ���ΰ� "+height+"�� �簢���� ���̴� "+calcArea()+" �̰� �ѷ��� "+calcRound()+" �Դϴ�.";
	}
}