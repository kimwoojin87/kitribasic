package com.kitri.thread;

public class RunnalbeImpl implements Runnable{

	String msg;
	
	public RunnalbeImpl(String msg) {
		this.msg = msg;
	}
	
	@Override
	public void run() {
		for(int i=0;i<500;i++) {
			System.out.println(msg);
		}
	}

}
