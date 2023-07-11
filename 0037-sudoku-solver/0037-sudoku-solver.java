class Solution {
    public static boolean isPossible(char[][] board,int cr,int cc,char val){
        for(int i=0;i<board.length;i++){
            if(board[cr][i]==val){
                return false;
            }
            if(board[i][cc]==val){
                return false;
            }
        }
        
        int row=cr-cr%3;
        int col=cc-cc%3;
        for(int i=row;i<row+3;i++){
            for(int j=col;j<col+3;j++){
                if(board[i][j]==val){
                    return false;
                }
            }
        }
        return true;
    }
    
    public static boolean solve(char[][] board,int cr,int cc){
        if(cc==board[0].length){
            cr++;
            cc=0;
        }
        if(cr==board.length){
            return true;
        }
        if(board[cr][cc]!='.'){
            return solve(board,cr,cc+1);
        }
    
        for(char i='1';i<='9';i++){
            if(isPossible(board,cr,cc,i)){
                board[cr][cc]=i;
                if(solve(board,cr,cc+1)){
                    return true;
                }
                board[cr][cc]='.';
            }
        }
        
        return false;
    }
    
    public void solveSudoku(char[][] board) {
        solve(board,0,0);
    }
}