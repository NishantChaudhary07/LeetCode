class Solution {
    public static void combination(int n,int k,List<Integer> list,List<List<Integer>> res,int idx){
        if(list.size()==k){
            res.add(new ArrayList<Integer>(list));
            return;
        }
        for(int i=idx;i<=n;i++){
            list.add(i);
            combination(n,k,list,res,i+1);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        combination(n,k,list,res,1);
        return res;
    }
}