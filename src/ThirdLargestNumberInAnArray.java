import java.util.Arrays;

public class ThirdLargestNumberInAnArray 
{
	public static int thirdLargest(int[] arr)
	{
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		
		return arr[arr.length-3];
	}

	public static void main(String[] args) 
	{
		int[] a = {3,6,10,2};
		int ans = thirdLargest(a);
		System.out.println(ans);
	}

}
