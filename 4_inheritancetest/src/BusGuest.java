public class BusGuest{
	public static void main(String[] args) {
		Bus a = new Bus("������","������","�ֿ�");

		System.out.println(a.toString());

		int count;
		

		//--�� ���� �����ϴ�


		
			


		count =10;
		a.geton(count);
		System.out.println(count + " ���� �����ϴ�. ");

		count = 8;
		System.out.println(a.getout(count));



		count =30;
		a.geton(count);
		System.out.println(count + " ���� �����ϴ�. ");


		count =50;
		a.geton(count);
		System.out.println(count + " ���� �����ϴ�. ");



		count = 72;
		System.out.println(count + " ���� ���Ƚ��ϴ�. ����� :: "+a.getout(count));




		System.out.println(a.endDays());
		

		System.out.println(a.speed);



		a.speedUp(110);
		
		System.out.println(a.speed);

		a.speedDown(150);

		System.out.println(a.speed);

		a.speedUp(110);

		a.speedDown(50);
		System.out.println(a.speed);

		a.speedDown(20);
		System.out.println(a.speed);

	}
}