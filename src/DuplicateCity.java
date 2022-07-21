import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class DuplicateCity 
{
	
	public static void duplicateCity(String[] arr) 
	{
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		for(String c: arr) 
		{
			Integer count =map.get(c);
			if(count==null) 
			{
				map.put(c, 1);
			}
			else
			{
				map.put(c, ++count);
			}
		}
		Set<Entry<String,Integer>> set=map.entrySet();
		for(Entry<String,Integer> entry: set) 
		{
			if(entry.getValue()>1) 
			{
				System.out.println(entry.getKey());
			}
		}
	}


	public static void main(String[] args) 
	{
		String[] a = {"chennai","kokata","mumbai","chennai"};
		duplicateCity(a);

	}

}
