class Solution {
    public int[] findCord(int curr,int n){
        int[] cord=new int[2];
        int r=n-(curr-1)/n-1;
        int c=(curr-1)%n;
        cord[0]=r;
        cord[1]=c;
        if(r%2==n%2){
            cord[1]=n-c-1;
        }
        return cord;
    }
    public int snakesAndLadders(int[][] board) {
        int n=board.length;
        int steps=0;
        Queue<Integer> q=new LinkedList<>();
        HashSet<Integer> vis=new HashSet<>();
        q.add(1);
        vis.add(1);
        while(!q.isEmpty()){
            int size=q.size();
            while(size-->0){
            int v=q.poll();
            if(v==n*n){
                return steps;
            }
            for(int i=v+1;i<=v+6;i++){
                if(i>n*n){
                    break;
                }
                int[] cord=findCord(i,n);
                int r=cord[0];
                int c=cord[1];
                if(vis.contains(i)){
                    continue;
                }
                vis.add(i);
                if(board[r][c]==-1){
                    q.add(i);
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