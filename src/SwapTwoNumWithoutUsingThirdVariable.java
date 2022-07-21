
public class SwapTwoNumWithoutUsingThirdVariable 
{
	public static void swapNumbers(int a, int b) 
	{
		System.out.println("Before swap"+" "+"a"+" "+"="+" "+a);
		System.out.println("Before swap"+" "+"b"+" "+"="+" "+b);
		
		a= a+b;
		b =a-b;
		a= a-b;
		
		System.out.println("After swap"+" "+"a"+" "+"="+" "+a);
		System.out.println("After swap"+" "+"b"+" "+"="+" "+b);
	}

	public static void main(String[] args) 
	{
		int num1 = 10;
		int num2 = 20;
		
		swapNumbers(num1,num2);

	}

}
