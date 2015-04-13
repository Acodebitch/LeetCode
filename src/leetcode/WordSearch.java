package leetcode;

public class WordSearch {
	boolean IsExist;
	boolean [][] Istravse;
	int num;
	public boolean exist(char[][] board, String word) {
	    
		int l = board.length;
	    if(l<=0) return false;
	    if(word.length()==0) return true;
	    int k = board[0].length;
	    Istravse = new boolean[l][k];
	    IsExist = false;
	    num = 0;
	    for(int i=0;i<l;i++)
	    		for(int j=0;j<k;j++)
	    		{
	    			if(board[i][j] == word.charAt(0))
	    				{num = 0;Istravse[i][j] = true;BackTrack(i,j,board,word);Istravse[i][j] = false;if(IsExist) return true;}
	    		}
		return IsExist;
	    }
	public void BackTrack(int i, int j, char[][] board, String word)
	{
		if(num>=word.length()-1)
		{
			IsExist = true;
		}
		else
		{
			if(i+1<board.length&&board[i+1][j]==word.charAt(num+1)&&!Istravse[i+1][j])
			{
				num+=1;
				Istravse[i+1][j] = true;
				BackTrack(i+1,j,board,word);
				Istravse[i+1][j] = false;
				if(num>=word.length()-1)
					return;
				num-=1;
				
			}
			if(j+1<board[0].length&&board[i][j+1]==word.charAt(num+1)&&!Istravse[i][j+1])
				{
				num+=1;
				Istravse[i][j+1] = true;
				BackTrack(i,j+1,board,word);
				Istravse[i][j+1] = false;
				if(num>=word.length()-1)
					return;
				num-=1;
				
				}
			if(i-1>-1&&board[i-1][j]==word.charAt(num+1)&&!Istravse[i-1][j])
			{
				num+=1;
				Istravse[i-1][j] = true;
				BackTrack(i-1,j,board,word);
				Istravse[i-1][j] = false;
				if(num>=word.length()-1)
					return;
				num-=1;
				
			}
			if(j-1>-1&&board[i][j-1]==word.charAt(num+1)&&!Istravse[i][j-1])
			{
				num+=1;
				Istravse[i][j-1] = true;
				BackTrack(i,j-1,board,word);
				Istravse[i][j-1] = false;
				if(num>=word.length()-1)
					return;
				num-=1;
				
			}
		}
			
	}
public static void main(String [] args)
{
	WordSearch ws  = new WordSearch();
	char[][] b = {
			{'A','B','C','E'},
			{'S','F','C','S'},
			{'A','D','E','E'}
	};
	String s = "ASAC";
	System.out.println(ws.exist(b,s));
}
}
