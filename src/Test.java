import java.util.Arrays;
import java.util.Stack;

public class Test
{
	public static void permuteString(String str, String ans)
	{
		if(str.length()==0) 
		{
			System.out.println(ans);
			return;
		}
		else 
		{
			for(int i=0;i<str.length();i++)
			{
				char ch =str.charAt(i);
				String ros = str.substring(0,i)+str.substring(i+1);
				permuteString(ros,ans+ch);
			}
		}
	}
	
	public static void main(String[] args) 
	{
		String s = "abc";
		String ans = "";
		permuteString(s,ans);
	}
}
