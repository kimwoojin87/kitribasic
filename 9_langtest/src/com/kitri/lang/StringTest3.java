package com.kitri.lang;

public class StringTest3 {

	public static void main(String[] args) {
		String str = "hello java !!!";
		char c = str.charAt(4); // 4������ �ִ� ĳ���͸� �����Ͷ�.�ڹٴ� 0���� ������.
		System.out.println("c == " + c);
		
		str = "123";
		int x = str.charAt(0)-48;//'1' 
		System.out.println("x == " + x);
		
		str = "1s34";
		int len = str.length();
		System.out.println("length == "+ len);
		for(int i=0; i< len; i++) {
			int num = str.charAt(i)-48;
			if (num > 0 && num <=9) {
				System.out.println("�����Դϴ�."+str.charAt(i));
			}else {
				System.out.println("���ڰ� �ƴմϴ�."+str.charAt(i));
			}
		}
		
		String str1 = "hello";
		String str2 = "java";
		System.out.println(str1 + str2);
		System.out.println(str1.concat(str2));//������ ũ�� ��������.
		
		str = "hello java !!!";
		if(str.startsWith("h"))
			System.out.println(str + " �� h�� �����Ѵ�. "); // ���ڿ��� ����������.
		
		if(str.endsWith("!!"))
			System.out.println(str + " �� !!!�� ������."); // ���ڿ��� ����������. ���ڿ�����.
		
		String s1 = "jAva";
		String s2 = "JavA";
		System.out.println("s1.toupperCase() == " + s1.toUpperCase());//��� �빮�ڷ�
		System.out.println("s2.toLowerCase() == " + s2.toLowerCase());//��� �ҹ��ڷ�
		if(s1.equals(s2))
			System.out.println(s1 + " �� "+s2+" �� ���� ���ڿ��̴�.");
		else
			System.out.println(s1 + " �� "+s2+" �� �ٸ� ���ڿ��̴�.");
		
//		if(s1.toLowerCase().equals(s2.toLowerCase())) //�̰Ͱ�
		if(s1.equalsIgnoreCase(s2))					  //�̰��� ���� ��.
		System.out.println(s1 + " �� "+s2+" �� ��ҹ��� ���о��� ���� ���ڿ��̴�.");
		else
		System.out.println(s1 + " �� "+s2+" �� ��ҹ��� ���о��� �ٸ� ���ڿ��̴�.");
		
		
	}
}
