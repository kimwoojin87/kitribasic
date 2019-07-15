package com.kitri.io;

import java.io.*;

public class ReaderTest {

	public static void main(String[] args) {
		Reader in = null;
		try {
			in = new InputStreamReader(System.in);
			char c[] = new char[100];
			System.out.println("입력 : ");
			int x = in.read(c);//읽어드린 문자수. 원칙적으로 따지면 \n\r 이기에 2글자가 늘어나는 것
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
