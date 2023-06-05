class Solution {
    public int helper(int[][] grid,int r,int c,int[][] dp){
        if(c<0 || c>=dp[0].length){
            return Integer.MAX_VALUE;
        }
        if(r==dp.length-1){
            return grid[r][c];
        }
        if(dp[r][c]!=-100){
            return dp[r][c];
        }
        int cost=Integer.MAX_VALUE;
        for(int i=0;i<grid[0].length;i++){
            if(i!=c){
                cost=Math.min(cost,helper(grid,r+1,i,dp));
            }
        }
        return dp[r][c]=grid[r][c]+cost;
    }
    public int minFallingPathSum(int[][] grid) {
        int[][] dp=new int[grid.length][grid[0].length];
        for(int[] arr:dp){
            Arrays.fill(arr,-100);
        }
        int res=Integer.MAX_VALUE;
        for(int i=0;i<grid.length;i++){
            res=Math.min(res,helper(grid,0,i,dp));
        }
        return res;
    }
}