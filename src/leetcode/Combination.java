package leetcode;

import java.util.*;

public class Combination {
	
	List<List<Integer>> theList;
	List<Integer> list;
	public List<List<Integer>> combine(int n, int k) {
		theList = new ArrayList<List<Integer>>();
		list = new ArrayList<Integer>();
		Backtrack(0,n,k);
		return theList;
	}
	public void Backtrack(int i, int n, int k )
	{
		System.out.println(list.size());
		if(list.size()==k)
		{
			List<Integer> a = new ArrayList<Integer>();
			a.addAll(list);
			theList.add(a);
			return;
		}
		else
		{
			for(int j=i;j<n;j++)
			{
				list.add(j+1);
				Backtrack(j+1,n,k);
				System.out.println(theList);
				list.remove(list.size()-1);
				System.out.println(theList);
				
			}
		}
		
		
	}
	public static void main(String [] args)
	{
		Combination c = new Combination();
		c.combine(1,1);
		System.out.println(c.theList);
	}
}
