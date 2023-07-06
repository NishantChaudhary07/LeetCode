class Solution {
    public static void combination(int[] candidates,int idx,int currsum,int target,List<Integer> lst,List<List<Integer>> res){
        if(currsum>target){
            return;
        }
        if(currsum==target){
            res.add(new ArrayList<>(lst));
        }
        for(int i=idx;i<candidates.length;i++){
            lst.add(candidates[i]);
            combination(candidates,i,currsum+candidates[i],target,lst,res);
            lst.remove(lst.size()-1);
        }
        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> lst=new ArrayList<>();
        combination(candidates,0,0,target,lst,res);
        return res;
    }
}