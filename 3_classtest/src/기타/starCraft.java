package ��Ÿ;


public class starCraft{
	public static void main(String[] args) {

		/* �� ������ ��ǻ�� ���� ��ü����
		*/
		Marine my = new Marine();
		Marine com = new Marine(); //�����ڴ� new �ҋ��� �� �� �ִ�.
		
		int count;

		System.out.println(com.hp);
		my.attack(com,10);
		System.out.println("�� ü�� :: "+my.hp+"�� ü�� ::  "+com.hp);

				//�� ü�� :: 100  �� ü�� :: 80
		count = 4;
	    my.attack(com,4);
		System.out.println("���� ���� " + count + " ȸ ����!!!!");

		System.out.println("�� ü�� :: "+my.hp+"�� ü�� ::  "+com.hp);
		//�� ü�� :: 60 �� ü�� :: 80
		System.out.println("��� ����!!!!!");
		my.modechanege();


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


	}
}