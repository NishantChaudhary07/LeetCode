class Solution {
    class pair{
        int row;
        int col;
        int steps;
        pair(int row,int col,int steps){
            this.row=row;
            this.col=col;
            this.steps=steps;
        }
    }
    public int[][] updateMatrix(int[][] mat) {
        int row=mat.length;
        int col=mat[0].length;
        int[][] dist=new int[row][col];
        int[][] vis=new int[row][col];
        Queue<pair> q=new LinkedList<>();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j]==0){
                    vis[i][j]=1;
                    q.add(new pair(i,j,0));
                }
            }
        }
        
         int[] x={-1,0,+1,0};
         int[] y={0,+1,0,-1};
        while(!q.isEmpty()){
            pair curr=q.remove();
            int curr_row=curr.row;
            int curr_col=curr.col;
            int curr_steps=curr.steps;
            dist[curr_row][curr_col]=curr_steps;
            
           
            for(int i=0;i<4;i++){
                int nrow=curr_row+x[i];
                int ncol=curr_col+y[i];
                if(nrow>=0 && nrow<row && ncol>=0 && ncol<col && vis[nrow][ncol]==0){
                    vis[nrow][ncol]=1;
                    q.add(new pair(nrow,ncol,curr_steps+1));
                }
            }
        }
        return dist;
    }
}