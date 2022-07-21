import java.util.Scanner;

public class FactorialOfNumber 
{
	static int fact =1;
	public static int factorialOfNumber(int num) 
	{
		if(num<=1) 
		{
			return 1;
		}
		else
		{
			fact = fact*num;
			factorialOfNumber(num-1);
		}
		return fact;
	}
	

	public static void main(String[] args)
	{
	    Scanner scn = new Scanner(System.in);
	    System.out.println("Enter the number");
	    int num = scn.nextInt();
	    int ans =factorialOfNumber(num);
	    System.out.println(ans);

	}

}
