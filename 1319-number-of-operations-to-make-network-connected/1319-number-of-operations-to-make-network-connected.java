class Solution {
    public int BFT(List<List<Integer>> graph){
        Queue<Integer> q=new LinkedList<>();
        HashSet<Integer> vis=new HashSet<>();
        int comp=0;
        for(int src=0;src<graph.size();src++){
            if(vis.contains(src)){
                continue;
            }
            comp++;
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
        return comp-1;
        
    }
    public int makeConnected(int n, int[][] connections) {
        if(connections.length<n-1){
            return -1;
        }
            
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(i,new ArrayList<>());
        }
        for(int[] arr:connections){
            graph.get(arr[0]).add(arr[1]);
            graph.get(arr[1]).add(arr[0]);
        }
        return BFT(graph);
    }
}