public class IfElseTest1{
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		/*
		if(x > y){
			System.out.println(x + "�� " + y + "���� ũ��.");
		}else {
		System.out.println(x + "�� " + y + "���� �۴�.");
		}*/
		String big;
		if(x>y){
			big = "ũ��";
		}else {
			big = "�۴�";

			if(x==y){
				big = "����";
			}

		}
		System.out.println(x + "�� " + y + "����" + big);
		System.out.println("���α׷� ����!!!");
	}
}