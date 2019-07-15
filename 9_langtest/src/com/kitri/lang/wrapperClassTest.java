package com.kitri.lang;


//  wrapper Class : �⺻DT�� Ŭ����ȭ ��Ų ��
//  �⺻ DT		wrapperClass
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
			System.out.println("b2�� true��.");
		if(b3)
			System.out.println("b3�� true��.");
		
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
		
		//autoboxing (������ wrapper class���� ���� ������ Ÿ�Ը� ������)
		Integer i2 = new Integer(3);
		//unboxing
		int y = i2;
		//boxing
		Integer i3 = y;
		
	}

}
