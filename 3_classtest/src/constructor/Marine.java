package constructor;

/*������ ü�� hp,�����Ѹ�� �޽��: �����Ѵ�,�����Ѹ��
1.ü���� 100, ��� (0 : �Ϲ�, 1 : ���)
2.���� attack()
  1ȸ ���ݴ� ��ü�� (-10) :�Ϲݸ���Ͻ�
  1ȸ ���ݴ� ��ü�� (-15) :��и���Ͻ�
  ��庯�� changemode()
   �� ü�� -25;
   �� ü�� 40������ ���� ���� �Ұ�.
   call by value
   call by reference
   attack(Marine enemy, , , ){
   }
*/
public class Marine{
	int hp;
	int mode;
	int power;

	public Marine(){
		hp = 100;
		power = 10;
		
	}
	//��ü ü���� ����ϴµ� �ǰ� 0���ϸ� "�׾���" ����ϰ�
	//���ϰ��� ��Ʈ���̰� + �Է��ϴ� ���� ��Ʈ
	
	String status(){
		String status;
		if(hp>0){
			status = hp+"";
		}else{
				status = "����������";
		}return status;
	}

	/*	if(hp<=0)
		hp=0;
		System.out.println("�������Ƚ��ϴ�."); */

	public void attack(Marine enemy,int count){
		for(int i=0;i<count;i++){
		if(mode ==0){
			power = 10;
			enemy.hp -= power;
			
		}else if(mode ==1){
			power = 15;
			enemy.hp -= power;
		}
		}
		System.out.println("�ù� "+ count + "  ȸ ����");
		
	}
	

	public void changemode(){
		if(mode ==0&&hp>=40){
			mode = 1;
			hp -= 25;
			System.out.println("������ ���!!!!!!");
	}else if(mode ==0&&hp<40){
		System.out.println("��� �� �� �����ϴ�.");
	}else if(mode ==1&&hp>=40){
			mode =0;
	}else if(mode ==1&&hp<40){
		System.out.println("��� �� �� �����ϴ�.");
	}
	}


}
	//�ʱ�ȭ ���� 0�̹Ƿ� ���� ���� ���ص���
	
	//com.attack():com.changemode():my.attack():my:changemode()com.hp,com.mode,my.hp,my.mode
	//�Ǳ�°�
	//������ -15
	//-10
	//if hp < 0 
	/* hp -= 10

	*/
	
//0������°� 1�����ѻ���
//hp>40 mode=;1 �ڱ��ǰ� 25
// 
	
/*if (steam=1){
			this.hp -= 15;
		}else (steam=0){
			this.hp -= 10
		}*/