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
        Map<Integer,Integer> map=new HashMap<>();
        map.put(1,0);
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        while(!q.isEmpty()){
            int v=q.remove();
            if(v==n*n){
                return map.get(v);
            }
            for(int i=1;i<=6;i++){
                if(v+i>n*n){
                    break;
                }
                int[] pos=findCordinates(v+i,n);
                int r=pos[0];
                int c=pos[1];
                int next=board[r][c]==-1?v+i:board[r][c];
                
                if(!map.containsKey(next)){
                    map.put(next,map.get(v)+1);
                    q.add(next);
                }
            }
        }
        return -1;
    }
}