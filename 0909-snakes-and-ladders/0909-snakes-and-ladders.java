class Solution {
    public int[] findCord(int curr,int n){
        int[] cord=new int[2];
        int r=n-((curr-1)/n)-1;
        int c=(curr-1)%n;
        cord[0]=r;
        cord[1]=c;
        if(r%2==n%2){
            cord[1]=n-c-1;
        }
        
        return cord;
    }
    public int snakesAndLadders(int[][] board) {
        int steps=0;
        int n=board.length;
        Queue<Integer> q=new LinkedList<>();
        boolean[][] vis=new boolean[n][n];
        q.add(1);
        vis[n-1][0]=true;
        while(!q.isEmpty()){
            int size=q.size();
            while(size-->0){
                int v=q.poll();
                if(v==n*n){
                    return steps;
                }
                for(int i=1;i<=6;i++){
                    if(v+i>n*n){
                        break;
                    }
                    int[] cord=new int[2];
                    cord=findCord(v+i,n);
                    int r=cord[0];
                    int c=cord[1];
                    if(vis[r][c]==true){
                        continue;
                    }
                    vis[r][c]=true;
                    if(board[r][c]==-1){
                        q.add(v+i);
                    }
                    else{
                        q.add(board[r][c]);
                    }
                }
            }
            steps++;
        }
        return -1;
    }
}