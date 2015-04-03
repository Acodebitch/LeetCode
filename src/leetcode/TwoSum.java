package leetcode;

import java.util.*;
//lllllllsdaasdsa
public class TwoSum {
	public static int[] twoSum(int[] numbers, int target) {
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		int [] num = new int[2];
		for(int i=0;i<numbers.length;i++)
		{
			int temp = target-numbers[i];
			if(hm.containsKey(temp))
				{num[0] = hm.get(temp);
				num[1] = i+1;
				}
			else
				hm.put(numbers[i],i+1);
		}
		return  num;   
    }
	public static void main(String [] args)
	{
		int [] number = {2, 7, 11, 15};
		int [] num=twoSum(number,9);
		System.out.println(num[0]);
		System.out.println(num[1]);
	}
}
