public class PointCard{
	int point;
	String name;

	public PointCard(String name){
		this.name = name;
		
	}

	public int visit(){
		point++;
		return point;
	}

}