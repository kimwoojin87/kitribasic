package practice;

public class StringEx1 {

	public static void main(String[] args) {
		String str = "show me the money";
		int len = str.length();
		System.out.println(len);
		char c = str.charAt(3);
		System.out.println(c);
		
		String str2 = "fucking mans";
		char c1 = str2.charAt(4);
		System.out.println(c1);
		
		int str3 = 500;
		String test = String.valueOf(str3);
		System.out.println(test+"aslkdjasldkj");
	}
}
