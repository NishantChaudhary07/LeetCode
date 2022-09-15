class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count=0;
        int prod=1;
        int left=0;
        int right=0;
        while(right<nums.length){
             prod*=nums[right];
            while(prod>=k && left<=right){
                prod=prod/nums[left];
                left++;
            }
            count+=right-left+1;
            right++;
        }
    
        return count;
    }
    }
