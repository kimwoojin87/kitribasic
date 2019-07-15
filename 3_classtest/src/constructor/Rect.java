package constructor;

/*
1.가로 width,세로 height
2.넓이 : calcArea()
  둘레 : calcRound()
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
		return "사각형은 가로가 "+width+"이고 세로가 "+height+"인 사각형의 넓이는 "+calcArea()+" 이고 둘레는 "+calcRound()+" 입니다.";
	}
}