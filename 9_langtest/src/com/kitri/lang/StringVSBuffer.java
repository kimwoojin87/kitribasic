package com.kitri.lang;

public class StringVSBuffer {

	public static void main(String[] args) {
		//���ڿ��� �����ҋ� ��Ʈ�� Ŭ������ �������� ��Ʈ�� ���۸� �������� ������ �������Ѵ�.
		
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
//500�� ����
//��Ʈ�� Ŭ���� �ɸ� �ð� 1137978 1101093 1134449
//��Ʈ������ �ɸ��ð� 236063 265250 210724    -- 5���� ����.

//5000�� ����
//��Ʈ�� Ŭ���� �ɸ� �ð� 43858642 66682020 43616164
//��Ʈ������ �ɸ� �ð� 1175183 1204371 1118733   -- 40���� ����.
//�������ڱ����� ����ϳ� ���ڿ��� ������� ��������� �ӵ����̰� ��������.