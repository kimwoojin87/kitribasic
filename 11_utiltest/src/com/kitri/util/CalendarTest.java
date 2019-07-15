package com.kitri.util;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarTest {

	public static void main(String[] args) {
		//2019년 03월 26일 오후 1시 17분 35초.
		
		Calendar a = new GregorianCalendar();
//		Calendar a = Calendar.getInstance();
		
		int y = a.get(Calendar.YEAR);
		int m = a.get(Calendar.MONTH)+1;
		int d = a.get(Calendar.DATE);
		int apm = a.get(Calendar.AM_PM);
		int h = a.get(Calendar.HOUR);
		int mi = a.get(Calendar.MINUTE);
		int s = a.get(Calendar.SECOND);
		
		System.out.println(y+"년 "+zeroplus(m)+"월 "
				+zeroplus(d)+"일 "+((apm == 0)?"오전":"오후")+" "
				+zeroplus(h)+"시 "+zeroplus(mi)+" 분"+zeroplus(s)+" 초");
		
		Date date = new Date();
		System.out.println(date.toString());
	}
	
	private static String zeroplus(int num) {
		return num<10 ? "0" +num : ""+num; //자기가 보내서 자기가 받는 건 스태이틱을 써도 된다.
	}

}
