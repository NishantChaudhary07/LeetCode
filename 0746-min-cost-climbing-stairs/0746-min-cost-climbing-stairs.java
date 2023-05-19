class Solution {
    private int minCostBottomUpDP(int[] cost,int[] dp){
        dp[0]=cost[0];
        dp[1]=cost[1];
        int n=cost.length;
        for(int i=2;i<n;i++){
            dp[i]=Math.min(dp[i-1],dp[i-2])+cost[i];
        }
        return Math.min(dp[n-2],dp[n-1]);
    }
    public int minCostClimbingStairs(int[] cost) {
        int[] dp=new int[cost.length];
        return minCostBottomUpDP(cost,dp);
    }
}