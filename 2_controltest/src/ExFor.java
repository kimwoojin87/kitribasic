public class ExFor{
	public static void main(String[] args) {
		//Math.random() �޼ҵ带 �̿��ؼ� �ΰ��� �ֻ����� �������� ������ ���� (��1,��2)�� ����ϰ�
		//���� ���� 5�� �ƴϸ� ��� �ֻ����� ������, ���� ���� 5�� ������ ���ߴ� �ڵ带 �ۼ��϶�
		
//		System.out.println(Math.random());
		
		
		//�ֻ����� �����ϰ� ������.
/*		for(;;){
			int i = (int)(Math.random()*4 + 1);
			int j = (int)(Math.random()*4 + 1);
			if(i+j ==5){
				break;
			}
*/		
		for(;;){
			int i = (int)(Math.random()*6+1);
			int j = (int)(Math.random()*6+1);
			System.out.println("( " +i + ", " + j + " )");
			if(i+j ==5)				
				break;{	
			}
			
		}
		

	}//end main
}//end class ExFor