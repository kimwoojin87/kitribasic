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
		System.out.println("e�� " + (str.indexOf('e')+1) + "��°�� �ֽ��ϴ�");
		
		for (int i = len-1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
//		int x = a1.indexOf("e");
//		System.out.println(a1 + "���� e�� " + (x + 1) + "��° �ִ�.");
		
//		Hello Java !!! �� �ٲپ��. �ּ� 3������ ������.
		
//		������ ������ e�� 2���� �ֽ��ϴ�.

	}

}
