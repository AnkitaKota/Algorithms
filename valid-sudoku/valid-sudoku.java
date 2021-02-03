class Solution {
    public boolean isValidSudoku(char[][] board) {
        
       /* HashSet<Character> row = new HashSet<>();
          HashSet<Character> col = new HashSet<>();
         HashSet<Character> submatrix = new HashSet<>();
        int count = 0; 
        for(int i=0;i<board.length;i++)
        {
            row.clear();
            for(int j=0;j<9;j++)
            {
                
                if(!row.contains(board[i][j]) && board[i][j] == '.')
                {
                   row.add(board[i][j]) ;
                }
                else
                {
                    return false;
                }
                 if(!col.contains(board[j][i]) && board[j][i] == '.')
                 {
                     col.add(board[j][i]);
                 }
                else 
                    return false;
            }
        }
        
        
        for(int i=0;i<3;i++)
        {
           for(int j=0;j<3;j++)
            {
               count++;
                if(count == 9 )
                {
                 
                }
            }
        }
        
        */
        
        
        short[] rows = new short[9];
        short[] cols = new short[9];
        short[] submatrices = new short[9];
        
        for(int row=0;row<board.length;row++)
        {
            for(int col=0;col<board.length;col++)
            {
                if(board[row][col] == '.')
                {
                  continue;  
                }
                
                short value = (short) (1 << (board[row][col]-'1'));
                
                if((value & rows[row]) > 0) 
                {
                  return false;  
                }
                if((value & cols[col]) > 0)  {
                  return false;  
                }
                if((value & submatrices[3*(row/3) + (col/3)]) > 0 ) {
                  return false;  
                }
                
                rows[row] |= value;
                cols[col] |= value;
                submatrices[3*(row/3)+(col/3)] |= value;
                
                
            }
        }
        
      return true;  
    }
}