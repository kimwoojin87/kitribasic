package com.kitri.io;

import java.io.*;

public class ReaderTest {

	public static void main(String[] args) {
		Reader in = null;
		try {
			in = new InputStreamReader(System.in);
			char c[] = new char[100];
			System.out.println("�Է� : ");
			int x = in.read(c);//�о�帰 ���ڼ�. ��Ģ������ ������ \n\r �̱⿡ 2���ڰ� �þ�� ��
			System.out.println("x == "+x);
			String str = new String(c,0,x-2);
			System.out.println(str);
			
			int len = c.length;
			for (int i = 0; i < len; i++) {
				System.out.println(c[i]);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
