class Solution {
    public int longestCycle(int[] edges) {
        int[] in=new int[edges.length];
        for(int i=0;i<in.length;i++){
            if(edges[i]!=-1){
                in[edges[i]]++;
            }
        }
        
        boolean[] vis=new boolean[edges.length];
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<in.length;i++){
            if(in[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int rem=q.remove();
            vis[rem]=true;
            int nbr=edges[rem];
            if(nbr!=-1){
                in[nbr]--;
                if(in[nbr]==0){
                    q.add(nbr);
                }
            }
        }
        int cyclelen=-1;
        for(int i=0;i<vis.length;i++){
            if(!vis[i]){
                int count=1;
                int nbr=edges[i];
                vis[i]=true;
                while(nbr!=i){
                    vis[nbr]=true;
                    count++;
                    nbr=edges[nbr];
                }
                cyclelen=Math.max(cyclelen,count);
            }
        }
        return cyclelen;
    }
}