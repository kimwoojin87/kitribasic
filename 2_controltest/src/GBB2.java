public class GBB2{
	public static void main(String[] args) {
		int my =2;
		int com = (int) (Math.random()*3);
	
		String resultstr;
		String mystr ="";
		String comstr ="";

		int result = (my-com +2)%3;
		if(result ==0){
			resultstr = "이겼다.";
		}else if(result==1){
			resultstr = "졌다.";
		}else{
			resultstr = "비겼다.";
		}switch(my) {
			case 0 : mystr = "가위";break;
			case 1 : mystr = "바위";break;
			default : mystr = "보";break;
		}switch(com) {
			case 0 : comstr = "가위";break;
			case 1 : comstr = "바위";break;
			default : comstr = "보";break;
		}
		System.out.println("나 : " +mystr + ", 컴 : " +comstr + " 결과 : "+ resultstr);
	}
}