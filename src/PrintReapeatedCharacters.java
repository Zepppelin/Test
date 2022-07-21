import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class PrintReapeatedCharacters
{
	
	public static void reapetedChar(String s) 
	{
		char[] arr=s.toCharArray();
		Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		
		for(Character c: arr) 
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
		Set<Entry<Character,Integer>> set=map.entrySet();
		for(Entry<Character,Integer> entry: set) 
		{
			if(entry.getValue()>1) 
			{
				System.out.println(entry.getKey());
			}
		}
	}

	public static void main(String[] args)
	{
		String str = "Great Responsibilty";
		reapetedChar(str);

	}

}
