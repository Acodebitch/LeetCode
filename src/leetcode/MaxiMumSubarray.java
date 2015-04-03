package leetcode;

public class MaxiMumSubarray {
	//this is exceeding time limit;
//public int maxSubArray(int[] A) {
//     int l = A.length,max=0;
//     if(l == 0)
//    	 return 0;
//     int [][] array = new int[l][l];
//     for(int i=0;i<l;i++)
//    	 	{
//    	 		array[i][i] = A[i];
//    	 		max = max>array[i][i]?max:array[i][i];
//    	 	}
//     for(int i=0;i<l;i++)
//    	 	for(int j=0;j<l;j++)
//    	 	{
//    	 		if(i!=j)
//    	 		{
//    	 			array[i][j] = array[i][j-1]+A[j];
//    	 			max = max>array[i][j]?max:array[i][j];
//    	 		}
//    	 	}
//     return max;
//    }
	public int maxSubArray(int[] A) {
		int num = A.length;
		int [] B = new int[num];
		int max = A[0];
		B[0] = A[0];
		for(int i=1;i<num;i++)
		{
			B[i] = B[i-1]>0?B[i-1]:A[i];
			max = Math.max(max, B[i]);
		}
		return max;
	}
	}

