package leetcode;

public class UniquePathsII {
public int uniquePathsWithObstacles(int[][] obstacleGrid) {
	int m = obstacleGrid.length;
	if(m==0) return 0;
	int n = obstacleGrid[0].length;
    	int[][]array = new int[m][n];
    for(int i=0;i<m;i++)
    {
    	if(obstacleGrid[i][0]==1)
    	{
    		array[i][0] = 0;
    		continue;
    	}
    	array[i][0] = 1;
    }
    for(int j=0;j<n;j++)
    {
    	if(obstacleGrid[0][j]==1)
    	{
    		array[0][j] = 0;
    		continue;
    	}
    	array[0][j] = 1;
    }
    for(int i=1;i<m;i++)
    		for(int j=1;j<n;j++)
    		{
    			if(obstacleGrid[i][j]==1)
    			{
    				array[i][j] = 0;
    				continue;
    			}
    			array[i][j] = array[i-1][j]+array[i][j-1];
    		}
	return array[m-1][n-1] ; 
    }
}
