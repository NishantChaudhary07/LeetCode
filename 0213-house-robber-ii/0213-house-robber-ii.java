class Solution {
    public int helper(int[] nums,int idx,int n,int[] dp){
        if(idx>=n){
            return 0;
        }
        if(dp[idx]!=-1){
            return dp[idx];
        }
        int take=nums[idx]+helper(nums,idx+2,n,dp);
        int dont_take=helper(nums,idx+1,n,dp);
        return dp[idx]=Math.max(take,dont_take);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        int first=helper(nums,0,n-1,dp);
        Arrays.fill(dp,-1);
        int sec=helper(nums,1,n,dp);
        return Math.max(first,sec);
    }
}