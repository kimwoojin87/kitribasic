package com.kitri.exception.runtime;

import java.util.Random;

public class ArithMeticTest {

	
	
	public static void main(String[] args) {

		Random random = new Random();
		int x = 30;
//		RuntimeException�� logic���� ó���Ѵ�.
//		int y = random.nextInt(5);//���������� ���α׷��� �� ����Ǵµ� 
//		try {
//		int z = x/y;
//		System.out.println(x + " / "+y+" = "+z);
//		}catch(ArithmeticException e) {
//			System.out.println(e.getMessage());
//			System.out.println("0���� ���� �� �����ϴ�.");
//		}//��ȿ������ ���. ��Ÿ���ͼ����� Ʈ����ĳġ�ϴ� ���� �ƴϰ� �������� ó���ؾ���
//		�ذ��� 1.
//		int y = random.nextInt(4)+1; 
//		int z = x/y;
//		System.out.println(x + " / "+y+" = "+z);
//      �ذ� ��� 2.		
		int y = random.nextInt(4)+1; 
		if(y != 0) {
			int z = x/y;
		System.out.println(x + " / "+y+" = "+z);
		}else
		System.out.println("0���� ���� �� �����ϴ�");
	}

}
