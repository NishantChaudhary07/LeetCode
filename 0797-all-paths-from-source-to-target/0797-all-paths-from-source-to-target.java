class Solution {
    private void Path(HashMap<Integer,HashMap<Integer,Integer>> map,int src,int dest,List<List<Integer>> paths,List<Integer> lst,HashSet<Integer> vis){
    if(src==dest){
        lst.add(src);
        paths.add(new ArrayList<>(lst));
        lst.remove(lst.size()-1);
        return;
    }
        vis.add(src);
        lst.add(src);
        for(int nbrs:map.get(src).keySet()){
            if(!vis.contains(nbrs)){
            Path(map,nbrs,dest,paths,lst,vis);
            }
        }
        
        vis.remove(src);
        lst.remove(lst.size()-1);
    }
    
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        HashMap<Integer,HashMap<Integer,Integer>> map=new HashMap<>();
        for(int i=0;i<graph.length;i++){
            map.put(i,new HashMap<>());
        }
        
        for(int i=0;i<graph.length;i++){
            int[] vs=graph[i];
            for(int v:vs){
                map.get(i).put(v,1);
            }
        }
        List<List<Integer>> res=new ArrayList<>();
        Path(map,0,graph.length-1,res,new ArrayList<>(),new HashSet<>());
        return res;
        
    }
}