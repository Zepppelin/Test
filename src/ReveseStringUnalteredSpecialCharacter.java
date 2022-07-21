
public class ReveseStringUnalteredSpecialCharacter
{
	public static String reverseString(String str) 
	{
		char[] arr=str.toCharArray();
		int i=0;
		int j=arr.length-1;
		
		while(i<j) 
		{
			if(!(arr[i]>='a' && arr[i]<='z'))
			{
				i++;
			}
			else if(!(arr[j]>='a' && arr[j]<='z'))
			{
				j--;
			}
			else 
			{
				char temp = arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				i++;
				j--;
			}
		}
		return String.valueOf(arr);
	}

	public static void main(String[] args) 
	{
		String s = "ab@cde.f";
		String ans=reverseString(s);
		System.out.println(ans);
		
	}

}
