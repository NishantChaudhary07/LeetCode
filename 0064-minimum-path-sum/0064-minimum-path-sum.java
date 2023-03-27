class Solution {
    private int helper(int row,int col,int[][] grid,int[][] dp){
        if(row==grid.length-1 && col==grid[0].length-1){
            return grid[row][col];
        }
        
        if(row>=grid.length || col>=grid[0].length){
            return Integer.MAX_VALUE;
        }
        
        if(dp[row][col]!=-1){
            return dp[row][col];
        }
        return dp[row][col]=grid[row][col]+Math.min(helper(row+1,col,grid,dp),helper(row,col+1,grid,dp));
    }
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp=new int[m][n];

        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return helper(0,0,grid,dp);
    }
}