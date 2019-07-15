package constructor;

/*마린의 체력 hp,스팀팩모드 메쏘드: 공격한다,스팀팩모드
1.체력이 100, 모드 (0 : 일반, 1 : 흥분)
2.공격 attack()
  1회 공격당 적체력 (-10) :일반모드일시
  1회 공격당 적체력 (-15) :흥분모드일시
  모드변경 changemode()
   내 체력 -25;
   내 체력 40이하일 경우는 변경 불가.
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
	//객체 체력을 출력하는데 피가 0이하면 "죽었다" 출력하고
	//리턴값은 스트링이고 + 입력하는 값은 인트
	
	String status(){
		String status;
		if(hp>0){
			status = hp+"";
		}else{
				status = "뒤져버렸음";
		}return status;
	}

	/*	if(hp<=0)
		hp=0;
		System.out.println("뒤져보렸습니다."); */

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
		System.out.println("시발 "+ count + "  회 공격");
		
	}
	

	public void changemode(){
		if(mode ==0&&hp>=40){
			mode = 1;
			hp -= 25;
			System.out.println("스팀팩 사용!!!!!!");
	}else if(mode ==0&&hp<40){
		System.out.println("사용 할 수 없습니다.");
	}else if(mode ==1&&hp>=40){
			mode =0;
	}else if(mode ==1&&hp<40){
		System.out.println("사용 할 수 없습니다.");
	}
	}


}
	//초기화 값이 0이므로 굳이 설정 안해도됨
	
	//com.attack():com.changemode():my.attack():my:changemode()com.hp,com.mode,my.hp,my.mode
	//피깍는거
	//스팀팩 -15
	//-10
	//if hp < 0 
	/* hp -= 10

	*/
	
//0보통상태고 1스팀팩상태
//hp>40 mode=;1 자기피가 25
// 
	
/*if (steam=1){
			this.hp -= 15;
		}else (steam=0){
			this.hp -= 10
		}*/