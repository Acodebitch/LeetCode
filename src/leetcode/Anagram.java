package leetcode;
import java.util.*;
public class Anagram {
	public List<String> anagrams(String[] strs) {
		HashMap<String, String> hm = new HashMap<String,String>();
		List<String> list = new ArrayList<String>();
		for(String s:strs)
		{
			char [] array = s.toCharArray();
			Arrays.sort(array);
			String mine = new String(array);
			if(hm.containsKey(mine))
			{
				if(!list.contains(hm.get(mine)))
				{
					list.add(hm.get(mine));
				}
				list.add(s);
			}
			else
			{
				hm.put(mine, s);
				
			}
		}
		return list;
		}
public static void main(String [] args)
{
	String[] s={"abc","cba","bac"};
	Anagram a = new Anagram();
	System.out.println(a.anagrams(s));
}
}
