package com.kitri.util.jcf;

import java.util.*;



public class CollectionTest {

	
	
	public static void main(String[] args) {

//		Collection coll = new ArrayList();  // ��̸���Ʈ�� �����߱⋚���� ������� ���ִ�.
		Collection coll = new HashSet();    // �ؽü��̱⋚���� ������ ���������ʴ´�. 
		System.out.println("�ʱ� ũ�� : " + coll.size());
		coll.add("ȫ�浿");
		coll.add("�̼���");
		coll.add("������");
		coll.add("������");
		coll.add("�̼���"); //�ؽ����� �ߺ��� ��������ʴ´�.
//		coll.add(new Integer(10));
		System.out.println("������ ũ�� : " + coll.size()); // ũ�Ⱑ �������̴�.
		
		Object ob[] = coll.toArray(); 
		
		int len = ob.length;
		for (int i = 0; i < len; i++) {
			System.out.println((String) ob[i]); //�÷����� ����. ���Ë����� ����ȯ�ؾ���
		}
		
		
	}

}
