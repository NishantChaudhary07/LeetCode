class Solution {
    public int coinChang(int[] coins,int amt,int[] dp){
        if(amt<0){
            return Integer.MAX_VALUE;
        }
        if(amt==0){
            return 0;
        }
        if(dp[amt]!=-1){
            return dp[amt];
        }
        int finalcount=Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++){
            int currcount=coinChang(coins,amt-coins[i],dp);
            if(currcount!=Integer.MAX_VALUE && currcount+1<finalcount){
                finalcount=currcount+1;
            }
        }
        return dp[amt]=finalcount;
    }
    public int coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1];
        Arrays.fill(dp,-1);
        int res=coinChang(coins,amount,dp);
        return res==Integer.MAX_VALUE?-1:res;
    
    }
}