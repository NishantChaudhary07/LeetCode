class Solution {
    int helper(int[][] grid,int r,int c,int[][] dp){
        if(r==grid.length || c<0 || c==grid.length){
            return Integer.MAX_VALUE;
        }
        if(r==grid.length-1){
            return grid[r][c];
        }
        
        if(dp[r][c]!=Integer.MIN_VALUE){
            return dp[r][c];
        }
        
        int dia_left=helper(grid,r+1,c-1,dp);
        int down=helper(grid,r+1,c,dp);
        int dia_right=helper(grid,r+1,c+1,dp);
        return dp[r][c]=Math.min(dia_left,Math.min(down,dia_right))+grid[r][c];
    }
    public int minFallingPathSum(int[][] matrix) {
        int[][] dp=new int[matrix.length][matrix[0].length];
        for(int[] arr:dp){
            Arrays.fill(arr,Integer.MIN_VALUE);
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<matrix[0].length;i++){
            ans=Math.min(ans,helper(matrix,0,i,dp));
        }
        return ans;
    }
}