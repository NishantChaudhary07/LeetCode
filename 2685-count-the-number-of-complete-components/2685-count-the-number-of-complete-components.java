class Solution {
    int count=0;
    public int countComponents(List<List<Integer>> graph){
        Queue<Integer> q=new LinkedList<>();
        HashSet<Integer> vis=new HashSet<>();
        for(int src=0;src<graph.size();src++){
            if(vis.contains(src)){
                continue;
            }
            q.add(src);
            int edges=0,vertex=0;
            while(!q.isEmpty()){
                int rem=q.poll();
                if(vis.contains(rem)){
                    continue;
                }
                vertex++;
                vis.add(rem);
                for(int nbr:graph.get(rem)){
                    edges++;
                    if(!vis.contains(nbr)){
                        q.add(nbr);
                    }
                }
            }
             edges/=2;
                if(edges==(vertex-1)*vertex/2) {
                    count++;
                }
        }
        return count;
    }
    
    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(i,new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            graph.get(edges[i][0]).add(edges[i][1]);
            graph.get(edges[i][1]).add(edges[i][0]);
        }
        System.out.print(graph);
        return countComponents(graph);
        // return count;
    }
}