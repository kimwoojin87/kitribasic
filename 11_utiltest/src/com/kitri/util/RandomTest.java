package com.kitri.util;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		
		Random random = new Random();
		boolean b = random.nextBoolean();//무작위로 참거짓을 대입할 수 있다.
		System.out.println("b === "+b);
		double d = random.nextDouble();
		System.out.println("d === "+d);
		int i = random.nextInt();
		System.out.println("i === "+i);
		int r = random.nextInt(256); // 0부터 입력한 인트값 범위까지의 무작위수 많이 사용함.
		System.out.println("r === "+r);
		
	}

}
