package com.kitri.lang;

public class StringBufferTest1 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("hello "); //16���� ���������� ���ܳ��� ���������.
		System.out.println("1. sb1 == "+sb1);
		int cap = sb1.capacity();
		System.out.println("�ʱ� ũ�� : "+cap+"\t���ڿ� �� : "+sb1.length());
		sb1.append("java");
		System.out.println("2. sb1 == "+sb1);//��Ʈ�����۸� �̿��� ������ ������� �ݿ��ȴ�.
		
		String s = "hello ";
		s.concat("java");
		System.out.println(s); // �ּҰ��� �״���̱⋚���� �����Ǿ��ִ�.

		sb1.append(" !!!!!");
		System.out.println("3. sb1 == "+sb1);
		cap = sb1.capacity();
		System.out.println("�ʱ� ũ�� : "+cap+"\t���ڿ� �� : "+sb1.length());
		sb1.append(" !!!!!!");
		System.out.println("4. sb1 == "+sb1);
		cap = sb1.capacity();
		System.out.println("�ʱ� ũ�� : "+cap+"\t���ڿ� �� : "+sb1.length());
		//���ڿ��� �ʱ�ũ�⺸�� Ŀ���� ũ�Ⱑ �ڵ����� �þ��.
		sb1.insert(10, "@@@");
		System.out.println("5. sb1 == "+sb1);
		sb1.delete(10, 12);//substring�̶� �Ȱ���. a���� b������ ������Ų��. ����
		System.out.println("6. sb1 == "+sb1);
		sb1.deleteCharAt(10); // �ش�Ǵ� �ڸ��� ������
		System.out.println("7. sb1 == "+sb1);
		sb1.replace(6, 10, "�ڹ�");//a���� b������ ���ڿ��� �ٲ��!
		System.out.println("8. sb1 == "+sb1);
		sb1.reverse();//�����̴� �ѱ��̴� ������� ���ڿ��� �������ش�.
		System.out.println("9. sb1 == "+sb1);
		sb1.reverse();//�����̴� �ѱ��̴� ������� ���ڿ��� �������ش�.
		System.out.println("10. sb1 == "+sb1);
		sb1.setCharAt(9, '@'); // a��°�� �ִ� ���� b�� �ٲ��.
		System.out.println("11. sb1 == "+sb1);//���� ����ִ� ���� ��Ʈ���� �ƴϰ� ��Ʈ�� �����̴�.
		
		String s1 = new String(sb1); // ��Ʈ�����۸� ��Ʈ��Ŭ������ �������.
		String s2 = sb1.toString();  // ��Ʈ�����۸� ��Ʈ��Ŭ������ �������.
		
		String str = "hello �ڹ� !!!";
		String findStr = "�ڹ�";
//		String findStr = "����Ŭ"; // ����Ŭ�� �����ϴ�.
		String replaceStr = "java";
		
		int start = str.indexOf(findStr);
		System.out.println(start);
		if(start != -1) {
			StringBuffer str1 = new StringBuffer(str);
			int end = start + findStr.length();
			str1.replace(start, end, replaceStr);
			System.out.println(str1);
		}else {
			System.out.println(findStr + " �� �����ϴ�.");
		}
				//��Ʈ�� Ŭ������ �ִ� ���÷��̽� ����������� hello java !!! �� ȣ��
		
		
	}

}
