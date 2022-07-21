
public class printOnlyNumbers 
{

	public static int printNums(String str)
	{
		//char[] arr=str.toCharArray();
//		for(int i=0;i<arr.length;i++) 
//		{
//			if(arr[i]>='0' && arr[i]<='9') 
//			{
//				System.out.print(arr[i]);
//			}
//		}
		
		str= str.replaceAll("[^0-9]", "");
		return Integer.parseInt(str);
	}
	public static void main(String[] args)
	{
		String s = "1589rrttt677";
		int ans = printNums(s);
		System.out.println(ans);

	}

}
