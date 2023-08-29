class Solution {
    public int mps(int[][] grid,int row,int col,int[][] dp){
        if(row==grid.length-1 && col==grid[0].length-1){
            return grid[row][col];
        }
        if(row==grid.length || col==grid[0].length){
            return Integer.MAX_VALUE;
        }
        if(dp[row][col]!=-1){
            return dp[row][col];
        }
        int right=mps(grid,row,col+1,dp);
        int down=mps(grid,row+1,col,dp);
        return dp[row][col]=Math.min(right,down)+grid[row][col];
    }
    public int minPathSum(int[][] grid) {
        int[][] dp=new int[grid.length][grid[0].length];
        for(int[] arr:dp){
            Arrays.fill(arr,-1);
        }
        return mps(grid,0,0,dp);
    }
}