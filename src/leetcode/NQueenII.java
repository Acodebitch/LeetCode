package leetcode;

public class NQueenII {
	  private int sum;
	  private int [] vertical;
	  int[] maindiag;
	  int[] antidiag;
	  public int totalNQueens(int n) {
	          sum = 0 ;
	          vertical = new int[n];
	          antidiag=new int[2*n];
	          maindiag=new int[2*n];
	          Backtrack(0,n);
	          return sum;
	      }
	  public void Backtrack(int i,int n)
	  {
	  	if(i==n)
	  	{
	  		sum++;
	  	}
	  	else
	  	{
	  		for(int j=0;j<n;j++)
	  		{
	  		    boolean ok = (vertical[j]==0&& maindiag[i+j]==0 && antidiag[i-j+n]==0);
	  			if(ok)
	  			{
	  			    vertical[j]=maindiag[i+j]=antidiag[i-j+n]=1; 
	  				Backtrack(i+1,n);
	  			    vertical[j]=maindiag[i+j]=antidiag[i-j+n]=0; 
	  				
	  			}
	  		}
	  	}
	  }
}
