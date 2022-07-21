import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;

public class DuplicateCharacter
{
	//added changes
	//change 1
	//change 2
	//public static void duplicateChar(String s) 
	//{
//		char[] arr=s.toCharArray();
		//Map<Character,Integer> map = new IdentityHashMap<Character,Integer>();
		
//		for(Character c: arr) 
//		{
//			Integer count =map.get(c);
//			if(count==null) 
//			{
//				map.put(c, 1);
//			}
//			else
//			{
//				map.put(c, ++count);
	            //ajeet
//			}
//		}
//		Set<Entry<Character,Integer>> set=map.entrySet();
//		for(Entry<Character,Integer> entry: set) 
//		{
//			
//				System.out.println(entry.getKey()+"-"+entry.getValue());
//			
//		}
//	}

	public static void main(String[] args)
	{
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		Integer I1 = new Integer(10);
	
		map.put(I1, "Ajeet");
	
		I1=null;
		System.gc();//changed line 50
		System.out.println(map);
		// party is on
		
		
	}

}
