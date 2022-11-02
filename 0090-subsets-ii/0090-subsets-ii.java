class Solution {
    public static void subset(int[] nums,List<Integer> list,List<List<Integer>> res,int i){
        if(i==nums.length){
            if(!res.contains(list))
            res.add(new ArrayList<Integer>(list));
            return;
        }
        // if(i>0 && i<nums.length && nums[i]==nums[i-1])
        //     i=i+1;
        subset(nums,list,res,i+1);
        list.add(nums[i]);
        subset(nums,list,res,i+1);
        list.remove(list.size()-1);
        
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        subset(nums,list,res,0);
        return res;
    }
}