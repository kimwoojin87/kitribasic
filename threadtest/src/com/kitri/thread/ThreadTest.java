package com.kitri.thread;

public class ThreadTest {

	public static void main(String[] args) {
		Thread t1 = new ThreadExt("퐁");
		Thread t2 = new ThreadExt("당");
		Thread t3 = new ThreadExt("!!!");
		
//		t1.run();
//		t2.run();
//		t3.run();
//		
		t1.start();
		t2.start();//스케쥴러가 처리하기떄문에 동시다발적으로 처리한다.
		t3.start();
		
		System.out.println("프로그램 종료!!!");
		System.out.println("222222222222222");
	}
}
