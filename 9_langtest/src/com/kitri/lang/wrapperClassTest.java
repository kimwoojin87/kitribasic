package com.kitri.lang;


//  wrapper Class : 기본DT을 클래스화 시킨 것
//  기본 DT		wrapperClass
//  boolean		Boolean
//  char		Character
//  byte		Byte
//  short		Short
//  int			Integer
//  long		Long
//  float		Float
//  double		Double




public class wrapperClassTest {

	public static void main(String[] args) {
		Boolean b1 = new Boolean("true");
		boolean b2 = b1.booleanValue();
		
		boolean b3 = Boolean.parseBoolean("true");
		
		if(b2)
			System.out.println("b2는 true다.");
		if(b3)
			System.out.println("b3는 true다.");
		
		String s = "123";
		System.out.println(s+4);
//		int x = (int) s;
//		Integer i = new Integer(s);
//		int x = i.intValue();
		
		int x = Integer.parseInt(s);
		System.out.println(x+4);//127
		
		s="123.45";
		Double d = Double.parseDouble(s);
		System.out.println(d+4);//127.45
		
		//autoboxing (조건은 wrapper class에서 같은 데이터 타입만 가능함)
		Integer i2 = new Integer(3);
		//unboxing
		int y = i2;
		//boxing
		Integer i3 = y;
		
	}

}
