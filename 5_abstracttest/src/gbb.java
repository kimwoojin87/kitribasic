public class gbb{
	public static void main(String[] args) {
		int my = 2;
		int com = (int)(Math.random()*3);


		int result = (my-com+2)%3;
		if(result==0){
		System.out.println("����");
		}else if(result==1){
		System.out.println("�̰��");
		}else
		System.out.println("����");
	}
}