import java.util.Arrays;

public class Test78 
{
	public static void main(String[] args) 
	{
	     int[] arr = {4,51,2,0,0,5,3,2};
	     int j =0;
	     
	     for(int i=0;i<arr.length;i++) 
	     {
	    	 if(arr[i]!=0) 
	    	 {
	    		 int temp = arr[j];
	    		 arr[j]=arr[i];
	    		 arr[i]=temp;
	    		 j++;
	    		 System.out.println(Arrays.toString(arr));
	    	 }
	     }
	   
	}

}
