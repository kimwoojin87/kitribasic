package com.kitri.lang;

public class StringTest1 {

	public static void main(String[] args) {
		String s1 = "java"; //���ͷ� ��İ� new����� ��������� ������ �ٸ���.
		String s2 = "java"; // ���ڿ� ����� ���� ���ڿ��� ���� ��� �ּҰ��� �޾ƿ´�.
		String s3 = new String("java"); // 
		String s4 = new String("java"); // ��Ʈ�� Ŭ������ �ִ� �������� �ּҰ��� �ƴ϶� ���ڿ��� ���Ѵ�.
		
		if(s1 == s2)
			System.out.println("s1 s2�� �ּҰ��� ����.");//o
		if(s1 == s3)
			System.out.println("s1 s3�� �ּҰ��� ����.");//x
		if(s1 == s4)
			System.out.println("s1 s4�� �ּҰ��� ����.");//x
		if(s2 == s3)
			System.out.println("s2 s3�� �ּҰ��� ����.");//x
		if(s2 == s4)
			System.out.println("s2 s4�� �ּҰ��� ����.");//x
		if(s3 == s4)
			System.out.println("s3 s4�� �ּҰ��� ����.");//x
		
		System.out.println("====================================");
		
		
		if(s1.equals(s2))
			System.out.println("s1 s2�� ���ڿ����� ����.");//o
		if(s1.equals(s3))
			System.out.println("s1 s3�� ���ڿ����� ����.");//o
		if(s1.equals(s4))
			System.out.println("s1 s4�� ���ڿ����� ����.");//o
		if(s2.equals(s3))
			System.out.println("s2 s3�� ���ڿ����� ����.");//o
		if(s2.equals(s4))
			System.out.println("s2 s4�� ���ڿ����� ����.");//o
		if(s3.equals(s4))
			System.out.println("s3 s4�� ���ڿ����� ����.");//o
		
		
		System.out.println("============================");
		
		String s = "hello";
		System.out.println(s + " java");
		System.out.println(s.concat(" java"));
		s = s.concat(" java");
		System.out.println(s);//��Ʈ���� �Һ���. ���� ��������� ���ڿ��� �ٲ����ʴ´�.
		
		
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb.append(" java"));
		System.out.println(sb);
		
		
	}

}
