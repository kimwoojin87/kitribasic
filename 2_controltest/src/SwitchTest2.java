public class SwitchTest2{
	public static void main(String[] args) {
	/*score(정수)가
			90이상이면 학점은 A
			80이상이면 학점은 B
			70이상이면 학점은 C
			60이상이면 학점은 D
			60미만이면 학점은 F
		X5이상이면 X+학점.   A~F는 스위치문으로
		결과: 점수가 XX점이므로 X학점입니다.
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
	System.out.println("점수가 "+ score + " 이므로 " + grade + "학점 입니다.");
	}
}