package leetcode;
import java.util.*;
public class PalindromePartitioning {
private List<List<String>> theList;
private List<String> list;
public List<List<String>> partition(String s) {
    theList = new ArrayList<List<String>>();
    list = new ArrayList<String>();
    BackTrack(s,"",0);
	return theList;
}
public boolean IsPalindrome(String s)
{
	boolean IsPD = true;
	for(int i=0;i<s.length()/2;i++)
	{
		if(s.charAt(i)!=s.charAt(s.length()-1-i))
			{IsPD = false;break;}
	}
	return IsPD;
}
public void BackTrack(String s1,String s2,int i )
{
	if(i==s1.length())
	{
		theList.add(new ArrayList<String>(list));
	}
	else
	{
		if(IsPalindrome(s2+s1.charAt(i)))
		{
			list.add(s2+s1.charAt(i));
			BackTrack(s1,"",i+1);
			list.remove(list.size()-1);
		}
		if(i+1!=s1.length())
		BackTrack(s1,s2+s1.charAt(i),i+1);
		}
	}
public static void main(String[] args)
{
	PalindromePartitioning pp = new PalindromePartitioning();
	System.out.println(pp.partition("aab"));
}
}
