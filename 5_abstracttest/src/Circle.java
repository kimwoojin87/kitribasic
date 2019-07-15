public class Circle extends Dohyung{
	
	int radius;
	double pi = Math.PI;

	public Circle(int radius){
			this.radius = radius;
		}

	@Override
	public double getArea(){
		return  radius*radius*pi ;
	}
	@Override
	public double getRound(){
		return  2*radius*pi;
	}
}