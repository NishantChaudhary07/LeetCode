class Solution {
    public int helper(int r,int c,int m,int n,int[][] dp){
        if(r>=m || c>=n){
            return 0;
        }
        if(r==m-1 && c==n-1){
            return 1;
        }
        if(dp[r][c]!=-1){
            return dp[r][c];
        }
        int right=helper(r,c+1,m,n,dp);
        int down=helper(r+1,c,m,n,dp);
        return dp[r][c]=right+down;
    }
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        for(int[] arr:dp){
            Arrays.fill(arr,-1);
        }
        return helper(0,0,m,n,dp);
    }
}