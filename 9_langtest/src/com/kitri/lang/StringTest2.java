package com.kitri.lang;

import java.io.UnsupportedEncodingException;

public class StringTest2 {

	public static void main(String[] args) throws UnsupportedEncodingException {
//		String str1 = null;
		String str1 = new String();//"" 
		System.out.println("���ڿ� ���� : "+ str1.length());
		
		//byte b[] = { 97, 98, 99, 100};//�ƽ�Ű�ڵ尪�� �������ֱ⋚����
		byte b[] = { -66, -56, -77, -25, -57, -49, -68, -68, -65, -28, 46};//�ƽ�Ű�ڵ尪�� �������ֱ⋚����
		String str2 = new String(b);
		//String str2 = new String(b, "euc=kr");
		System.out.println("str2 == "+ str2);//ȭ�鿡�� ���ڿ��� ���´�.
		
		byte b2[] = { -20, -107, -120, -21, -123, -107, -19, -107, -104, -20,-124,-72,-20,-102,-108,46};
			//euc-kr�� 2����Ʈ�� �ɰ����� ����Ʈ ���ڿ�. �� ������ utf-8�� �ɰ��⋚���� 3����Ʈ�� ó���ȴ�.���ڸ� �׸��� ����.
		String str3 = new String(b2, "utf-8");
		System.out.println("str2 == "+ str3);//ȭ�鿡�� ���ڿ��� ���´�. String(byte[] bytes, Charset charset)
		
		
		byte b3[] = { 97, 98, 99, 100, 101,102,103,104};
		String str4 = new String(b3 ,2, 4);//99,100,101,102
		System.out.println("str4 == "+str4);
		//����Ʈ�迭���� ��𼭺��� ������ �̰ڴ�.String(byte[],offset,length)
		
		//char c[] = {'a','b','c','d','e','f'};
		char c[] = {'��','��','��','��','��','.'}; //�ѱ� ǥ���ϱⰡ ����.
		String str5 = new String(c);
		System.out.println("str5 == " + str5);
		
		String str6 = new String(c,2,4);
		System.out.println("str6 == " + str6);
		
		
	}

}
