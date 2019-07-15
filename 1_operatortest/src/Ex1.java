public class Ex1{
	public static void main(String[] args) {
		int jumin = 1;
			String gender = "";
		if(jumin%2==0){
			gender = "여자입니다.";
		}else if(jumin%2!=0){
			gender = "남자입니다.";
		}
		System.out.println("당신의 주민번호 앞자리가 "+ jumin + " 이므로 당신의 성별은 " + gender );
	}
}

//당신은 남자입니까 여자입니까