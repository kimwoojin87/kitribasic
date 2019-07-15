package com.kitri.lang;

public class StringTest3 {

	public static void main(String[] args) {
		String str = "hello java !!!";
		char c = str.charAt(4); // 4번쨰에 있는 캐릭터를 가져와라.자바는 0부터 시작함.
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
				System.out.println("숫자입니다."+str.charAt(i));
			}else {
				System.out.println("숫자가 아닙니다."+str.charAt(i));
			}
		}
		
		String str1 = "hello";
		String str2 = "java";
		System.out.println(str1 + str2);
		System.out.println(str1.concat(str2));//실제로 크게 쓰지않음.
		
		str = "hello java !!!";
		if(str.startsWith("h"))
			System.out.println(str + " 은 h로 시작한다. "); // 문자열이 들어갈수도있음.
		
		if(str.endsWith("!!"))
			System.out.println(str + " 은 !!!로 끝난다."); // 문자열이 들어갈수도있음. 문자열끝남.
		
		String s1 = "jAva";
		String s2 = "JavA";
		System.out.println("s1.toupperCase() == " + s1.toUpperCase());//모두 대문자로
		System.out.println("s2.toLowerCase() == " + s2.toLowerCase());//모두 소문자로
		if(s1.equals(s2))
			System.out.println(s1 + " 과 "+s2+" 는 같은 문자열이다.");
		else
			System.out.println(s1 + " 과 "+s2+" 는 다른 문자열이다.");
		
//		if(s1.toLowerCase().equals(s2.toLowerCase())) //이것과
		if(s1.equalsIgnoreCase(s2))					  //이것은 같은 것.
		System.out.println(s1 + " 과 "+s2+" 는 대소문자 구분없이 같은 문자열이다.");
		else
		System.out.println(s1 + " 과 "+s2+" 는 대소문자 구분없이 다른 문자열이다.");
		
		
	}
}
