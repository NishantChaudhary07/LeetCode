class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int count=1;
        int res=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]+1==nums[i]){
                count++;
            }
            else if(nums[i-1]==nums[i]){
                continue;
            }
            else{
                count=1;
            }
            res=Math.max(res,count);
        }
        return res;
    }
}