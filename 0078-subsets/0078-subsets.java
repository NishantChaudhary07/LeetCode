class Solution {
    public static void subset(int[] nums,List<Integer> list,List<List<Integer>> res,int i){
        if(i==nums.length){
            res.add(new ArrayList<Integer>(list));
            return;
        }
        subset(nums,list,res,i+1);
        list.add(nums[i]);
        subset(nums,list,res,i+1);
        list.remove(list.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        subset(nums,list,res,0);
        return res;
    }
}