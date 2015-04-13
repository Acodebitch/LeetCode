package leetcode;
import java.util.*;
public class Anagram {
public List<String> anagrams(String[] strs) {
	HashMap<String, String> hm = new HashMap<String,String>();
	List<String> list = new ArrayList<String>();
	for(int i=0;i<strs.length;i++)
	{
		char [] array = strs[i].toCharArray();
		Arrays.sort(array);
		String mine = new String(array);
		if(hm.containsKey(mine)&&strs[i].length()==hm.get(mine).length())
		{
			if(!list.contains(hm.get(mine)))
			{
				list.add(hm.get(mine));
			}
			list.add(strs[i]);
		}
		else
		{
			hm.put(mine, strs[i]);
			
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
