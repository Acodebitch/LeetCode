package leetcode;
// finish, it is pretty easy.
public class BestTimeToBuyandSellStock {
public int maxProfit(int[] prices)
{
	int num = prices.length;
	int [] maxLeft = new int[num];
	int [] maxRight = new int[num];
	int minl = prices[0];
	int maxl = 0;
	for(int i=0;i<num;i++)
	{
		maxl = maxl>(prices[i]-minl)?maxl:(prices[i]-minl);
		minl = minl<prices[i]?minl:prices[i];
		maxLeft[i] = maxl;
	}
	int maxr = 0;
	int maxr1 = prices[num-1];
	for(int i=num-1;i>=0;i--)
	{
		maxr = maxr>maxr1-prices[i]?maxr:maxr1-prices[i];
		maxr1 = maxr1>prices[i]?maxr1:prices[i];
		maxRight[i] = maxr;
	}
	int max = 0;
	for(int i=0;i<num;i++)
	{
		max = Math.max(max, maxLeft[i]+maxRight[i]);
	}
	return 0;
}
}
