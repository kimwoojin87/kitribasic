package com.kitri.exception.runtime;

import java.util.Random;

public class ArithMeticTest {

	
	
	public static void main(String[] args) {

		Random random = new Random();
		int x = 30;
//		RuntimeException은 logic으로 처리한다.
//		int y = random.nextInt(5);//정상적으로 프로그램이 잘 실행되는데 
//		try {
//		int z = x/y;
//		System.out.println(x + " / "+y+" = "+z);
//		}catch(ArithmeticException e) {
//			System.out.println(e.getMessage());
//			System.out.println("0으로 나눌 수 없습니다.");
//		}//비효율적인 방법. 런타임익셉션은 트라이캐치하는 것이 아니고 로직으로 처리해야함
//		해결방법 1.
//		int y = random.nextInt(4)+1; 
//		int z = x/y;
//		System.out.println(x + " / "+y+" = "+z);
//      해결 방법 2.		
		int y = random.nextInt(4)+1; 
		if(y != 0) {
			int z = x/y;
		System.out.println(x + " / "+y+" = "+z);
		}else
		System.out.println("0으로 나눌 수 없습니다");
	}

}
