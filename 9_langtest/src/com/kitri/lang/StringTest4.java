package com.kitri.lang;

//import java.io.UnsupportedEncodingException;

public class StringTest4 {

	public static void main(String[] args) { //throws UnsupportedEncodingException {
		String str = "abcdef";
		byte b[] = str.getBytes();//����Ʈ���� �ɰ��� �迭�� �ִ� ���
		int len = b.length;
		for(int i =0;i<len;i++) {
			System.out.println("b["+i+"] ==" + b[i]);
		}

		String str2 = "�ȳ��ϼ���.";
		byte b2[] = str2.getBytes();//����Ʈ���� �ɰ��� ���
//		byte b2[] = str2.getBytes("utf-8"); utf-8�� �ɰ��� 3����Ʈ �̹Ƿ� 3���ھ� ����.
		int len2 = b2.length;
		for(int i =0;i<len2;i++) {
			System.out.println("b2["+i+"] ==" + b2[i]);
		}
		
		char c[] = str2.toCharArray();// ĳ���ͺ��� �ɰ��� ���.
		len = c.length;
		for(int i=0;i<len;i++) {
			System.out.println("c["+i+"] == "+c[i]);
		}
		
	}
}
