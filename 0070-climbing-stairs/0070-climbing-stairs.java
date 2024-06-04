class Solution {
    public int helper(int n,int curr,int[] dp){
        if(curr+1>n || curr+2>n)
        {
            return 1;
        }
        if(dp[curr]!=-1){
            return dp[curr];
        }
        return dp[curr]=helper(n,curr+1,dp)+helper(n,curr+2,dp);
    }
    public int climbStairs(int n) {
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return helper(n,0,dp);
    }
}