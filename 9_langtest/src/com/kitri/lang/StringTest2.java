package com.kitri.lang;

import java.io.UnsupportedEncodingException;

public class StringTest2 {

	public static void main(String[] args) throws UnsupportedEncodingException {
//		String str1 = null;
		String str1 = new String();//"" 
		System.out.println("문자열 길이 : "+ str1.length());
		
		//byte b[] = { 97, 98, 99, 100};//아스키코드값을 가지고있기떄문에
		byte b[] = { -66, -56, -77, -25, -57, -49, -68, -68, -65, -28, 46};//아스키코드값을 가지고있기떄문에
		String str2 = new String(b);
		//String str2 = new String(b, "euc=kr");
		System.out.println("str2 == "+ str2);//화면에는 글자열이 나온다.
		
		byte b2[] = { -20, -107, -120, -21, -123, -107, -19, -107, -104, -20,-124,-72,-20,-102,-108,46};
			//euc-kr은 2바이트로 쪼개지는 디폴트 문자열. 현 예제는 utf-8로 쪼갰기떄문에 3바이트로 처리된다.글자를 그리는 개념.
		String str3 = new String(b2, "utf-8");
		System.out.println("str2 == "+ str3);//화면에는 글자열이 나온다. String(byte[] bytes, Charset charset)
		
		
		byte b3[] = { 97, 98, 99, 100, 101,102,103,104};
		String str4 = new String(b3 ,2, 4);//99,100,101,102
		System.out.println("str4 == "+str4);
		//바이트배열에서 어디서부터 어디까지 뽑겠다.String(byte[],offset,length)
		
		//char c[] = {'a','b','c','d','e','f'};
		char c[] = {'안','녕','하','세','요','.'}; //한글 표현하기가 편함.
		String str5 = new String(c);
		System.out.println("str5 == " + str5);
		
		String str6 = new String(c,2,4);
		System.out.println("str6 == " + str6);
		
		
	}

}
