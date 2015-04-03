package leetcode;

public class DecodeWays {
	
	// this method is copy form Internet,I am sitll not quite understand
//	 public static int numDecodings(String s) {
//		 int n = s.length();
//	        if (n == 0) return 0;
//
//	        int[] memo = new int[n+1];
//	        memo[n]  = 1;
//	        memo[n-1] = s.charAt(n-1) != '0' ? 1 : 0;
//
//	        for (int i = n - 2; i >= 0; i--)
//	            if (s.charAt(i) == '0') continue;
//	            else memo[i] = (Integer.parseInt(s.substring(i,i+2))<=26) ? memo[i+1]+memo[i+2] : memo[i+1];
//
//	        return memo[0];
//	    }
	public static int numDecodings(String s)
	{
		int length = s.length();
		if(length==0||s.charAt(0)=='0')
			return 0;
		int sum = 1;
		for(int i=1;i<length;i++)
		{
			if(Integer.parseInt(s.substring(i-1, i+1))<26)
			{
				if(s.charAt(i)=='0')
					continue;
				sum++;
			}
			if(s.charAt(i)=='0'&&s.charAt(i-1)=='0')
				return 0;
			
			
		}
		return sum;
	}
	 public static void main(String [] args)
	 {
		 System.out.println(numDecodings("2110"));
	 }
}
