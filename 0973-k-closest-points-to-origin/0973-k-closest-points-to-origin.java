class Solution {
   public class pair{
        int x;
        int y;
        int dist;
        pair(int x,int y,int dist){
            this.x=x;
            this.y=y;
            this.dist=dist;
        }
    }
    
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<pair> pq=new PriorityQueue<>(new Comparator<pair>(){
            public int compare(pair p1,pair p2){
                return p1.dist-p2.dist;
            }
        });
        for(int i=0;i<points.length;i++){
            int x=points[i][0];
            int y=points[i][1];
            int dist=x*x+y*y;
            pq.add(new pair(x,y,dist));
        }
        
        int[][] res=new int[k][2];
        for(int i=0;i<k;i++){
            pair p=pq.poll();
            res[i][0]=p.x;
            res[i][1]=p.y;
        }
        return res;
    }
}