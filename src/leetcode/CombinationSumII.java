package leetcode;
import java.util.*;
public class CombinationSumII {
List<List<Integer>> theList;
List<Integer> list;
int sum;
public List<List<Integer>> combinationSum2(int[] num, int target) {
        theList = new ArrayList<List<Integer>>();
        list = new ArrayList<Integer>();
        Arrays.sort(num);
        sum = 0;
        BackTrack(num,target,0);
        return theList;
    }
 public void BackTrack(int[]num,int target, int i )
 {
	 if(sum == target)
	 {
		 if(!theList.contains(new ArrayList<Integer>(list)))
		 theList.add(new ArrayList<Integer>(list));
	 }
	 else if(sum>target||i==num.length&&sum!=target)
		 return;
	 else
	 {
		 sum+=num[i];
		 list.add(num[i]);
		 BackTrack(num,target,i+1);
		 sum-=num[i];
		 list.remove(list.size()-1);
		 BackTrack(num,target,i+1);
	 }
 }
 public static void main(String[] args)
 {
	 CombinationSumII csII = new CombinationSumII();
	 int [] num ={10,1,2,7,6,1,5};
	 int target = 8;
	 csII.combinationSum2(num,8);
	 System.out.println(csII.theList);
 }
}
