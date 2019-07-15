/*
score (점수) 가 
       90이상이면 학점은 A
	   80이상이면 학점은 B
	   70이상이면 학점은 C
	   60이상이면 학점은 D
	   60미만이면 학점은 F

x5 점 이상이면 X+ 학점.
결과 : 점수가 XX점 이므로 X학점 입니다.
*/

public class IfElseIfTest2{
	public static void main(String[] args) {
		int score = 58;
		String grade;
		if(score >= 90){
			grade = "A";
		}else if(score >= 80){
			grade = "B";
		}else if(score >= 70){
			grade = "C";
		}else if(score >=60){
			grade = "D";
		}else{
			grade = "F";
		}
		if(score>60 && score%10 >=5 ||score == 100){
			grade +='+';
		}
		System.out.println("점수가 "+ score + " 이므로 " + grade + " 입니다.");
	}
}