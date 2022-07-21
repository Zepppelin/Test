
public class ReverseString 
{
	public static void reverseString(String str)
	{
		if(str == null || str.length()==0)
		{
			System.out.println(str);
		}
		else
		{
			System.out.print(str.charAt(str.length()-1));
			reverseString(str.substring(0,str.length()-1));
		}
	}
   public static void main(String[] args) 
   {
	  String s = "Bangalore";
	  reverseString(s);
   }
}
