class Solution {
    public int help(int[][] grid,int i,int j,int[][] dp){
        if(i==grid.length-1 && j==grid[0].length-1){
            return grid[i][j];
        }
        if(i==grid.length || j==grid[0].length){
            return Integer.MAX_VALUE;
        }
        
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int right=help(grid,i,j+1,dp);
        int down=help(grid,i+1,j,dp);
        return dp[i][j]=grid[i][j]+Math.min(right,down);
    }
    public int minPathSum(int[][] grid) {
        int[][] dp=new int[grid.length][grid[0].length];
        for(int[] arr:dp){
            Arrays.fill(arr,-1);
        }
        return help(grid,0,0,dp);
    }
}