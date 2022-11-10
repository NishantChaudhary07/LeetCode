class Solution {
    public static boolean solver(char[][] board,int row,int col){
        if(col==board.length){
            row++;
            col=0;
        }
        if(row==board.length){
            return true;
        }
        if(board[row][col]!='.'){
            return solver(board,row,col+1) ;
        }
        else{
            for(char val='1';val<='9';val++){
                if(isPossible(board,row,col,val)){
                    board[row][col]=val;
                    if(solver(board,row,col+1)) return true;
                    board[row][col]='.';
                }
            }
        }
        return false;
    }

    public static boolean isPossible(char[][] board,int row,int col,char val) {
      for(int i=0;i<board.length;i++){
          if(board[row][i]==val){
              return false;
          }
          if(board[i][col]==val){
              return false;
          }
      }
      int r=row-row%3;
      int c=col-col%3;
      for(int i=r;i<r+3;i++){
         for(int j=c;j<c+3;j++){
             if(board[i][j]==val){
                 return false;
             }
         }
      }
      return true;
    }
  
    public void solveSudoku(char[][] board) {
        solver(board,0,0);
    }
}