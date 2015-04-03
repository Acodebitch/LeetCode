package leetcode;

import java.util.*;

public class Sum3 {
public List<List<Integer>> threeSum(int[] num) {
    List<List<Integer>> list = new ArrayList<List<Integer>>();
	Arrays.sort(num);
	
    for(int i=0;i<num.length-2;i++)
    	if (i == 0 || (i > 0 && num[i] != num[i-1]))
    {
    		int j = i+1;
    		int k = num.length - 1;
    	    int temp = 0-num[i];
    		while(j<k)
    		{
    			if(num[j]+num[k]==temp)
    			{
    				while(j<k&&num[j] == num[j+1])j++;
    				while(j<k&&num[k]==num[k-1])k--;
    				list.add(Arrays.asList(num[i],num[j],num[k]));
    				j++;
        			k--;
    			}
    			
    			else if(num[j]+num[k]<temp)
    				j++;
    			else
    				k--;
    			
    		}
    }
	return list;
    }
}
