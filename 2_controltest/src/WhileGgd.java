public class WhileGgd{
	public static void main(String[] args) {
		int x = 2;
		while(x<10){
			int y = 1;
			while(y<10){
			System.out.print(x + "*" + y + "==" + x*y+" ");
			y++;
			}
		x++;
		System.out.println();
		}
	}
}