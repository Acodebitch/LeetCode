package leetcode;
public class MaximunProductSubarray {
public int maxProduct(int []A)
{
	int length = A.length;
	int result = A[0];
	int max = A[0],min = A[0];
	for(int i=1;i<length;i++)
	{
		int temp = max;
		max = Math.max(Math.max(max*A[i], min*A[i]),A[i]);
		min = Math.min(Math.max(temp*A[i], min*A[i]), A[i]);
		if(max>result)
			result = max;
	}
	return result;
}
}
