class Solution {
    
    private int BFS(HashMap<Integer,List<Integer>> map){
        Queue<Integer> q=new LinkedList<>();
        HashSet<Integer> vis=new HashSet<>();
        int count=0;
        q.add(0);
        while(!q.isEmpty()){
            int rem=q.remove();
            if(vis.contains(rem)){
                continue;
            }
            vis.add(Math.abs(rem));
            if(rem>0){
                count++;
            }
            for(int nbr:map.get(Math.abs(rem))){
                if(!vis.contains(Math.abs(nbr))){
                    q.add(nbr);
                }
            }
        }
        return count;
    }
    
    public int minReorder(int n, int[][] connections) {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,new ArrayList<>());
        }
        for(int  i=0;i<connections.length;i++){
            int v1=connections[i][0];
            int v2=connections[i][1];
            map.get(v1).add(v2);
            map.get(v2).add(-v1);
        }
        return BFS(map);
    }
}