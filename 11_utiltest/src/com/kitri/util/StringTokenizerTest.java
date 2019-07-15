package com.kitri.util;

import java.util.StringTokenizer;
import java.util.UUID;

public class StringTokenizerTest {

	public static void main(String[] args) {
		String str = "hello java !!!";
		StringTokenizer st = new StringTokenizer(str);// �ƹ��͵� ������ ���ϸ� ������ ������ ��ū�� �з��Ѵ�.
		int cnt = st.countTokens();
		System.out.println("��ū�� : " + cnt);// ��ū�� 3��

		StringTokenizer st1 = new StringTokenizer(str, "j");// j�� �������� ��ū�� ������
		int cnt1 = st1.countTokens();
		System.out.println("��ū�� : " + cnt1);// ��ū�� 2��

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

		str = "TO|��ȿ��|�ȳ��ϼ���";//�� ���� �������� 2������ ����� 3������ �޽���
		StringTokenizer st2 = new StringTokenizer(str,"|");
		String protocol = st2.nextToken();
		String to = st2.nextToken();
		String msg = st2.nextToken();
		System.out.println("��� : "+protocol);
		System.out.println("�������� : "+to);
		System.out.println("������ �޼��� : "+msg);
		
		System.out.println(UUID.randomUUID());//���Ϲ��� ���� �ĺ�
		
	}

}
