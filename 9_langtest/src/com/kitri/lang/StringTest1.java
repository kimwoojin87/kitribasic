package com.kitri.lang;

public class StringTest1 {

	public static void main(String[] args) {
		String s1 = "java"; //리터럴 방식과 new방식은 만들어지는 영역이 다르다.
		String s2 = "java"; // 문자열 방식은 같은 문자열이 있을 경우 주소값만 받아온다.
		String s3 = new String("java"); // 
		String s4 = new String("java"); // 스트링 클래스에 있는 이퀄스는 주소값이 아니라 문자열을 비교한다.
		
		if(s1 == s2)
			System.out.println("s1 s2는 주소값이 같다.");//o
		if(s1 == s3)
			System.out.println("s1 s3는 주소값이 같다.");//x
		if(s1 == s4)
			System.out.println("s1 s4는 주소값이 같다.");//x
		if(s2 == s3)
			System.out.println("s2 s3는 주소값이 같다.");//x
		if(s2 == s4)
			System.out.println("s2 s4는 주소값이 같다.");//x
		if(s3 == s4)
			System.out.println("s3 s4는 주소값이 같다.");//x
		
		System.out.println("====================================");
		
		
		if(s1.equals(s2))
			System.out.println("s1 s2는 문자열값이 같다.");//o
		if(s1.equals(s3))
			System.out.println("s1 s3는 문자열값이 같다.");//o
		if(s1.equals(s4))
			System.out.println("s1 s4는 문자열값이 같다.");//o
		if(s2.equals(s3))
			System.out.println("s2 s3는 문자열값이 같다.");//o
		if(s2.equals(s4))
			System.out.println("s2 s4는 문자열값이 같다.");//o
		if(s3.equals(s4))
			System.out.println("s3 s4는 문자열값이 같다.");//o
		
		
		System.out.println("============================");
		
		String s = "hello";
		System.out.println(s + " java");
		System.out.println(s.concat(" java"));
		s = s.concat(" java");
		System.out.println(s);//스트링은 불변임. 새로 만들어지지 문자열이 바뀌진않는다.
		
		
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb.append(" java"));
		System.out.println(sb);
		
		
	}

}
