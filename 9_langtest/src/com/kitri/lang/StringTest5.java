package com.kitri.lang;

public class StringTest5 {

	public static void main(String[] args) {
		String str = "hello java !!!";
		int x = str.indexOf('a');
		System.out.println(str + "���� a�� " + (x + 1) + "��° �ִ�.");
		// �ڹٴ� 0���� �����ϱ⋚���� x+1���Ѱ�

		x = str.indexOf('a', 8);
		System.out.println(str + "���� 8��° ���� a�� " + (x + 1) + "��° �ִ�.");

		x = str.indexOf("java");
		System.out.println(str + "���� java�� " + (x + 1) + "��° �ִ�.");// �������� ���Ѵ�.

		x = str.lastIndexOf('a');
		System.out.println(str + "���� ������ ���� a�� " + (x + 1) + "��° �ִ�.");// �������� �ִ� a�� �ڸ�

		String str2 = "";
		System.out.println(str2 + "�� ���� : " + str2.length());
		if (str2.isEmpty())// ���ڿ��� ���̰� 0�̶��
			System.out.println("���ڿ��̴�.");
		else
			System.out.println("str == " + str2);

		String str3 = "    hello       ";
		System.out.println(str3 + "�� ���� : " + str3.length());
		System.out.println(str3.trim() + "�� ���� ���� ���� ���� : " + str3.trim().length());
		//trim() �յ��� ������ ������������ �߰��� �ִ� ������ ���ŵ����ʴ´�.
		
		String str4 = "jaba";
		System.out.println(str4+" :::: "+str4.replace('b', 'v'));//���ڵ� �ٲ� �� �ְ�.
		System.out.println(str4+" :::: "+str4.replace("jaba", "java"));//���ڿ��� �ٲ� �� �ִ�.1.5�̻� ����
		System.out.println(str4+" :::: "+str4.replaceAll("jaba", "java"));
		//���ڿ��� �ٲ� �� �ִ�.1.4������ �ش�. 1.4���� �̸��� ���ڿ� �ٲٴ°� ����.
		
		String str5 = "hello java !!!";
		String s[]	=	str5.split(" ");
		int len = s.length;
		for(int i = 0;i< len;i++) {
			System.out.println("s["+i+"] == "+ s[i]);
		}
		
		System.out.println(str5.substring(6));//�ڹٴ� 0���� ���۵ȴ�.
		System.out.println(str5.substring(6,9));//6���� 9 ������.
		
//		���� >>���ڿ��� �ٲٰ��ʹ�.
		int num = 100;
		String sn1 = num + ""; //100�� ���ڿ��� �ٲ�����Ƿ�
		System.out.println(sn1 + 100);//100100�� ���´�.
		String sn2 = String.valueOf(num); // ��Ʈ���� �������ִ� �������
		System.out.println(sn2 + 100);//�� ����
		String sn3 = Integer.toString(num); //��Ƽ���� �������ִ� �� ��Ʈ��
		System.out.println(sn3 + 100);//��Ȳ�̴�.
		
//		���ڿ� >> ���ڷ� �ٲ۴�.
		String ns = "100";
		num = Integer.parseInt(ns);// ���ڿ��� ���ڷ� �ٲ��� �̰͹ۿ� ����.
		System.out.println(num+100);
	}

}