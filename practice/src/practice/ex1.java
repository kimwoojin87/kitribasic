package practice;

public class ex1 {

	public static void main(String[] args) {
		// for���� �̿��ؼ� 1���� 100������ �����߿��� 3�� ����� ������ ���϶�
		int sum = 0;
		
		for(int i=1;i<101;i++) {
			
			if(i%3==0) {
				sum += i;
			}
			
		}
		System.out.println(sum);
	}

}
