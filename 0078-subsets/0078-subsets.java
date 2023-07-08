class Solution {
    public static void subset(int[] nums,int start,List<Integer> lst,List<List<Integer>> res){
        res.add(new ArrayList<>(lst));
        for(int i=start;i<nums.length;i++){
            lst.add(nums[i]);
            subset(nums,i+1,lst,res);
            lst.remove(lst.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> lst=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        subset(nums,0,lst,res);
        return res;
    }
}