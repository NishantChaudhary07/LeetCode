class Solution {
    private long BFT(HashMap<Integer,List<Integer>> map,int n){
        long pairs=0;
        long cumlen=0;
       Queue<Integer> q=new LinkedList<>();
       HashSet<Integer> vis=new HashSet<>();
        for(int src:map.keySet()){
            if(vis.contains(src)){
                continue;
            }
            q.add(src);
            long cyclelen=0;
            while(!q.isEmpty()){
                int rem=q.remove();
                if(vis.contains(rem)){
                    continue;
                }
                vis.add(rem);
                cyclelen++;
                for(int nbr:map.get(rem)){
                    if(!vis.contains(nbr)){
                        q.add(nbr);
                    }
                }
            }
            cumlen+=cyclelen;
            pairs+=(n-cumlen)*cyclelen;
        }
        return pairs;
    }
    public long countPairs(int n, int[][] edges) {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int v1=edges[i][0];
            int v2=edges[i][1];
            map.get(v1).add(v2);
            map.get(v2).add(v1);
        }
        return BFT(map,n);
    }
}