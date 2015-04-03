package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SudokuSolver {
//	public boolean isValidSudoku(char[][] board)
//	{
//		HashMap<Integer,List<Integer>> hm = new HashMap<Integer,List<Integer>>();
//		for(int i=0;i<9;i++)
//			for(int j=0;j<9;j++)
//			{
//				int number = board[i][j] - 48;
//				if(i%3==0&&j%3==0)
//				{
//					int num1 = i*3+j+9;
//					List<Integer> list0 = new ArrayList<Integer>();
//					list0.add(number);
//					hm.put(num1, list0);
//					if(number == -2) continue;
//				}
//				else
//				{
//					if(number == -2) continue;
//					else
//					{
//						int temp1 = i-i%3;
//						int temp2 = j-j%3;
//						int num2 = temp1*3+temp2+9;
//						if(hm.get(num2).contains(number))
//							return false;
//						else
//							hm.get(num2).add(number);
//					}
//				}
//				if(hm.containsKey(i))
//				{
//					if(hm.get(i).contains(number))
//						return false;
//					else
//						hm.get(i).add(number);
//				}
//				else
//				{
//					List<Integer> list1 = new ArrayList<Integer>();
//					list1.add(number);
//					hm.put(i, list1);
//				}
//				int value2 = j-9;
//				if(hm.containsKey(value2))
//				{
//					if(hm.get(value2).contains(number))
//						return false;
//					else
//						hm.get(value2).add(number);
//						
//				}
//				else
//				{
//					List<Integer> list2 = new ArrayList<Integer>();
//					list2.add(number);
//					hm.put(value2,list2);
//					
//				}
//				
//			}
//		return true;
//	}
	public static void solveSudoku(char[][] board)
	{
		HashMap<Integer,List<Character>> hm = new HashMap<Integer,List<Character>>();
		for(int i=0;i<9;i++)
			for(int j=0;j<9;j++)
			{
				if(board[i][j]=='.') continue;
				if(hm.containsKey(i))
					hm.get(i).add(board[i][j]);
				else
				{
					List<Character> list1 = new ArrayList<Character>();
					list1.add(board[i][j]);
					hm.put(i, list1);
				}
				int key1= j-9;
				if(hm.containsKey(key1))
					hm.get(key1).add(board[i][j]);
				else
				{
					List<Character> list2 = new ArrayList<Character>();
					list2.add(board[i][j]);
					hm.put(key1, list2);
				}
				int key2 = (i-i%3)*9+(j-j%3)+9;
				if(hm.containsKey(key2))
					hm.get(key2).add(board[i][j]);
				else
				{
					List<Character> list3 = new ArrayList<Character>();
					list3.add(board[i][j]);
					hm.put(key2,list3);
				}
				}
		HashMap<Integer,List<Integer>> hm2= new HashMap<Integer,List<Integer>>();
		int counter = 0;
		for(int i=0;i<9;i++)
			for(int j=0;j<9;j++)
			{
				if(!hm2.containsKey(counter))
				{
				List<Integer> theList = new ArrayList<Integer>();
				theList.add(i);
				theList.add(j);
				theList.add(0);
				hm2.put(counter, theList);
				}
				if(board[i][j]=='.')
				{
				boolean IsAdd = false;
				int k;
				k= hm2.get(counter).get(2)==0?hm2.get(counter).get(2):1;
				for(;k<10;k++)
				{
					char temp = (char)(k+48);
					if(hm.get(i).contains(temp)||hm.get(j-9).contains(temp)||hm.get((i-i%3)*9+(j-j%3)+9).contains(temp))
						continue;
					else
					{
						hm.get(i).add(temp);
						hm.get(j-9).add(temp);
						hm.get((i-i%3)*9+(j-j%3)+9).add(temp);
						hm2.get(counter).remove(2);
						hm2.get(counter).add(k);
						board[i][j] = temp;
						counter++;
						IsAdd = true;
						break;
					}
				}
				if(!IsAdd)
				{
					i = hm2.get(counter).get(0);
					j = hm2.get(counter).get(1);
					//hm.get(i).remove(hm.get(i).size()-1);
					//hm.get(j-9).remove(hm.get(j-9).size()-1);
					//hm.get((i-i%3)*9+(j-j%3)+9).remove(hm.get((i-i%3)*9+(j-j%3)+9).size()-1);
					board[i][j] = '.';
				}
				}
			}
		
	}
	
public static void main(String[] args)
{
	char[][] charset= {{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};
	solveSudoku(charset);
}
}
