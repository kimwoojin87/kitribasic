public class GBB2{
	public static void main(String[] args) {
		int my =2;
		int com = (int) (Math.random()*3);
	
		String resultstr;
		String mystr ="";
		String comstr ="";

		int result = (my-com +2)%3;
		if(result ==0){
			resultstr = "�̰��.";
		}else if(result==1){
			resultstr = "����.";
		}else{
			resultstr = "����.";
		}switch(my) {
			case 0 : mystr = "����";break;
			case 1 : mystr = "����";break;
			default : mystr = "��";break;
		}switch(com) {
			case 0 : comstr = "����";break;
			case 1 : comstr = "����";break;
			default : comstr = "��";break;
		}
		System.out.println("�� : " +mystr + ", �� : " +comstr + " ��� : "+ resultstr);
	}
}