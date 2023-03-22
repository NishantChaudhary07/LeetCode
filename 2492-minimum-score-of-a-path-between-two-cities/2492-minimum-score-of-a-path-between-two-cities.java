class Solution {
    public int minSco(int n,HashMap<Integer,HashMap<Integer,Integer>> map){
        Queue<Integer> q=new LinkedList<>();
        HashSet<Integer> visited=new HashSet<>();
        int minscore=Integer.MAX_VALUE;
        q.add(1);
        while(!q.isEmpty()){
            int rem=q.remove();
            if(visited.contains(rem)){
                continue;
            }
            visited.add(rem);
            
            for(int nbr:map.get(rem).keySet()){
                minscore=Math.min(minscore,map.get(rem).get(nbr));
                if(!visited.contains(nbr)){
                    q.add(nbr);
                }
            }
        }
        return minscore;
    }
    public int minScore(int n, int[][] roads) {
        HashMap<Integer,HashMap<Integer,Integer>> map=new HashMap<>();
        for(int i=1;i<=n;i++){
            map.put(i,new HashMap<Integer,Integer>());
        }
        for(int i=0;i<roads.length;i++){
            int v1=roads[i][0];
            int v2=roads[i][1];
            int cost=roads[i][2];
            map.get(v1).put(v2,cost);
            map.get(v2).put(v1,cost);
        }
        return minSco(n,map);
    }
}