package com.kitri.util;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;



public class DateFormatTest {

	public static void main(String[] args) {
		// 2019.03.26 14:25:30 <--이 모양을 만들려면 칼렌다를 이용할 수 밖에 없는데..
		Date date = new Date();
		System.out.println(date);
		
		Format f = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		//심플포맷을 이용하면 간단하게 할 수 있다
		String today = f.format(date);
		System.out.println(today);
	}

}
