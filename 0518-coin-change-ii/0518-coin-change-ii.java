class Solution {
    public int helper(int amt,int[] coins,int idx,int[][] dp){
        if(idx>=coins.length){
            return 0;
        }
        if(amt==0){
            return 1;
        }
        if(dp[amt][idx]!=-1){
            return dp[amt][idx];
        }
        int inc=0;
        if(amt>=coins[idx]){
            inc=helper(amt-coins[idx],coins,idx,dp);
        }
        int dont_inc=helper(amt,coins,idx+1,dp);
        return dp[amt][idx]=inc+dont_inc;
    }
    public int change(int amount, int[] coins) {
        int[][] dp=new int[amount+1][coins.length];
        for(int[] arr:dp){
            Arrays.fill(arr,-1);
        }
        return helper(amount,coins,0,dp);
    }
}