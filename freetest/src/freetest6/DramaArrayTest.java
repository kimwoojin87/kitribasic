package freetest6;


import java.util.ArrayList;
import java.util.List;



public class DramaArrayTest {

	public static void main(String[] args) {
		List<Drama> list = new ArrayList<Drama>();
		
		
		list.add(new Drama("�� �ܿ� �ٶ��� �д�","SBS","�����","���μ�","������"));
		list.add(new Drama("����� ����","MBC","�ּ���"));
		list.add(new Drama("���̸���2","KBS","�����","ǥ�μ�","�̴���"));
		list.add(new Drama("�ְ�� �̼���","KBS","������",null,"������"));
		
		
		int size = list.size();
		for (int i = 0; i < size; i++) {
			System.out.println(i+1+""+list.get(i));
		}
		
		

	}

}
