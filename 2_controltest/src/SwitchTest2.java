public class SwitchTest2{
	public static void main(String[] args) {
	/*score(����)��
			90�̻��̸� ������ A
			80�̻��̸� ������ B
			70�̻��̸� ������ C
			60�̻��̸� ������ D
			60�̸��̸� ������ F
		X5�̻��̸� X+����.   A~F�� ����ġ������
		���: ������ XX���̹Ƿ� X�����Դϴ�.
	*/

	int score = 48;
	String grade ="";
	int div = score/10;
	switch(div){
		case 10 : case 9 : grade = "A";break;
		case 8 : grade = "B";break;
		case 7 : grade = "C";break;
		case 6 : grade = "D";break;
		default : grade = "F";break;
	}
	if(score%10>=5 && score>60||score==100){
		grade +="+";
	}
	System.out.println("������ "+ score + " �̹Ƿ� " + grade + "���� �Դϴ�.");
	}
}