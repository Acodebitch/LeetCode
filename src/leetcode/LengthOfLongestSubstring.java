package leetcode;
import java.util.*;
public class LengthOfLongestSubstring {
	// this method got time limit
//	public static int lengthOfLongestSubstring(String s) 
//	{
//		
//		HashMap<Integer,List<Character>> hm = new HashMap<Integer,List<Character>>();
//		int maxNumber = 0;
//		for(int i=0;i<s.length();i++)
//		{
//			ArrayList<Character> list = new ArrayList<Character>();
//			list.add(s.charAt(i));
//			hm.put(i, list);
//			int j;
//			for(j=i+1;j<s.length();j++)
//			{
//				if(hm.get(i).contains(s.charAt(j)))
//					break;
//				else
//					hm.get(i).add(s.charAt(j));
//			}
//			maxNumber = maxNumber>(j-i)?maxNumber:(j-i);
//	}
//		return maxNumber;
//        
//    }
// time limit exceeded
//	public static int lengthOfLongestSubstring(String s)
//	{
//		List<Character> list = new ArrayList<Character>();
//		int max = 0;
//		for(int i=0;i<s.length();i++)
//		{
//			list.add(s.charAt(i));
//			for(int j=i+1;j<s.length();j++)
//			{
//				if(!list.contains(s.charAt(j)))
//						list.add(s.charAt(j));
//				else{
//					break;
//				}
//			}
//			max = max>list.size()?max:list.size();
//			list.clear();
//		}
//		return max;
//	}
	// this is also exceed?
	public static int lengthOfLongestSubstring(String s)
	{
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		int temp = 0,count = 0,max = 0;
		for(int i=0;i<s.length();i++)
		{
			count++;
			if(hm.containsKey(s.charAt(i)))
			{
				count = count>(i-temp)?max:temp;
			}
			max= max>count?max:count;
		}
		return max;
	}
//	}
//	public static int lengthOfLongestSubstring(String s) {
//	    HashMap<Character,Integer> map = new HashMap<>();
//	    char[] ch = s.toCharArray();
//	    int max=0;
//	    int curr=0;
//	    for (int i=0;i<ch.length;i++){
//	        curr++;
//	        if (map.containsKey(ch[i])){
//	            curr =Math.min(curr, i-map.get(ch[i]));
//	        }
//	        map.put(ch[i],i);
//	        if (curr>max) max = curr;
//
//	    }
//	    return max;
//	}
	public static void main(String [] args)
	{
		String s1 = "bbacb";
		String s2 = "bbbb";
		System.out.println(lengthOfLongestSubstring(s1));
	}
}
