package com.kitri.util;


import java.text.DecimalFormat;
import java.text.Format;

public class NumberFormatTest {

	public static void main(String[] args) {
		double number = 34563242365453.12678;
// 34,563,242,365,453.12 <--3�ڸ����� �ĸ��� ���ʹ�.�����ڸ��� �Ѿ�� �߸���������.
//		
		Format dash = new DecimalFormat("###,###,###,###.##");
		String f = dash.format(number);
		System.out.println(f);
		
	}

}
