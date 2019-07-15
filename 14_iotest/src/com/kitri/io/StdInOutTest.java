package com.kitri.io;

import java.io.IOException;

public class StdInOutTest {

	public static void main(String[] args) {
		try {
//			int x = System.in.read(); //처음의 하나만 읽어들인다.
//			System.out.println("x == "+x); 
//			System.out.println("x == "+(char)x); 
			
			
			System.out.print("입력2 : ");
			byte b[] = new byte[100];
			int x= System.in.read(b);// \n이 들어가있기떄문에 2개의 바이트가 추가되어있다.
			System.out.println("2. x == " +x);
			
			int len = b.length;
			for (int i = 0; i < len; i++) {
				System.out.println(b[i]);
			}
			String s = new String(b , 0 ,x - 2);
			System.out.println("s == "+s);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
