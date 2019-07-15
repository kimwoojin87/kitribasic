public class OperTest1
{
	public static void main(String[] args) 
	{
		int x=126;
		System.out.println(x);   
		System.out.println(x++);   
		System.out.println(--x);   
		System.out.println(x++);   
		System.out.println(++x);   
		System.out.println(x--);   
		System.out.println(--x);   
		System.out.println(x++);   
		System.out.println(x);   

		boolean flag = true;
		System.out.println(flag);
		System.out.println(!flag);

		char c='a';
		System.out.println("c== " +c);
		System.out.println("(int)c== " + (int)c);
				
		int y = c;//자동형변환 변환가능한 데이터 타입이고 바이트 크기가 충분할때
		System.out.println("y== " +y);
			
		c = (char)y;//강제형변환 변환가능한 데이터 타입이고 바이트 크기가 부족할때
		System.out.println("c== " +c);

/*		boolean b = true; 불린은 숫자로 바꿀수없어 타입변환이 불가능하다.
		int z = b; */
		int z = 30;
		double d = z;
		//z = d; //error
		z = (int)d;

	}
}
