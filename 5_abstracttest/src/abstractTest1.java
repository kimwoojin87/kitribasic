import java.util.*;

public class abstractTest1{
	public static void main(String[] args) {
		// 1. 하위 클래스 참조
		//Calendar cal = new Calendar(); 추상클래스인 뉴 칼렌다는 안되지만 하위클래스인 
		//그레고리안칼렌더는 추상클래스가 아니므로 뉴가 된다
		//Calendar cal = new GregorianCalendar();

		// 2. 자신의 객체를 return 하는 static method.를 찾아보면 된다.
		Calendar cal = Calendar.getInstance();

		int y = cal.get(Calendar.YEAR);
		int m = cal.get(Calendar.MONTH)+1;
		int d = cal.get(Calendar.DATE);
		int h = cal.get(Calendar.HOUR_OF_DAY);
		int mi = cal.get(Calendar.MINUTE);
		int s = cal.get(Calendar.SECOND);
		
		System.out.println(y+"년 "+m+"월 "+d+"일 "+h+"시 "+mi+"분 "+s+"초 ");
	}
}