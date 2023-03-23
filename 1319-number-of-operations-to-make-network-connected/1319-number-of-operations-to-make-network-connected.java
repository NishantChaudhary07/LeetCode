class Solution {
    public int BFT(HashMap<Integer,List<Integer>> map){
        int count=0;
        Queue<Integer> q=new LinkedList<>();
        HashSet<Integer> vis=new HashSet<>();
        for(int src:map.keySet()){
            if(vis.contains(src)){
                continue;
            }
            count++;
            q.add(src);
            while(!q.isEmpty()){
                int rem=q.remove();
                if(vis.contains(rem)){
                    continue;
                }
                vis.add(rem);
                for(int nbr:map.get(rem)){
                    if(!vis.contains(nbr)){
                        q.add(nbr);
                    }
                }
            }
        }
        return count;
    }
    
    public int makeConnected(int n, int[][] connections) {
        if(connections.length<n-1){
            return -1;
        }
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,new ArrayList<>());
        }
        
        for(int i=0;i<connections.length;i++){
            int v1=connections[i][0];
            int v2=connections[i][1];
            
//            
            map.get(v1).add(v2);
            map.get(v2).add(v1);
        }
        return BFT(map)-1;
    }
}