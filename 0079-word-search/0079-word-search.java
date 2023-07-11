class Solution {
    public static boolean isPresent(char[][] board,String word,int cr,int cc,int idx){
        if(idx==word.length()){
            return true;
        }
        if(cc<0 || cr<0 || cc>=board[0].length || cr>=board.length || board[cr][cc]!=word.charAt(idx)){
            return false;
        }
        board[cr][cc]='#';
        boolean down=isPresent(board,word,cr+1,cc,idx+1);
        boolean right=isPresent(board,word,cr,cc+1,idx+1);
        boolean up=isPresent(board,word,cr-1,cc,idx+1);
        boolean left=isPresent(board,word,cr,cc-1,idx+1);
        board[cr][cc]=word.charAt(idx);
        return left||right||up||down;
    }
    
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                if(isPresent(board,word,i,j,0)){
                    return true;
                }
                }
            }
        }
        return false;
    }
}