import java.util.Scanner;

public class IsPrime 
{
	public static boolean isPrime(int num)
	{
		if(num<=1) 
		{
			return false;
		}
		else
		{
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					return false;
				}
			}
		}
		return true;
	}
	
	public static void printPrimeNumbers(int num) 
	{
		for(int i=0;i<=num;i++) 
		{
			if(isPrime(i)==true) {
				System.out.println(i+ " ");
			}
		}
	}
	

	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
	    System.out.println("Enter the number");
	    int num = scn.nextInt();
		boolean ans =isPrime(num);
		printPrimeNumbers(100);
		System.out.println(ans);

	}

}
