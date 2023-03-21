class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int right=0;
        long subarr=0,res=0;
        while(right<nums.length){
            if(nums[right]==0){
                subarr++;
            }
            else{
                subarr=0;
            }
            res+=subarr;
            right++;
        }
        return res;
    }
}