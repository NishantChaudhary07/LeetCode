class Solution {
    public static void paths(int src,int dest,int[][] graph,HashSet<Integer> vis,List<Integer> lst,List<List<Integer>> res){
        if(src==dest){
            res.add(new ArrayList<>(lst));
        }
        vis.add(src);
        for(int nbr:graph[src]){
            if(!vis.contains(nbr)){
                lst.add(nbr);
                paths(nbr,dest,graph,vis,lst,res);
                lst.remove(lst.size()-1);
            }
        }
        vis.remove(src);
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> lst=new ArrayList<>();
        lst.add(0);
        paths(0,graph.length-1,graph,new HashSet<>(),lst,res);
        return res;
    }
}