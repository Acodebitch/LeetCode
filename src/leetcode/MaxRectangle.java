package leetcode;

public class MaxRectangle {
public int maximalRectangle(char[][] matrix) 
	{
		if(matrix.length == 0)
			return 0;
		int m = matrix.length,n = matrix[0].length;
		int [] height = new int[n];
		int [] right = new int[n];
		int [] left = new int[n];
		for(int i=0;i<n;i++)
		    right[i] = n;
		int maxA = 0;
		for(int i=0;i<m;i++)
		{
			int curLeft = 0,curRight = n;
			for(int j=0;j<n;j++)
			{
				if(matrix[i][j] =='1')
				{
					height[j]++;
					left[j] = Math.max(left[j], curLeft);
				}
				else
				{
					height[j] = 0;
					left[j] = 0;curLeft = j+1;
				}
			}
			for(int j=n-1;j>=0;j--)
			{
				if(matrix[i][j]=='1')  right[j] = Math.min(right[j],curRight);
				else
				{
					right[j] = n;
					curRight = j;
				}
			}
			for(int j=0;j<n;j++)
			{
				maxA = Math.max(maxA, (right[j]-left[j])*height[j]);
			}
		}
		return maxA;
		
	}
    
}
