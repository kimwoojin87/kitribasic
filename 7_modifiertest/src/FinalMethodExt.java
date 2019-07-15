public class FinalMethodExt extends FinalMethod{
	
	@Override
	public void a(){ //final method는 오버라이드 불가능하므로 오류가 남
		x = 30;
	}
}