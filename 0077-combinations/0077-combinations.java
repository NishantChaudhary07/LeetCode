class Solution {
    public static void combination(int n,int k,List<Integer> lst,List<List<Integer>> res,int idx){
        if(lst.size()==k){
            res.add(new ArrayList<>(lst));
            return;
        }
        for(int i=idx;i<=n;i++){
            lst.add(i);
            combination(n,k,lst,res,i+1);
            lst.remove(lst.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> lst=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        combination(n,k,lst,res,1);
        return res;
    }
}