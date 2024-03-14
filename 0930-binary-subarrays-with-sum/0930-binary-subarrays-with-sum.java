class Solution {
    public int helper(int[] nums, int goal) {
        int start=0,end=0,currsum=0,count=0;
        while(start<=end && end<nums.length){
            currsum+=nums[end];
            while(currsum>goal && start<=end){
                currsum-=nums[start];
                start++;
            }
            end++;
            
                count=count+end-start+1;
            
        }
        return count;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
       return helper(nums,goal)-helper(nums,goal-1);
}
}