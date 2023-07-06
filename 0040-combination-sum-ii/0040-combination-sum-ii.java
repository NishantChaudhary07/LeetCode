class Solution {
    public static void combo(int[] candidates,int currsum,int target,int idx,List<Integer> lst,List<List<Integer>> res){
        if(currsum>target){
            return;
        }
        if(currsum==target){
            res.add(new ArrayList<>(lst));
        }
        for(int i=idx;i<candidates.length;i++){
            if(i!=idx && candidates[i-1]==candidates[i]){
                continue;
            }
            lst.add(candidates[i]);
            combo(candidates,currsum+candidates[i],target,i+1,lst,res);
            lst.remove(lst.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> lst=new ArrayList<>();
        Arrays.sort(candidates);
        combo(candidates,0,target,0,lst,res);
        return res;
    }
}