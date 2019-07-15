package com.kitri.lang;

public class StringBufferTest1 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("hello "); //16개의 여유공간을 남겨놓고 만들어진다.
		System.out.println("1. sb1 == "+sb1);
		int cap = sb1.capacity();
		System.out.println("초기 크기 : "+cap+"\t문자열 수 : "+sb1.length());
		sb1.append("java");
		System.out.println("2. sb1 == "+sb1);//스트링버퍼를 이용한 어펜드는 결과값이 반영된다.
		
		String s = "hello ";
		s.concat("java");
		System.out.println(s); // 주소값이 그대로이기떄문에 고정되어있다.

		sb1.append(" !!!!!");
		System.out.println("3. sb1 == "+sb1);
		cap = sb1.capacity();
		System.out.println("초기 크기 : "+cap+"\t문자열 수 : "+sb1.length());
		sb1.append(" !!!!!!");
		System.out.println("4. sb1 == "+sb1);
		cap = sb1.capacity();
		System.out.println("초기 크기 : "+cap+"\t문자열 수 : "+sb1.length());
		//문자열이 초기크기보다 커지면 크기가 자동으로 늘어난다.
		sb1.insert(10, "@@@");
		System.out.println("5. sb1 == "+sb1);
		sb1.delete(10, 12);//substring이랑 똑같다. a부터 b전까지 삭제시킨다. 범위
		System.out.println("6. sb1 == "+sb1);
		sb1.deleteCharAt(10); // 해당되는 자리만 지워라
		System.out.println("7. sb1 == "+sb1);
		sb1.replace(6, 10, "자바");//a부터 b전까지 문자열을 바꿔라!
		System.out.println("8. sb1 == "+sb1);
		sb1.reverse();//영문이던 한글이던 상관없이 문자열을 뒤집어준다.
		System.out.println("9. sb1 == "+sb1);
		sb1.reverse();//영문이던 한글이던 상관없이 문자열을 뒤집어준다.
		System.out.println("10. sb1 == "+sb1);
		sb1.setCharAt(9, '@'); // a번째에 있는 것을 b로 바꿔라.
		System.out.println("11. sb1 == "+sb1);//지금 들어있는 것은 스트링이 아니고 스트링 버퍼이다.
		
		String s1 = new String(sb1); // 스트링버퍼를 스트링클래스로 만들어줌.
		String s2 = sb1.toString();  // 스트링버퍼를 스트링클래스로 만들어줌.
		
		String str = "hello 자바 !!!";
		String findStr = "자바";
//		String findStr = "오라클"; // 오라클은 없습니다.
		String replaceStr = "java";
		
		int start = str.indexOf(findStr);
		System.out.println(start);
		if(start != -1) {
			StringBuffer str1 = new StringBuffer(str);
			int end = start + findStr.length();
			str1.replace(start, end, replaceStr);
			System.out.println(str1);
		}else {
			System.out.println(findStr + " 은 없습니다.");
		}
				//스트링 클래스에 있는 리플레이스 사용하지말고 hello java !!! 를 호출
		
		
	}

}
