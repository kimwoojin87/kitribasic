public class WhileLotto{
	public static void main(String[] args) {
		//int num1, num2, num3;
		int num1 = (int) (Math.random()*3+1);
		int num2 =0;
		int num3 =0;
		boolean fst = true;
		while(fst) {
			num2=(int) (Math.random()*3+1);
			if(num1 != num2){
				break;
			}
		}
		while(fst) {
			num3=(int) (Math.random()*3+1);
			if(num1 != num3 && num2 != num3){
				break;
			}
		}
		System.out.println("���� ��÷ ��ȣ : " +num1 + " " + num2 + " " + num3);
	}
}