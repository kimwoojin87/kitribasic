package com.kitri.lang;

public class StringTest5 {

	public static void main(String[] args) {
		String str = "hello java !!!";
		int x = str.indexOf('a');
		System.out.println(str + "에서 a는 " + (x + 1) + "번째 있다.");
		// 자바는 0부터 시작하기떄문에 x+1로한것

		x = str.indexOf('a', 8);
		System.out.println(str + "에서 8번째 부터 a는 " + (x + 1) + "번째 있다.");

		x = str.indexOf("java");
		System.out.println(str + "에서 java는 " + (x + 1) + "번째 있다.");// 시작점을 말한다.

		x = str.lastIndexOf('a');
		System.out.println(str + "에서 끝에서 부터 a는 " + (x + 1) + "번째 있다.");// 마지막에 있는 a의 자리

		String str2 = "";
		System.out.println(str2 + "의 길이 : " + str2.length());
		if (str2.isEmpty())// 문자열의 길이가 0이라면
			System.out.println("빈문자열이다.");
		else
			System.out.println("str == " + str2);

		String str3 = "    hello       ";
		System.out.println(str3 + "의 길이 : " + str3.length());
		System.out.println(str3.trim() + "의 공백 제거 후의 길이 : " + str3.trim().length());
		//trim() 앞뒤의 공백은 제거해주지만 중간에 있는 공백은 제거되지않는다.
		
		String str4 = "jaba";
		System.out.println(str4+" :::: "+str4.replace('b', 'v'));//문자도 바꿀 수 있고.
		System.out.println(str4+" :::: "+str4.replace("jaba", "java"));//문자열도 바꿀 수 있다.1.5이상 버전
		System.out.println(str4+" :::: "+str4.replaceAll("jaba", "java"));
		//문자열도 바꿀 수 있다.1.4버전에 해당. 1.4버전 미만은 문자열 바꾸는게 없다.
		
		String str5 = "hello java !!!";
		String s[]	=	str5.split(" ");
		int len = s.length;
		for(int i = 0;i< len;i++) {
			System.out.println("s["+i+"] == "+ s[i]);
		}
		
		System.out.println(str5.substring(6));//자바는 0부터 시작된다.
		System.out.println(str5.substring(6,9));//6부터 9 전까지.
		
//		숫자 >>문자열로 바꾸고싶다.
		int num = 100;
		String sn1 = num + ""; //100이 문자열로 바뀌었으므로
		System.out.println(sn1 + 100);//100100이 나온다.
		String sn2 = String.valueOf(num); // 스트링이 가지고있는 밸류오브
		System.out.println(sn2 + 100);//다 같은
		String sn3 = Integer.toString(num); //인티져가 가지고있는 투 스트링
		System.out.println(sn3 + 100);//상황이다.
		
//		문자열 >> 숫자로 바꾼다.
		String ns = "100";
		num = Integer.parseInt(ns);// 문자열을 숫자로 바꿔라는 이것밖에 없음.
		System.out.println(num+100);
	}

}
