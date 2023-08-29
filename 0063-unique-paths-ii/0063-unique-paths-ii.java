class Solution {
    public int helper(int[][] grid,int row,int col,int[][] dp){
        if(row==grid.length-1 && col==grid[0].length-1 && grid[row][col]==0){
            return 1;
        }
        if(row==grid.length || col==grid[0].length || grid[row][col]==1){
            return 0;
        }
        if(dp[row][col]!=-1){
            return dp[row][col];
        }
        grid[row][col]=1;
        int down=helper(grid,row+1,col,dp);
        int right=helper(grid,row,col+1,dp);
        grid[row][col]=0;
        return dp[row][col]=down+right;
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] dp=new int[obstacleGrid.length][obstacleGrid[0].length];
        for(int[] arr:dp){
            Arrays.fill(arr,-1);
        }
        return helper(obstacleGrid,0,0,dp);
    }
}