class Solution {
    public int SqCount(int n,int sq,int[][] dp){
        if(n<0){
            return 0;
        }
        if(n==0){
            return 0; 
        }
        if(sq*sq>n){
            return 100000000;
        }
        if(dp[sq][n]!=-1){
            return dp[sq][n];
        }
        int not_take=SqCount(n,sq+1,dp);
        int take=100000000;
        if(sq*sq<=n){
            take=1+SqCount(n-sq*sq,sq,dp);
        }
        return dp[sq][n]=Math.min(take,not_take);
    }
    public int numSquares(int n) {
      int[][] dp=new int[(int)Math.sqrt(n)+1][n+1]; 
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
     return SqCount(n,1,dp);
    }
}