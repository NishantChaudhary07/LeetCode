class Solution {
    public static void backtracking(int[] nums,List<Integer> lst,List<List<Integer>> res){
        if(lst.size()==nums.length){
            res.add(new ArrayList<>(lst));
        }
        else{
        for(int i=0;i<nums.length;i++){
            if(lst.contains(nums[i])) continue;
            lst.add(nums[i]);
            backtracking(nums,lst,res);
            lst.remove(lst.size()-1);
        }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> lst=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        backtracking(nums,lst,res);
        return res;
    }
}