
public class SwapStringWithoutUsingThirdVariable 
{
	public static void swapStrings(String string1, String string2)
	{
		System.out.println("Before swap"+" "+"string1"+" "+"="+" "+string1);
		System.out.println("Before swap"+" "+"string2"+" "+"="+" "+string2);
		
		string1 = string1+string2;
		string2 = string1.substring(0, string1.length()-string2.length());
		string1 = string1.substring(string2.length());
		
		System.out.println("After swap"+" "+"string1"+" "+"="+" "+string1);
		System.out.println("After swap"+" "+"string2"+" "+"="+" "+string2);
	}

	public static void main(String[] args)
	{
		swapStrings("defg","abc");
	}

}
