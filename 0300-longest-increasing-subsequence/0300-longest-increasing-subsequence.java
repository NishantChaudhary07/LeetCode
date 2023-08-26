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
        int[][] dp=new int[n+1][n+1];
        for(int idx=n-1;idx>=0;idx--){
            for(int prev_idx=idx-1;prev_idx>=-1;prev_idx--){
                int take=0;
                if(prev_idx==-1 || nums[idx]>nums[prev_idx]){
                    take=1+dp[idx+1][idx+1];
              }
                int not_take=dp[idx+1][prev_idx+1];
                dp[idx][prev_idx+1]=Math.max(take,not_take);
            }
        }
        return dp[0][0];
    }
}