/*
*���� ���� �� ����
1. 0 (����), 1 (����), 2 (��)
2. �� : ���� (0,1,2)
3. ��� logic (�̱�ų�,���ų�,���ų�)
4. ���� ����� ���
	��:��,��:���� ����� �̰��.
	��:��,��:��   ����� ����.
	��:��,��:���� ����� ����.
*/
public class GBB{
	public static void main(String[] args) {
		
		int my = 0;
		int com = (int)(Math.random()*3);
		String result = "";
		int result2 = com+my*3;
		String gbb = "";
		String gbb2 = "";
		if(com==my){
			result = "����";
		}switch(result2){
			case 7 : result = "�̰��.";break;
			case 6 : case 5 : result = "����.";break;
			case 3 : result = "�̰��.";break;
			case 2 : result = "�̰��.";break;
			case 1 : result = "����.";break;
		}if(my==0){
			gbb = "����";
		}else if(my==1){
			gbb = "����";
		}else{
			gbb = "��";
		}
		if(com==0){
			gbb2 = "����";
		}else if(com==1){
			gbb2 = "����";
		}else{
			gbb2 = "��";
		}
		System.out.println("���� ������ "+ gbb + " �̰�, " + "��ǻ�Ͱ� �� ���� " + gbb2 + " �̹Ƿ� ����� " + result + " �Դϴ�.");
	}
}

