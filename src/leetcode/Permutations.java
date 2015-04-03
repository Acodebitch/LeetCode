package leetcode;
import java.util.*;
public class Permutations {
	   List<List<Integer>> theList;
	   List<Integer> list;
	   public List<List<Integer>> permute(int[] num) {
	           theList = new ArrayList<List<Integer>>();
	           list = new ArrayList<Integer>();
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
	   		theList.add(new ArrayList(list));
	   		return;
	   	}
	   	else
	   	{
	   		for(int j=i;j<num.length;j++)
	   		{
	   			list.add(num[j]);
	   			swap(num,i,j);
	   			BackTrack(num,i+1);
	   			list.remove(list.size()-1);
	   			swap(num,j,i);
	   		}
	   	}
	   }
}
