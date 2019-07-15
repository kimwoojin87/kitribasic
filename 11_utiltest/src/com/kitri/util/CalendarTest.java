package com.kitri.util;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarTest {

	public static void main(String[] args) {
		//2019�� 03�� 26�� ���� 1�� 17�� 35��.
		
		Calendar a = new GregorianCalendar();
//		Calendar a = Calendar.getInstance();
		
		int y = a.get(Calendar.YEAR);
		int m = a.get(Calendar.MONTH)+1;
		int d = a.get(Calendar.DATE);
		int apm = a.get(Calendar.AM_PM);
		int h = a.get(Calendar.HOUR);
		int mi = a.get(Calendar.MINUTE);
		int s = a.get(Calendar.SECOND);
		
		System.out.println(y+"�� "+zeroplus(m)+"�� "
				+zeroplus(d)+"�� "+((apm == 0)?"����":"����")+" "
				+zeroplus(h)+"�� "+zeroplus(mi)+" ��"+zeroplus(s)+" ��");
		
		Date date = new Date();
		System.out.println(date.toString());
	}
	
	private static String zeroplus(int num) {
		return num<10 ? "0" +num : ""+num; //�ڱⰡ ������ �ڱⰡ �޴� �� ������ƽ�� �ᵵ �ȴ�.
	}

}
