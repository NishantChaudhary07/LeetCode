class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int prod=1;
        int count=0;
        int left=0,right=0;
        while(right<nums.length){
            prod*=nums[right];
            while(prod>=k && left<=right){
                prod/=nums[left];
                left++;
            }
            count+=right-left+1;
            right++;
        }
        return count;
    }
}