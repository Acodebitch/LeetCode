package leetcode;

import java.util.*;

public class ValidSudoku {
	public boolean isValidSudoku(char[][] board)
	{
		HashMap<Integer,List<Integer>> hm = new HashMap<Integer,List<Integer>>();
		for(int i=0;i<9;i++)
			for(int j=0;j<9;j++)
			{
				int number = board[i][j] - 48;
				if(i%3==0&&j%3==0)
				{
					int num1 = i*3+j+9;
					List<Integer> list0 = new ArrayList<Integer>();
					list0.add(number);
					hm.put(num1, list0);
					if(number == -2) continue;
				}
				else
				{
					if(number == -2) continue;
					else
					{
						int temp1 = i-i%3;
						int temp2 = j-j%3;
						int num2 = temp1*3+temp2+9;
						if(hm.get(num2).contains(number))
							return false;
						else
							hm.get(num2).add(number);
					}
				}
				if(hm.containsKey(i))
				{
					if(hm.get(i).contains(number))
						return false;
					else
						hm.get(i).add(number);
				}
				else
				{
					List<Integer> list1 = new ArrayList<Integer>();
					list1.add(number);
					hm.put(i, list1);
				}
				int value2 = j-9;
				if(hm.containsKey(value2))
				{
					if(hm.get(value2).contains(number))
						return false;
					else
						hm.get(value2).add(number);
						
				}
				else
				{
					List<Integer> list2 = new ArrayList<Integer>();
					list2.add(number);
					hm.put(value2,list2);
					
				}
				
			}
		return true;
	}	
public static void main()
{
	//
}
}
