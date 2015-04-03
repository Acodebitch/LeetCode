package leetcode;
import java.util.*;

// completely wrong, it is to recurse the target
public class CombinationSum {
private List<List<Integer>> theList;
private List<Integer> list;
public List<List<Integer>> combinationSum(int[] candidates, int target) {
        theList = new ArrayList<List<Integer>>();
        list = new ArrayList<Integer>();
        if(candidates.length==0)
        		return theList;
        Backtrack(candidates,target);
        return theList;
    }
public void Backtrack(int[]candidate,int target)
{
	if(target==0)
	{
		List<Integer> A = new ArrayList<Integer>();
		A.addAll(list);
		theList.add(A);
	}
	else if(target<0)
	{
		return;
	}
	else
	{
		for(int j=0;j<candidate.length;j++)
		{
			list.add(candidate[j]);
			Backtrack(candidate,target-candidate[j]);
			list.remove(list.size()-1);
		}
	}
}
}
