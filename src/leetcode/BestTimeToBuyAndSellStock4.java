package leetcode;

public class BestTimeToBuyAndSellStock4 {
// time limit exceed
	public int maxProfit(int k, int[] prices) {
        int num = prices.length;
	if(num==0)
		return 0;
	int [][][] m = new int[k][num][num];
	if(k==0)
	{
	    int min = prices[0];
	    int max = 0;
	    for(int i = 0;i<num;i++)
	        {
	            max = max>(prices[i]-min)?max:prices[i]-min;
	            min = min<prices[i]?min:prices[i];
	        }
	   return max;
	}
	for(int i=0;i<num;i++)
	{
		int min = prices[i];
		int maxPro = 0;
		for(int j=i;j<num;j++)
		{
			maxPro = maxPro>prices[j]-min?maxPro:prices[i]-min;
			min = min<prices[j]?min:prices[j];
			m[0][i][j] = maxPro;
		}
	}
	for(int l=1;l<k;l++)
	{
		for(int i=0;i<num;i++)
			for(int j =0;j<num;j++ )
			{
					m[l][i][j] = m[l-1][i][j];
					for(int n=i+1;n<j;n++)
						m[l][i][j] = Math.max(m[l][i][j],m[l-1][i][n]+m[l-1][n][k]);
			}
	}
	return m[k-1][0][num-1] ;
    }
}
