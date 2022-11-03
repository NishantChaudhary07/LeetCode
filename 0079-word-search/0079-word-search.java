class Solution {
    public static boolean search(char[][] board,int cr,int cc,String word,int idx){
        if(idx==word.length()){
            return true;
        }
        if(cr<0 || cr>=board.length || cc<0 || cc>=board[0].length || word.charAt(idx)!=board[cr][cc]){
            return false;
        }
        
        int[] r={-1,0,1,0};
        int[] c={0,-1,0,1};
        board[cr][cc]='*';
        for(int i=0;i<r.length;i++){
            boolean ans=search(board,cr+r[i],cc+c[i],word,idx+1);
            if(ans)
                return ans;
        }
        board[cr][cc]=word.charAt(idx);
        return false;
    }
    
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    boolean ans=search(board,i,j,word,0);
                    if(ans){
                        return ans;
                    }
                }
            }
        }
        return false;
    }
}