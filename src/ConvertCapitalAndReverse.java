import java.util.Arrays;

public class ConvertCapitalAndReverse 
{
    public static void main(String[] args) 
	{
		String s = "Bangalore is capital of Karnataka";
		char[] arr=s.toCharArray();
		
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]==' ' && Character.isLowerCase(arr[i+1])) 
			{
				arr[i+1]=(char)(arr[i+1]-32);
			}
			
		}
		String str = new String(arr);
		String[] arr1=str.split(" ");
		
		for(int i=0;i<arr1.length;i++) 
		{
			
			String rev = arr1[i].charAt(0)+"";
			for(int j=arr1[i].length()-1;j>=1;j--) 
			{
				rev = rev+arr1[i].charAt(j);
			}
			rev = rev+" ";
			System.out.print(rev);
		}
		
		   
	}

}
