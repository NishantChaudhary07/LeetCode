class Solution {
    public void helper(int[] can,int t,List<List<Integer>> res,List<Integer> lst,int idx){
        if(t<0){
            return;
        }
        if(t==0){
            res.add(new ArrayList<>(lst));
            return;
        }
        for(int i=idx;i<can.length;i++){
            lst.add(can[i]);
            helper(can,t-can[i],res,lst,i);
            lst.remove(lst.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> lst=new ArrayList<>();
        helper(candidates,target,res,lst,0);
        return res;
    }
}