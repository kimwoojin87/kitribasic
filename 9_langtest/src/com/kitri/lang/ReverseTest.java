package com.kitri.lang;

public class ReverseTest {

	public static void main(String[] args) {
		String str = "!!! avaJ olleH";
		char[] a = str.toCharArray();
		int len = str.length();
		char[] a1 = new char[len];
		System.out.println(str.length());
		for(int i=len-1;i>=0;i--) {
//			System.out.println(i+ "==" + a[i]);
			a1[len-1-i]=a[i];
		}
		str = String.valueOf(a1);
		System.out.println(str);
		System.out.println("e는 " + (str.indexOf('e')+1) + "번째에 있습니다");
		
		for (int i = len-1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
//		int x = a1.indexOf("e");
//		System.out.println(a1 + "에서 e는 " + (x + 1) + "번째 있다.");
		
//		Hello Java !!! 로 바꾸어라. 최소 3가지로 만들어라.
		
//		뒤집은 다음에 e는 2번쨰 있습니다.

	}

}
