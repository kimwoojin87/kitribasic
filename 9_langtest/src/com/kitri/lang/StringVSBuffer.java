package com.kitri.lang;

public class StringVSBuffer {

	public static void main(String[] args) {
		//문자열을 결합할떄 스트링 클래스를 썼을떄와 스트링 버퍼를 썼을떄의 차이을 보려고한다.
		
		System.out.println(System.nanoTime());
		long st =System.nanoTime();
		String str = "hello ";
		for(int i = 0; i <5000;i++) {
			str += i;
		}
		
//		StringBuffer sb = new StringBuffer("hello ");
//		for(int i=0; i<5000;i++) {
//			sb.append(i);
//		}
		long et =System.nanoTime();
		long time = et -st;
		System.out.println(System.nanoTime() -st);
		
	}

}
//500번 돌림
//스트링 클래스 걸린 시간 1137978 1101093 1134449
//스트링버퍼 걸린시간 236063 265250 210724    -- 5배의 차이.

//5000번 돌림
//스트링 클래스 걸린 시간 43858642 66682020 43616164
//스트링버퍼 걸린 시간 1175183 1204371 1118733   -- 40배의 차이.
//일정숫자까지는 비슷하나 문자열이 길어지면 길어질수록 속도차이가 심해진다.