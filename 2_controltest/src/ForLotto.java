public class ForLotto{
	public static void main(String[] args) {
		//int num1, num2, num3;
		int num1 = (int)(Math.random()*3+1);
		int num2 = 0;
		int num3 = 0;

		for(;;){
			num2=(int)(Math.random()*3+1);
			if(num1!=num2){
				break;
			}
		}
			for(;;){
				num3=(int)(Math.random()*3+1);
				if(num1!=num3 && num2!=num3){
					break;
				}
			}

		
		System.out.println("금주 당첨 번호 : " +num1 + " " + num2 + " " + num3);
	}
}
/*
*lotto
1~3까지의 서로 다른 난수가 발생

*/