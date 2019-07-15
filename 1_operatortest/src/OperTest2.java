public class OperTest2
{
	public static void main(String[] args) 
	{
		int num1 = 13;
		int num2 = 5;
		int num3 = num1+num2;
		System.out.println(num1 + " + "  +num2 + "=" + num3);

		num3 = num1-num2;
		System.out.println(num1 + " - "  +num2 + "=" + num3);
		System.out.println(num1 + " + "  +num2 + "=" + (num1 + num2));

		int num4 = num1-num2;
		System.out.println(num1 + " - "  +num2 + "=" + num4);
		System.out.println(num1 + " - "  +num2 + "=" + (num1 - num2));

		num3 = num1*num2;
		System.out.println(num1 + " x "  +num2 + "=" + num3);
		num3 = num1/num2;
		System.out.println(num1 + " / "  +num2 + "=" + num3);
		num3 = num1%num2;
		System.out.println(num1 + " % "  +num2 + "=" + num3);

		System.out.println(num1 + " * "  +num2 + "=" + num1 * num2);
		System.out.println(num1 + " / "  +num2 + "=" + num1 / num2);
	}
}
