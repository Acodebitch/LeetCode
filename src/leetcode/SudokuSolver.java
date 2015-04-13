package leetcode;

public class SudokuSolver {
	private boolean IsGet;
public void solveSudoku(char[][] board) {
		IsGet = false;
        BackTrack(0,0,board);
    }
public boolean IsvalidSudoku(char[][]board,int i,int j,char value)
{
	for(int m=0;m<9;m++)
		if(board[m][j] == value)
			return false;
	for(int n=0;n<9;n++)
		if(board[i][n]==value)
			return false;
	int equalnum = 0,row = i/3*3,column = j/3*3;
	for(int m=row;m<=row+2;m++)
		for(int n=column;n<=column+2;n++)
		{
			if(board[m][n] == value)
				equalnum++;
			if(equalnum>=1)
				return false;
		}
	return true;
}
public void BackTrack(int i, int j,char[][]board)
{
	if(i==8&&j==9)
	{
		for(int x=0;x<=8;x++)
		{
			for(int y=0;y<=8;y++)
			{
				System.out.print(board[x][y]);
			}
			System.out.println();
		}
		IsGet = true;
		return;
		
	}
	else
	{
		if(j<9)
		{
			if(board[i][j]!='.')
				BackTrack(i,j+1,board);
			else{
			for(int m=1;m<10;m++)
			{
				if(IsvalidSudoku(board,i,j,(char)(m+48)))
				{
					board[i][j] = (char)(m+48);
					BackTrack(i,j+1,board);
					if(IsGet) return;
					board[i][j] = '.';
					
				}
		
			}
			}
		}
		else
		{
			j=0;
			if(board[i+1][j]!='.')
				BackTrack(i+1,j+1,board);
			else
			{
				for(int m=1;m<10;m++)
				{
					if(IsvalidSudoku(board,i+1,j,(char)(m+48)))
					{
						board[i+1][j] = (char)(m+48);
						BackTrack(i+1,j+1,board);
						if(IsGet) return;
						board[i+1][j] = '.';
						
					}
			
				}
			}
			
		}
	}
		
		
}
public static void main(String[] args)
{
	char[][] charset= {{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};
	SudokuSolver ss = new SudokuSolver();
	ss.solveSudoku(charset);
	
}
}
