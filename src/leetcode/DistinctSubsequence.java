package leetcode;

public class DistinctSubsequence {
	 public int numDistinct(String S, String T) {
	        int [][] memo = new int[S.length()+1][T.length()+1];
		for(int i=0;i<=S.length();i++)
			memo[i][0] = 1;
		for(int i=0;i<S.length();i++)
			for(int j=0;j<T.length();j++)
			{
				if(S.charAt(i)==T.charAt(j))
					memo[i+1][j+1] = memo[i][j]+memo[i][j+1];
				else
					memo[i+1][j+1] = memo[i][j+1];
			}
			return memo[S.length()][T.length()];
	    }
}
