class Solution {
    
    public int[] findCordinates(int curr,int n){
        int[] pos=new int[2];
        int r=n-((curr-1)/n)-1;
        int col=(curr-1)%n;
        pos[1]=col;
        pos[0]=r;
        if(r%2==n%2){
            pos[1]=n-col-1;
        }
        return pos;
    }
    
    public int snakesAndLadders(int[][] board) {
        int n=board.length;
        int steps=0;
        Queue<Integer> q=new LinkedList<>();
        boolean[][]  vis=new boolean[n][n];
        q.add(1);
        vis[n-1][0]=true;
        while(!q.isEmpty()){
            int size=q.size();
            while(size-->0){
            int v=q.remove();
            if(v==n*n){
                return steps;
            }
            for(int i=1;i<=6;i++){
                if(v+i>n*n){
                    break;
                }
                int[] pos=findCordinates(v+i,n);
                int r=pos[0];
                int c=pos[1];
                if(vis[r][c]==true){
                    continue;
                }
                vis[r][c]=true;
                // System.out.println(board[r][c]+" "+steps);
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