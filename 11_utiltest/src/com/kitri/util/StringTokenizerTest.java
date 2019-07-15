package com.kitri.util;

import java.util.StringTokenizer;
import java.util.UUID;

public class StringTokenizerTest {

	public static void main(String[] args) {
		String str = "hello java !!!";
		StringTokenizer st = new StringTokenizer(str);// 아무것도 지정을 안하면 공백을 가지고 토큰을 분류한다.
		int cnt = st.countTokens();
		System.out.println("토큰수 : " + cnt);// 토큰수 3개

		StringTokenizer st1 = new StringTokenizer(str, "j");// j를 기준으로 토큰을 나눠라
		int cnt1 = st1.countTokens();
		System.out.println("토큰수 : " + cnt1);// 토큰수 2개

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

		str = "TO|안효인|안녕하세요";//맨 앞이 프로토콜 2번쨰가 대상자 3번쨰가 메시지
		StringTokenizer st2 = new StringTokenizer(str,"|");
		String protocol = st2.nextToken();
		String to = st2.nextToken();
		String msg = st2.nextToken();
		System.out.println("기능 : "+protocol);
		System.out.println("누구에게 : "+to);
		System.out.println("보내는 메세지 : "+msg);
		
		System.out.println(UUID.randomUUID());//유니버설 고유 식별
		
	}

}
