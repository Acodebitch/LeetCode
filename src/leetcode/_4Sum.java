package leetcode;
import java.util.*;
public class _4Sum {
	public List<List<Integer>> fourSum(int[] num, int target) {
		 List<List<Integer>> list = new ArrayList<List<Integer>>();
		 Arrays.sort(num);
		 for(int i=0;i<num.length;i++)
		 {
		     if(i>0&&num[i] == num[i-1])
		        continue;
			 for(int j=i+1;j<num.length;j++)
			 {
			     if(j>i+1&&num[j]==num[j-1]) continue;
				 int m = j+1,n = num.length-1,inTarget = target-num[i]-num[j];
				 while(m<n)
				 {
					 if(num[m]+num[n]==inTarget)
					 {
					 while(m<n&&num[m]==num[m+1])m++;
					 while(m<n&&num[n]==num[n-1])n--;
					 list.add(Arrays.asList(num[i],num[j],num[m],num[n]));
					 m++;
					 n--;
					 }
					 else if(num[m]+num[n]<inTarget)
						 m++;
					 else
						 n--;
				 }
			 }
		 }
		 return list;
	 }	
}
