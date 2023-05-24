class Solution {
    private int help(int amt,int[] coins,int i,int[][] dp){
        if(amt==0){
            return 1;
        }
        if(i==coins.length){
            return 0;
        }
        if(dp[amt][i]!=-1){
            return dp[amt][i];
        }
        int inc=0;
        int exc=0;
        if(amt>=coins[i]){
            inc=help(amt-coins[i],coins,i,dp);
        }
        exc=help(amt,coins,i+1,dp);
        return dp[amt][i]=inc+exc;
    }
    public int change(int amount, int[] coins) {
        int[][] dp=new int[amount+1][coins.length];
        for(int []arr:dp){
            Arrays.fill(arr,-1);
        }
        return help(amount,coins,0,dp);
    }
}