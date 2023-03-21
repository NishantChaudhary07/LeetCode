class Solution {
    class BipartitePair{
        int vtx;
        int d;
        BipartitePair(int vtx,int d){
            this.vtx=vtx;
            this.d=d;
        }
    }
    
    public boolean helper(HashMap<Integer,HashMap<Integer,Integer>> map){
        Queue<BipartitePair> q=new LinkedList<>();
        HashMap<Integer,Integer> visited=new HashMap<>();
        for(int src:map.keySet()){
            if(visited.containsKey(src)){
                continue;
            }
            q.add(new BipartitePair(src,0));
            while(!q.isEmpty()){
                BipartitePair rem=q.remove();
                if(visited.containsKey(rem.vtx)){
                    if(rem.d!=visited.get(rem.vtx)){
                        return false;
                    }
                }
                visited.put(rem.vtx,rem.d);
                for(int nbrs:map.get(rem.vtx).keySet()){
                    if(!visited.containsKey(nbrs)){
                    q.add(new BipartitePair(nbrs,rem.d+1));
                    }
                }
            }
        }
        return true;
    }
    
    public boolean isBipartite(int[][] graph) {
        HashMap<Integer,HashMap<Integer,Integer>> map=new HashMap<>();
        for(int i=0;i<graph.length;i++){
            map.put(i,new HashMap<>());
        }
        
        for(int i=0;i<graph.length;i++){
            int[] nbrs=graph[i];
            for(int nbr:nbrs){
                map.get(i).put(nbr,0);
            }
        }
        return helper(map);
    }
}