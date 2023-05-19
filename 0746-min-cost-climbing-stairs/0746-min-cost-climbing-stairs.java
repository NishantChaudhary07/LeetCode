class Solution {
    private int minCostTopDownDP(int[] cost,int i,int[] dp){
        if(i>=cost.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int oneStep=minCostTopDownDP(cost,i+1,dp);
        int twoStep=minCostTopDownDP(cost,i+2,dp);
        return dp[i]=Math.min(oneStep,twoStep)+cost[i];
    }
    public int minCostClimbingStairs(int[] cost) {
        int[] dp=new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min(minCostTopDownDP(cost,0,dp),minCostTopDownDP(cost,1,dp));
    }
}