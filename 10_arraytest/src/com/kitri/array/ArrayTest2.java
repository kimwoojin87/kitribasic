package com.kitri.array;

public class ArrayTest2 {//Ŭ������ ����� Ŭ������ �̿��� �迭������ ��ü�� ������ �� �ִ�.

	public static void main(String[] args) {
		Car car[] = new Car[6];// ������ ����� ���� �� -���� ���� ������ �ʾҴ�.(������ ����� ���� ���̶�� ����)
								// �����ڸ� ȣ������ �ʾұ� ������ ���� ���� ��������� ���� ��. �׷��� nullpointerexception������ ����.
								// new�� ���´ٰ� ������ ��ü�� ����� ���� ���� �ƴϴ�.
								// �����ڰ� ���;� ��ü�� �����Ǵ°�
		car[0] = new Car("�Ÿ", "������", "����");// ������
		car[1] = new Car("K5", "���", "���");
		car[2] = new Car("SM5", "����", "�Ｚ");
		car[3] = new Car("�ƹݶ�", "���", "����");
		car[4] = new Car("�Ͼ��", "��ѱ��", "���");
		car[5] = new Car("��Ÿ��", "������", "����");

//		System.out.println(car[0].getCarName());//NullPointerException(.�տ��� null�̾ ����) ������ //new�ߴµ� �� car[0]�� 0�̾�? 

		int len = car.length;
		for (int i = 0; i < len; i++) {
			System.out.println(i + 1 + "��° ���� : " + car[i]);
		}
		
		
		
		
		

		System.out.println("--------------------------------------------------------------");

//		String name = "�Ͼ��";// ��ѱ�� �Ͼ��(���)�� 5��°�� �ֽ��ϴ�.
		String name = "QM5"; //QM5�� �����ϴ�.
		
		Car findCar = null; // Car Ÿ���� ������ �ʱ�ȭ�Ѵ�. 
		int count = 0; //�ۿ� ���� ����. 
		
		for (int i = 0; i < len; i++) {
			if (name.equals(car[i].getCarName())) {
				findCar = car[i];
				count = i+1; //�ۿ� �ִ� ���ǿ��� i�� ���� ������ count�� ���� �����.
				break;
			} 
		}
//			else
//				System.out.println(name+ "�� �����ϴ�."); //���� �Ѱ� Ʋ��
		if(findCar != null) {	
		System.out.println(findCar.getColor() + " " + findCar.getCarName() + "(" + findCar.getMaker() + ") �� "
					+ count + "��°�� �ֽ��ϴ�.");	
		}else {
			System.out.println(name+ "�� �����ϴ�.");
		}
		

		
		
//		for (int i = 0; i < len; i++) { 
//			if(name.equals(car[i].getCarName())) {//���ڿ� ���� ��������!!! equals �����!
//				System.out.println(car[4].getColor() +" "+ car[4].getCarName() + "("+ car[4].getMaker()+") �� " + (i+1) + "��°�� �ֽ��ϴ�.");
//				
//				break; //�̰� ������ ���� ���� for���� ���ư� �� �ִ�. ���α׷� ������ ��������.
//				//ã���� for�� �� ��������
//			}
//		}

	}
}
