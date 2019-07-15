public class Guest{
	static int cnt; // Class 변수 nonstatic 에서 static을 호출 할 순 있지만 static 에서 nonstatic을 호출 할 순 없다.
	String name; //instance변수 레퍼런스변수를 참조하여 접근할 수 있는 변수

	public Guest(String name){
		this.name = name;
		
	}

	public static int visit(){
		cnt++;
		return cnt;
	}

}