package leetcode;
import java.util.*;
public class RepeatedDnaSequences {
// I have nothing to say , this method get time limit exceeding
//public static List<String> findRepeatedDnaSequences(String s) {
//    List<String> list = new ArrayList<String>();  
//	for(int i=0;i<s.length()-10;i++)
//     {
//    	 	String s1 = s.substring(i, i+10);
//    	 	if(s.substring(i+10,s.length()-1).contains(s1))
//    	 		list.add(s1);
//     }
//	return list;   
//    }
public static List<String> findRepeatedDnaSequences(String s) 
	{
		List<String> list = new ArrayList<String>();
		List<String> result = new ArrayList<String>();
		for(int i=0;i<s.length()-10;i++)
		{
			String substring = s.substring(i, i+10);
			if(list.contains(substring))
				result.add(substring);
			else
				list.add(substring);
		}
			
		return result;
	}
public static void main(String[] args)
{
	String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
	System.out.println(findRepeatedDnaSequences(s));
}
}
