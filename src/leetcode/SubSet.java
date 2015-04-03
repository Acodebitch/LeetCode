package leetcode;
import java.util.*;
public class SubSet {
	List<List<Integer>> theList;
	List<Integer> list;
	 public List<List<Integer>> subsets(int[] S) {
	        theList = new ArrayList<List<Integer>>();
	        list = new ArrayList<Integer>();
	        theList.add(list);
	        Arrays.sort(S);
	        BackTrack(0,S);
	        return theList;
	    }
	 public void BackTrack(int i,int[] S)
	 {
		 if(i==S.length)
			 return;
		 else
		 {
			 for(int j=i;j<S.length;j++)
			 {
				 list.add(S[j]);
				 theList.add(new ArrayList<Integer>(list));
				 BackTrack(j+1,S);
				 list.remove(list.size()-1);
			 }
		 }
		 
	 }
	 public static void main(String [] args)
	 {
		 SubSet set = new SubSet();
		 int[] i = {1,2,2};
		 set.subsets(i);
		 System.out.println(set.theList);
	 }
}
