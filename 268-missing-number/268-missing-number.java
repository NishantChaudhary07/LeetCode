class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int res=nums.length;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]!=nums[i]+1){
                res=nums[i]+1;
                break;
            }
        }
        if(nums[0]!=0)
            res=0;
        return res;
    }
}