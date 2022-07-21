import java.util.Arrays;

public class SumOfEachnumberWithInArray 
{
	public static int[] arrayElementSum(int[] arr) 
	{
		for(int i=0;i<arr.length;i++) 
		{
			int sum =0;
			int num = arr[i];
			while(num>0) 
			{
				int r = num%10;
				sum = sum+r;
				num = num/10;
			}
			
			arr[i]=sum;
			
		}
		return arr;
	}

	public static void main(String[] args) 
	{
		int[] a = {32,4,21,45,1};
		int[] ans =arrayElementSum(a);
		System.out.println(Arrays.toString(ans));

	}

}
