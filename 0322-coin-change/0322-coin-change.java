class Solution {
    public int helper(int[] coins,int amt,int[] dp){
        if(amt==0){
            return 0;
        }
        if(dp[amt]!=-1){
            return dp[amt];
        }
        int updcount=Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++){
            if(amt-coins[i]>=0){
                int curr=helper(coins,amt-coins[i],dp);
                if(curr!=Integer.MAX_VALUE && curr+1<updcount){
                    updcount=curr+1;
                }
            }
        }
        return dp[amt]=updcount;
    }
    public int coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1];
        Arrays.fill(dp,-1);
        int res=helper(coins,amount,dp);
        return res==Integer.MAX_VALUE?-1:res;
    }
}