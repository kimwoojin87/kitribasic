package com.kitri.thread;

public class RunnableTest {

	public static void main(String[] args) {
		Thread t1 = new Thread(new RunnalbeImpl("��"));//���ø����� �ϴ� ����� �ִ�.
		Thread t2 = new Thread(new RunnalbeImpl("��"));
		Thread t3 = new Thread(new RunnalbeImpl("!!!"));
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("���α׷� ����!!!");
		System.out.println("222222222222222");
	}

}
