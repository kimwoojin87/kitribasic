package constructor;

public class starCraft{
	public static void main(String[] args) {
		Marine my = new Marine();
		Marine com = new Marine();
		int count;

		System.out.println("�� ü�� :: " + my.status() +", �� ü�� :: " + com.status());

		count = 4;
		com.attack(my,count);
		System.out.println("�� ü�� :: " + my.status() +", �� ü�� :: " + com.status());

		count = 2;
		my.attack(com,count);
		System.out.println("�� ü�� :: " + my.status() +", �� ü�� :: " + com.status());

		my.changemode();
		System.out.println("�� ü�� :: " + my.status() +", �� ü�� :: " + com.status());

		count = 3;
		my.attack(com,count);
		System.out.println("�� ü�� :: " + my.status() +", �� ü�� :: " + com.status());

		com.changemode();

		count =3;
		my.attack(com,count);
		System.out.println("���� ���� " + count + " ȸ ����!!!!");
		System.out.println("�� ü�� :: " + my.status()+", �� ü�� :: " + com.status());




	}
}
/*		//�� ü�� :: 100  �� ü�� :: 80
		count = 4;
		System.out.println("���� ���� " + count + " ȸ ����!!!!");

		//�� ü�� :: 60 �� ü�� :: 80
		System.out.println("��� ����!!!!!");

		//�� ü�� :: 35 �� ü�� :: 80
		count =3;
		System.out.println("���� ���� " + count + " ȸ ����!!!!");

		//�� ü�� :: 35 �� ü�� :: 35
		System.out.println("��� ����!!!!!");
		//��� : ��� ���� �Ұ�~!!!!!!!
		//�� ü�� :: 35 �� ü�� :: 35

		count =3;
		System.out.println("���� ���� " + count + " ȸ ����!!!!");

		//�� ü�� :: 35 ��ü�� :: die
*/
	
/* int x = 10;
	aa.zzz(x);
	s.o.p(x)

	call by value
	public void zzz(int x){
		x=100;
} */
