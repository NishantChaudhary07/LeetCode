class Solution {
    int helper(int cr,int cc,int tr,int tc,int[][] dp){
        if(cr==tr || cc==tc){
            return 0;
        }
        if(cr==tr-1 && cc==tc-1){
            return 1;
        }
        if(dp[cr][cc]!=-1){
            return dp[cr][cc];
        }
        int right=helper(cr,cc+1,tr,tc,dp);
        int down=helper(cr+1,cc,tr,tc,dp);
        return dp[cr][cc]=right+down;
    }
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        for(int[] arr:dp){
            Arrays.fill(arr,-1);
        }
        return helper(0,0,m,n,dp);
    }
}