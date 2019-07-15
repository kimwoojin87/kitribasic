public class BusGuest{
	public static void main(String[] args) {
		Bus a = new Bus("버스차","버스색","쌍용");

		System.out.println(a.toString());

		int count;
		

		//--몇 명이 탔습니다


		
			


		count =10;
		a.geton(count);
		System.out.println(count + " 명이 탔습니다. ");

		count = 8;
		System.out.println(a.getout(count));



		count =30;
		a.geton(count);
		System.out.println(count + " 명이 탔습니다. ");


		count =50;
		a.geton(count);
		System.out.println(count + " 명이 탔습니다. ");



		count = 72;
		System.out.println(count + " 명이 내렸습니다. 요금은 :: "+a.getout(count));




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