public class IfElseIfTest1{
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		String bg;
		if (x==y){
			bg = "����";
		}else if(x>y){
			bg = "ũ��";
		}else{
			bg = "�۴�";
		}
		System.out.println(x + " �� "+ y +" ���� "+ bg);
	}
}