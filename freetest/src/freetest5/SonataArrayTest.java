package freetest5;

import java.util.ArrayList;
import java.util.List;

public class SonataArrayTest {

	public static void main(String[] args) {
		
		Sonata car1 = new Sonata("���",5000,"�¿�","NF");
		Sonata car2 = new Sonata("����",7000,"����","Brilliant");
		Sonata car3 = new Sonata("��ȫ��",4000,"�ý�","EF");
		Sonata car4 = new Sonata("������",6000,"�¿�","Hybrid");
		
		List<String> list = new ArrayList<String>();
		list.add(car1.toString());
		list.add(car2.toString());
		list.add(car3.toString());
		list.add(car4.toString());
		
		int size=list.size();
		for (int i = 0; i < size; i++) {
			System.out.println(i+1+list.get(i));
		}
		

	}

}
