package com.kitri.exception.runtime;

public class IndexBoundsTest {

	
	public static void main(String[] args) {

		String s[] = {"1","2","3","4"};
//		for(int i = 0;i<=4;i++) {
//			System.out.println(s[i]);
//		}
		int len = s.length;//배열의 길이는 숫자보다 렝쓰로 쓰는것이 좋다.
		for(int i = 0;i<len;i++) {
			System.out.println(s[i]);
		}
		
		String str = "hello";
		len = str.length();
		for(int i = 0 ; i < len ;i++) {
			System.out.println(str.charAt(i));
		}
		
	}

}
