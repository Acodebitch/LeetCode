package leetcode;
import java.util.*;
public class MinimumWindowSubstring {
public String minWindow(String S, String T) {
    HashMap<Character,List<Integer>> hm = new HashMap<Character,List<Integer>>();
    for(int i=0;i<S.length();i++)
    {
    		if(!hm.containsKey(S.charAt(i)))
    		{
    			List<Integer> list = new ArrayList<Integer>();
    			list.add(i);
    			list.add(i);
    			hm.put(S.charAt(i), list);
    		}
    		else
    		{
    			
    		}
    	
    }
	return "";
    }
}
