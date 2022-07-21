import java.util.Arrays;

public class Test77447 
{
	public static int[] merge(int[] nums1, int[] nums2) 
	{
		int[] mix = new int[nums1.length+nums2.length];
		int i=0;
		int j=0;
		int k=0;
		
		while(i<nums1.length && j<nums2.length) 
		{
		   if(nums1[i]<nums2[j]) 
		   {
			   mix[k]=nums1[i];
			   i++;
		   }
		   else 
		   {
			   mix[k]=nums2[j];
			   j++;
		   }
		   k++;
		}
		while(i<nums1.length) 
		{
			mix[k]=nums1[i];
			i++;
			k++;
		}
		while(j<nums2.length) 
		{
			mix[k]=nums2[j];
			j++;
			k++;
		}
		return mix;
	}
	public static void main(String[] args) 
	{
		int [] arr = {1,4,5,6};
		int [] arr1 = {2,3,7,8,9};
		int[] ans = merge(arr,arr1);
		System.out.println(Arrays.toString(ans));
	}

}
