import java.util.HashMap;

public class Hashmap 
{
	public static boolean isLeapYear(int year) 
	{
		if(year%4==0) 
		{
			if(year%100==0) 
			{
				if(year%400==0) 
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			else 
			{
				return true;
			}
		}
		else 
		{
			return false;
		}
	}
	public static void main(String[] args) 
	{
	   int year = 1900;
	   boolean ans = isLeapYear(year);
	   System.out.println(ans);
	}

}
