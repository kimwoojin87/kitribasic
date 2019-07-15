package constructor;

public class starCraft{
	public static void main(String[] args) {
		Marine my = new Marine();
		Marine com = new Marine();
		int count;

		System.out.println("내 체력 :: " + my.status() +", 적 체력 :: " + com.status());

		count = 4;
		com.attack(my,count);
		System.out.println("내 체력 :: " + my.status() +", 적 체력 :: " + com.status());

		count = 2;
		my.attack(com,count);
		System.out.println("내 체력 :: " + my.status() +", 적 체력 :: " + com.status());

		my.changemode();
		System.out.println("내 체력 :: " + my.status() +", 적 체력 :: " + com.status());

		count = 3;
		my.attack(com,count);
		System.out.println("내 체력 :: " + my.status() +", 적 체력 :: " + com.status());

		com.changemode();

		count =3;
		my.attack(com,count);
		System.out.println("내가 적을 " + count + " 회 공격!!!!");
		System.out.println("내 체력 :: " + my.status()+", 적 체력 :: " + com.status());




	}
}
/*		//내 체력 :: 100  적 체력 :: 80
		count = 4;
		System.out.println("적이 나를 " + count + " 회 공격!!!!");

		//내 체력 :: 60 적 체력 :: 80
		System.out.println("모드 변경!!!!!");

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
*/
	
/* int x = 10;
	aa.zzz(x);
	s.o.p(x)

	call by value
	public void zzz(int x){
		x=100;
} */
