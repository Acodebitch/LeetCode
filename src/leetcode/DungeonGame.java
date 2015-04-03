package leetcode;

public class DungeonGame {
	// I can't do it, i am so cheap,this anwser is definitely wrong, so I must look backward
//public int calculateMinimumHP(int[][] dungeon) {
//	 int m = dungeon.length;
//	    if(m==0) return 0;
//	    	int n = dungeon[0].length;
//	    int[][] current = new int[m][n];
//	    int[][] minimal = new int[m][n];
//	    current[0][0] = minimal[0][0] = dungeon[0][0];
//	    for(int i=1;i<m;i++)
//	    		{
//	    	current[i][0] = current[i-1][0] + dungeon[i][0];
//	    	minimal[i][0] = minimal[i-1][0]<current[i][0]?minimal[i-1][0]:current[i][0];
//	    		}
//	    for(int j=1;j<n;j++)
//	    {
//	    	current[0][j] = current[0][j-1] + dungeon[0][j];
//	    	minimal[0][j] = minimal[0][j-1]<current[0][j]?minimal[0][j-1]:current[0][j];
//	    }
//	    for(int i=1;i<m;i++)
//	    		for(int j=1;j<n;j++)
//	    		{
//	    			if(minimal[i-1][j]>minimal[i][j-1])
//	    			{
//	    				current[i][j] = current[i-1][j]+dungeon[i][j];
//	    				minimal[i][j] = minimal[i-1][j]<current[i][j]?minimal[i-1][j]:current[i][j];
//	    			}
//	    			else
//	    			{
//	    				current[i][j] = current[i][j-1]+dungeon[i][j];
//	    				minimal[i][j] = minimal[i][j-1]<current[i][j]?minimal[i][j-1]:current[i][j];
//	    			}
//	    		}
//	    		if(minimal[m-1][n-1]>0)
//	    			return 1;
//	    		else
//	    		{
//	    			return 1-minimal[m-1][n-1];
//	    		}
//    }
	public int calculateMinimumHP(int[][] dungeon)
	{
		int m = dungeon.length;
		if(m==0)
			return 0;
		int n = dungeon[0].length;
		int [][]array = new int[m][n];
		array[m-1][n-1] = getValue(1,dungeon[m-1][n-1]);
		for(int i = n-2;i>=0;i--)
			array[m-1][i] = getValue(array[m-1][i+1],dungeon[m-1][i]);
		for(int j =m-2;j>=0;j--)
			array[j][n-1] = getValue(array[j+1][n-1],dungeon[j][n-1]);
		for(int i = m-2;i>=0;i--)
			for(int j=n-2;j>=0;j--)
			{
				array[i][j] = Math.min(getValue(array[i+1][j],dungeon[i][j]), getValue(array[i][j+1],dungeon[i][j]));
			}
		return array[0][0];
	}
	public int getValue(int i,int j)
	{
		if(j>=0)
		{
			if(i<=j)
				return 1;
			return i-j;
		}
		return i-j;
	}
}
