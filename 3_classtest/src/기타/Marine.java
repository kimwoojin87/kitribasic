package ��Ÿ;

/*
ü�� , ���ݷ� , ��� 
������ ��� �����Ѵ�,��带 Ų��.

�� ������ ü����(�Ű����� num)  �ø��� ���.
*/
public class Marine{
	 int hp;
	 int power;
	 int mode;
	 int count;

	public Marine(){
		hp = 100;
		power = 10;
		
		
	}
	//�ٸ� ������ ü���� num ���ҽ��Ѷ�
	//�Ű����� Marine other, int num
	//�޼ҵ�� attack
	//���ϰ� ����

	public void attack(Marine other, int count){
		for(int i=0;i<count;i++){
		other.hp = other.hp-power;
		}
		if(hp<=0)
			System.out.println("��������");
	}

	
	//
	void modechanege(){
		if(hp>=45){
			mode = 1;
			power =15;
		}else
			System.out.println("��� �����մϴ�");
	}

}