package com.kitri.thread;

public class RunnableTest {

	public static void main(String[] args) {
		Thread t1 = new Thread(new RunnalbeImpl("퐁"));//임플리먼츠 하는 방법도 있다.
		Thread t2 = new Thread(new RunnalbeImpl("당"));
		Thread t3 = new Thread(new RunnalbeImpl("!!!"));
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("프로그램 종료!!!");
		System.out.println("222222222222222");
	}

}
