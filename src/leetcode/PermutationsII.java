package leetcode;
import java.util.*;
public class PermutationsII {
	   List<List<Integer>> theList;
	   List<Integer> list;
	   public List<List<Integer>>  permuteUnique(int[] num) {
	           theList = new ArrayList<List<Integer>>();
	           list = new ArrayList<Integer>();
	           Arrays.sort(num);
	           BackTrack(num,0);
	           return theList;
	       }
	   public void swap(int[] num,int i,int j)
	   {
	   	int temp = num[i];
	   	num[i] = num[j];
	   	num[j] = temp;
	   }
	   public void BackTrack(int[] num,int i)
	   {
	   	if(i==num.length)
	   	{
	   		//if(!theList.contains(new ArrayList<Integer>(list)))
	   		theList.add(new ArrayList<Integer>(list));
	   		return;
	   	}
	   	else
	   	{
	   		for(int j=i;j<num.length;j++)
	   		{
	   			if(j!=i&&num[i]==num[j])
 				continue;
	   			list.add(num[j]);
	   			swap(num,i,j);
	   			BackTrack(num,i+1);
	   			list.remove(list.size()-1);
	   			swap(num,j,i);
	   		}
	   	}
	   }
	   public static void main(String [] args)
	   {
		   PermutationsII p = new PermutationsII();
		   int []num = {-1,-1,3,-1};
		   System.out.println(p.permuteUnique(num));
	   }
}
