class Solution {
    public static void subset(int[] nums,List<Integer> list,List<List<Integer>> res,int i){
        if(i==nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
        
            
            list.add(nums[i]);
            subset(nums,list,res,i+1);
            while(i<nums.length-1 && (nums[i]==nums[i+1])){
                i++;
            }
            list.remove(list.size()-1);    
            subset(nums,list,res,i+1);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        subset(nums,list,res,0);
        return res;
    }
}
