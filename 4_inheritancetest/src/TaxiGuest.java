public class TaxiGuest{
	public static void main(String[] args) {
		Taxi t1 = new Taxi();
		System.out.println("t1 >> " + t1.toString() + " �⺻��� :" + t1.basicPrice);

		Taxi t2 = new Taxi("K5","��ȫ��","���");
		System.out.println("t2 >> " + t2.toString() + " �⺻��� :" +t2.basicPrice);

		int km = 20;
		t2.initPrice();
		System.out.println(t2 + "�� Ÿ�� ���𿡼� �������� " + km + "km�̵�!!!");
		int price = t2.calcPrice(km);
		t2.sumPrice();
		System.out.println("��� : " + price + "��");
		System.out.println("���� ���� : " + t2.totalPrice + "��");

		km = 20;
		t2.initPrice();
		System.out.println(t2 + "�� Ÿ�� �������� ������� " + km + "km�̵�!!!");
		price = t2.calcPrice(km);
		t2.sumPrice();
		System.out.println("��� : " + price + "��");
		System.out.println("���� ���� : " + t2.totalPrice + "��");

		int upDown = 50;
		System.out.println("t2�� �ӵ��� " + upDown + "��ŭ ����!!!");
		int speed = t2.speedUp(upDown);
		System.out.println("t2�� �ӵ��� " + speed + " "+ t2.speed);

		upDown = 250;
		System.out.println("t2�� �ӵ��� " + upDown + "��ŭ ����!!!");
		speed = t2.speedUp(upDown);
		System.out.println("t2�� �ӵ��� " + speed + " "+ t2.speed);

		System.out.println(t1 + "  " + t2); //������Ʈ�� ���ڿ��� ������ toString()�� �ڵ� ȣ��ȴ�.
		System.out.println(t1.toString() + "  " + t2.toString());


		Taxi t3 = new Taxi("K5","��ȫ��","���");
		System.out.println(t2 + "  " + t3);
		System.out.println(t2.hashCode() + "  " + t3.hashCode());
		if(t2 == t3)//==(�񱳿�����)�� �⺻������Ÿ���� ��쿡 ���� ��,������������Ÿ���� ���� �ּҰ��� ��.
			System.out.println("t2�� t3�� �ּҰ��� ���� ���̴�  ");
		else
			System.out.println("t2�� t3�� �ּҰ��� �ٸ� ���̴�  ");

		if(t2.equals(t3))//������Ʈ�� ������ �ִ� ��������� �͵� �ּҰ���.
			System.out.println("t2�� t3�� ���̸��� ���� ���̴�  ");
		else
			System.out.println("t2�� t3�� ���̸��� �ٸ� ���̴�  ");


		//Car car = new Car();

		Car car = new Taxi(); //���� ��� �ؼ��� �����ؾ���.
		Taxi t = new Taxi();
		t = (Taxi)car; //��������ȯ�� �������� ������ ������ �ýð� ī�� ��ӹ޾ұ� ������.
						//����ÿ��� ������ �߻��Ѵ�. �����Ͽ��� �����˻縸��.

		//String s = "123"; // �⺻�� �⺻���� �������� ����������
		//int x = (int)s; // �ٲܼ� �ִ� Ÿ���� �Ǿ���Ѵ�.


		//Calendar cal = new GregorianCalendar(); // ����Ŭ���� ����.

	}
}
