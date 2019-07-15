package 기타;


public class starCraft{
	public static void main(String[] args) {

		/* 내 마린과 컴퓨터 마린 객체생성
		*/
		Marine my = new Marine();
		Marine com = new Marine(); //생성자는 new 할떄만 할 수 있다.
		
		int count;

		System.out.println(com.hp);
		my.attack(com,10);
		System.out.println("내 체력 :: "+my.hp+"적 체력 ::  "+com.hp);

				//내 체력 :: 100  적 체력 :: 80
		count = 4;
	    my.attack(com,4);
		System.out.println("적이 나를 " + count + " 회 공격!!!!");

		System.out.println("내 체력 :: "+my.hp+"적 체력 ::  "+com.hp);
		//내 체력 :: 60 적 체력 :: 80
		System.out.println("모드 변경!!!!!");
		my.modechanege();


		//내 체력 :: 35 적 체력 :: 80
		count =3;
		System.out.println("내가 적을 " + count + " 회 공격!!!!");

		//내 체력 :: 35 적 체력 :: 35
		System.out.println("모드 변경!!!!!");
		//경고 : 모드 변경 불가~!!!!!!!
		//내 체력 :: 35 적 체력 :: 35

		count =3;
		System.out.println("내가 적을 " + count + " 회 공격!!!!");

		//내 체력 :: 35 적체력 :: die


	}
}