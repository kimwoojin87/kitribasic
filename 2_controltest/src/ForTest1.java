public class ForTest1{
	public static void main(String[] args) {
		System.out.println("1~10���� ���. ");
		for(int i=1;i<11;i++){
			System.out.print(i+ ". ");
		}
		for(int j=1;j<11;j++){
			if(j%2==1){
		System.out.print(j);
		}
		}
		for(int h=1;h<11;h+=2){
			System.out.print(h);	
		}
		for(int k=1;k<101;k++){
			System.out.print(k + " ");
				if(k%10==0){
				System.out.println();
				}
		}
		System.out.println("\n ���α׷� ����!!!");
	}
}
/* 1~10���� Ȧ�������
1~100���� ��� 10������ �ٹٲ� */