class Solution {
    public static void combinations(int[] candidates,int target,List<Integer> list,List<List<Integer>> res,int idx){
        if(target==0){
            res.add(new ArrayList<Integer>(list));
            return;
        }
        for(int i=idx;i<candidates.length;i++){
            if(target>=candidates[i]){
                list.add(candidates[i]);
                combinations(candidates,target-candidates[i],list,res,i);
                list.remove(list.size()-1);
            }
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        combinations(candidates,target,list,res,0);
        return res;
    }
}