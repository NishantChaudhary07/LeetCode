class Solution {
    public static void subset(int[] nums,int start,List<Integer> lst,List<List<Integer>> res){
       res.add(new ArrayList<>(lst));
        for(int i=start;i<nums.length;i++){
            if(i>start && nums[i-1]==nums[i]){
                continue;
            }
            lst.add(nums[i]);
            subset(nums,i+1,lst,res);
            lst.remove(lst.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> lst=new ArrayList<>();
        Arrays.sort(nums);
        subset(nums,0,lst,res);
        return res;
    }
}