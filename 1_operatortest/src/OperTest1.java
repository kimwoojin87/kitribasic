public class OperTest1
{
	public static void main(String[] args) 
	{
		int x=126;
		System.out.println(x);   
		System.out.println(x++);   
		System.out.println(--x);   
		System.out.println(x++);   
		System.out.println(++x);   
		System.out.println(x--);   
		System.out.println(--x);   
		System.out.println(x++);   
		System.out.println(x);   

		boolean flag = true;
		System.out.println(flag);
		System.out.println(!flag);

		char c='a';
		System.out.println("c== " +c);
		System.out.println("(int)c== " + (int)c);
				
		int y = c;//�ڵ�����ȯ ��ȯ������ ������ Ÿ���̰� ����Ʈ ũ�Ⱑ ����Ҷ�
		System.out.println("y== " +y);
			
		c = (char)y;//��������ȯ ��ȯ������ ������ Ÿ���̰� ����Ʈ ũ�Ⱑ �����Ҷ�
		System.out.println("c== " +c);

/*		boolean b = true; �Ҹ��� ���ڷ� �ٲܼ����� Ÿ�Ժ�ȯ�� �Ұ����ϴ�.
		int z = b; */
		int z = 30;
		double d = z;
		//z = d; //error
		z = (int)d;

	}
}
