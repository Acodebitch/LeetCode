package leetcode;

import java.util.Arrays;

public class ThreeSumCloset {
	public static int threeSumClosest(int[] num, int target)
	{
		int min = num[0]+num[1]+num[2];
		int result = 0;
		for(int i=0;i<num.length;i++)
		{
			int j = i+1;
			int k = num.length-1;
			while(j<k)
			{
				int sum = target - num[i]-num[j]-num[k];
				if(sum==0)
					return target;
				else if(sum>0)
				{
					if(sum<min)
					{
						min = sum;
						result = sum+target;
					}
					j++;
				}
				else
				{
					if(0-sum<min)
					{
						min = 0-sum;
						result = sum+target;
					}
					k--;
				}
			}
				
		}
		return result;
	}
	public static void main(String[] args)
	{
		int [] s ={-1,2,1,-4};
		System.out.println(threeSumClosest(s,1));
	}
}
