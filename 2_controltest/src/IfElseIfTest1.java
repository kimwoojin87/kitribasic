public class IfElseIfTest1{
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		String bg;
		if (x==y){
			bg = "같다";
		}else if(x>y){
			bg = "크다";
		}else{
			bg = "작다";
		}
		System.out.println(x + " 는 "+ y +" 보다 "+ bg);
	}
}