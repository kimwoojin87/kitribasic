public class Rect extends Dohyung{
	///오버라이드를 하지않으면 오류가 나지만 오버라이드를 하면 오류가 안난다. 즉 강제성을 띈다는 내용.

		int width;
		int height;

		public Rect(int width,int height){
			this.width = width;
			this.height = height;
		}

		@Override
		public double getArea(){
			return  width * height;
		}

		@Override
		public double getRound(){
			return  2*(width+height);
		}
}