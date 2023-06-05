class Solution {
    private int helper(int[][] mat,int i,int j,int[][] dp){
        if(j==mat[0].length || j<0){
            return Integer.MAX_VALUE;
        }
        if(i==mat.length-1){
            return mat[i][j];
        }
        if(dp[i][j]!=Integer.MIN_VALUE){
            return dp[i][j];
        }
        int left=helper(mat,i+1,j-1,dp);
        int down=helper(mat,i+1,j,dp);
        int right=helper(mat,i+1,j+1,dp);
        return dp[i][j]=mat[i][j]+Math.min(left,Math.min(right,down));
    }
    public int minFallingPathSum(int[][] matrix) {
        int[][] dp=new int[matrix.length][matrix[0].length];
        for(int[] arr:dp){
                Arrays.fill(arr,Integer.MIN_VALUE);
            }
        int res=Integer.MAX_VALUE;
        for(int i=0;i<matrix[0].length;i++){
            res=Math.min(res,helper(matrix,0,i,dp));
        }
        return res;
    }
}