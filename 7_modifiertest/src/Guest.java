public class Guest{
	static int cnt; // Class ���� nonstatic ���� static�� ȣ�� �� �� ������ static ���� nonstatic�� ȣ�� �� �� ����.
	String name; //instance���� ���۷��������� �����Ͽ� ������ �� �ִ� ����

	public Guest(String name){
		this.name = name;
		
	}

	public static int visit(){
		cnt++;
		return cnt;
	}

}