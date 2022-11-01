class Solution {
    public static void combination(int[] candidates,int target,List<Integer> list,List<List<Integer>> res,int idx){
        if(target==0){
            res.add(new ArrayList<Integer>(list));
            return;
        }
        for(int i=idx;i<candidates.length;i++){
            if(i!=idx && candidates[i]==candidates[i-1])
                continue;
            if(target>=candidates[i]){
                list.add(candidates[i]);
                combination(candidates,target-candidates[i],list,res,i+1);
                list.remove(list.size()-1);
                // while(i<candidates.length-1 && candidates[i]==candidates[i+1]){
                //     i++;
                // }
            }
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        Arrays.sort(candidates);
        combination(candidates,target,list,res,0);
        return res;
    }
}