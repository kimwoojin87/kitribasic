public class ExFor{
	public static void main(String[] args) {
		//Math.random() 메소드를 이용해서 두개의 주사위를 던졌을떄 나오는 눈을 (눈1,눈2)로 출력하고
		//눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5면 실행을 멈추는 코드를 작성하라
		
//		System.out.println(Math.random());
		
		
		//주사위를 무한하게 던진다.
/*		for(;;){
			int i = (int)(Math.random()*4 + 1);
			int j = (int)(Math.random()*4 + 1);
			if(i+j ==5){
				break;
			}
*/		
		for(;;){
			int i = (int)(Math.random()*6+1);
			int j = (int)(Math.random()*6+1);
			System.out.println("( " +i + ", " + j + " )");
			if(i+j ==5)				
				break;{	
			}
			
		}
		

	}//end main
}//end class ExFor