package leetcode;
// finish it is pretty easy.
public class BestTimeToBuyAndSaleStock {
	 public int maxProfit(int[] prices) {
	     if(prices.length<2)
	    	 return 0;
		 int min = prices[0],sum = 0;
		 for(int i=1;i<prices.length;i++)
		 {
			 min = Math.min(min, prices[i]);
			 sum = Math.max(sum, prices[i]-min);
		 }
		 return sum;
	    }
	 
}
