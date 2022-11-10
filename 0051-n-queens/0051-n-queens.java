class Solution {
   public static boolean isPossible(boolean[][] board,int row,int col){
       int r=row,c=col;
       while(r>=0){
           if(board[r][c]==true){
               return false;
           }
           r--;
       }
       r=row;c=col;
       while(r>=0 && c>=0){
           if(board[r][c]==true){
               return false;
           }
           r--;
           c--;
       }

       r=row;c=col;
       while(r>=0 && c<board.length){
           if(board[r][c]==true){
               return false;
           }
           r--;
           c++;
       }
       return true;
   }

    public static void printPath(boolean[][] board,int row,int queens,List<String> list,List<List<String>> res){
        if(queens==0){
            for(int i=0;i<board.length;i++){
                String str="";
                for(int j=0;j<board.length;j++){
                    if(board[i][j]==true){
                        str+='Q';
                    }
                    else{
                        str+='.';
                    }
                }
                list.add(str);
            }
            res.add(new ArrayList<String>(list));
            list.clear();
            return;
        }
        if(row>=board.length){
            return;
        }
        for(int col=0;col<board.length;col++){
            if(isPossible(board,row,col)){
                board[row][col]=true;
                printPath(board,row+1,queens-1,list,res);
                board[row][col]=false;
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res=new ArrayList<>();
        List<String> list=new ArrayList<>();
        boolean[][] board=new boolean[n][n];
        printPath(board,0,n,list,res);
        return res;
    }
}