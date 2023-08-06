class Solution {
    public int BFS(List<List<Integer>> graph){
        int count=0;
        Queue<Integer> q=new LinkedList<>();
        HashSet<Integer> vis=new HashSet<>();
        for(int src=0;src<graph.size();src++){
            if(vis.contains(src)){
                continue;
            }
            count++;
            q.add(src);
            while(!q.isEmpty()){
                int rem=q.poll();
                if(vis.contains(rem)){
                    continue;
                }
                vis.add(rem);
                for(int nbr:graph.get(rem)){
                    if(!vis.contains(nbr)){
                        q.add(nbr);
                    }
                }
            }
        }
        return count;
    }
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(i,new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1 && i!=j){
                    graph.get(i).add(j);
                    graph.get(j).add(i);
                }
            }
        }
        return BFS(graph);
    }
}