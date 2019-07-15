package com.kitri.lang;

//import java.io.UnsupportedEncodingException;

public class StringTest4 {

	public static void main(String[] args) { //throws UnsupportedEncodingException {
		String str = "abcdef";
		byte b[] = str.getBytes();//바이트별로 쪼개서 배열에 넣는 기능
		int len = b.length;
		for(int i =0;i<len;i++) {
			System.out.println("b["+i+"] ==" + b[i]);
		}

		String str2 = "안녕하세요.";
		byte b2[] = str2.getBytes();//바이트별로 쪼개는 기능
//		byte b2[] = str2.getBytes("utf-8"); utf-8로 쪼개면 3바이트 이므로 3글자씩 나옴.
		int len2 = b2.length;
		for(int i =0;i<len2;i++) {
			System.out.println("b2["+i+"] ==" + b2[i]);
		}
		
		char c[] = str2.toCharArray();// 캐릭터별로 쪼개는 기능.
		len = c.length;
		for(int i=0;i<len;i++) {
			System.out.println("c["+i+"] == "+c[i]);
		}
		
	}
}
