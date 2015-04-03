package leetcode;

import java.util.*;

public class LetterCombinationsofaPhoneNumber {
HashMap<Character,String> hm;
List<String> list;
public List<String> letterCombinations(String digits) {
	  hm = new HashMap<Character,String>();
	  list = new ArrayList<String>();
	  hm.put('2', "abc");
	  hm.put('3',"def");
	  hm.put('4',"ghi");
	  hm.put('5',"jkl");
	  hm.put('6', "mno");
	  hm.put('7',"pqrs");
	  hm.put('8',"tuv");
	  hm.put('9', "wxyz");
	  BackTrack(digits,0,"");
	  return list;
    }
public void BackTrack(String digits, int i,String s)
{
	if(i==digits.length())
	{
		list.add(s);
	}
	else
	{
		for(int j=0;j<hm.get(digits.charAt(i)).length();j++)
		{
			BackTrack(digits,i+1,s+hm.get(digits.charAt(i)).charAt(j));
		}
	}
}
public static void main(String[] args)
{
	LetterCombinationsofaPhoneNumber lcp = new LetterCombinationsofaPhoneNumber();
	System.out.println(lcp.letterCombinations("23"));
}
}
