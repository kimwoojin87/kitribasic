package 기타;

/*
체력 , 공격력 , 모드 
마린의 기능 공격한다,모드를 킨다.

내 마린의 체력을(매개변수 num)  올리는 기능.
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
	//다른 마린의 체력을 num 감소시켜라
	//매개변수 Marine other, int num
	//메소드명 attack
	//리턴값 없음

	public void attack(Marine other, int count){
		for(int i=0;i<count;i++){
		other.hp = other.hp-power;
		}
		if(hp<=0)
			System.out.println("뒤져보림");
	}

	
	//
	void modechanege(){
		if(hp>=45){
			mode = 1;
			power =15;
		}else
			System.out.println("장비를 정지합니다");
	}

}