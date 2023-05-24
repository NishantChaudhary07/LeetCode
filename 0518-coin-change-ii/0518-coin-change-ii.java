class Solution {
    private int helpBottomUp(int amount,int[] coins){
        int[][] dp=new int[amount+1][coins.length+1];
        for(int i=0;i<=coins.length;i++){
            dp[0][i]=1;
        }
       for(int amt=1;amt<dp.length;amt++){
           for(int i=1;i<dp[0].length;i++){
               int inc=0;
               int exc=0;
               if(amt>=coins[i-1]){
                inc=dp[amt-coins[i-1]][i];
               }
               exc=dp[amt][i-1];
               dp[amt][i]=inc+exc;
           }
       }
           return dp[amount][coins.length];
           
    }
    public int change(int amount, int[] coins) {
        return helpBottomUp(amount,coins);
    }
}