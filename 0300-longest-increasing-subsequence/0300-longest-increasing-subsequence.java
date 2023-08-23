class Solution {
    public int helper(int[] nums,int curr_idx,int prev_idx,int[][] dp){
        if(curr_idx>=nums.length){
            return 0;
        }
        if(dp[curr_idx][prev_idx+1]!=-1){
            return dp[curr_idx][prev_idx+1];
        }
        int take=0;
        if(prev_idx==-1 || nums[curr_idx]>nums[prev_idx]){
            take=1+helper(nums,curr_idx+1,curr_idx,dp);
        }
        int not_take=helper(nums,curr_idx+1,prev_idx,dp);
        return dp[curr_idx][prev_idx+1]=Math.max(take,not_take);
    }
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[][] dp=new int[n][n];
        for(int[] arr:dp){
            Arrays.fill(arr,-1);
        }
        return helper(nums,0,-1,dp);
    }
}