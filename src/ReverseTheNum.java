
public class ReverseTheNum
{
    public static int reveseNumber(int num) 
    {
    	int reversedNum =0;
    	while(num>0) 
    	{
    		int reminder = num%10;
    		reversedNum = (reversedNum*10)+reminder;
    		num = num/10;
    	}
    	return reversedNum;
    }
	public static void main(String[] args)
	{
		int Inputnum = 2345;
		int ans =reveseNumber(Inputnum);
		System.out.println(ans);

	}

}
