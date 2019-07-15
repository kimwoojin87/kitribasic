public class FinalVariable{
	
	final int x = 10;

	public void a() {
		x = 20;//final variable은 값 변경 불가능 ( 상수화 ) 이므로 오류가 남.
	}
}