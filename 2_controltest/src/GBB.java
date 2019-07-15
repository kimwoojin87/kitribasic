/*
*가위 바위 보 게임
1. 0 (가위), 1 (바위), 2 (보)
2. 컴 : 난수 (0,1,2)
3. 결과 logic (이기거나,지거나,비기거나)
4. 실제 결과를 출력
	나:보,컴:바위 결과는 이겼다.
	나:보,컴:보   결과는 비겼다.
	나:보,컴:가위 결과는 졌다.
*/
public class GBB{
	public static void main(String[] args) {
		
		int my = 0;
		int com = (int)(Math.random()*3);
		String result = "";
		int result2 = com+my*3;
		String gbb = "";
		String gbb2 = "";
		if(com==my){
			result = "비겼다";
		}switch(result2){
			case 7 : result = "이겼다.";break;
			case 6 : case 5 : result = "졌다.";break;
			case 3 : result = "이겼다.";break;
			case 2 : result = "이겼다.";break;
			case 1 : result = "졌다.";break;
		}if(my==0){
			gbb = "가위";
		}else if(my==1){
			gbb = "바위";
		}else{
			gbb = "보";
		}
		if(com==0){
			gbb2 = "가위";
		}else if(com==1){
			gbb2 = "바위";
		}else{
			gbb2 = "보";
		}
		System.out.println("내가 낸것이 "+ gbb + " 이고, " + "컴퓨터가 낸 것이 " + gbb2 + " 이므로 결과는 " + result + " 입니다.");
	}
}

