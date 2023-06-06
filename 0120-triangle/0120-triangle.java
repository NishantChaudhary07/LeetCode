class Solution {
    public int pathSum(List<List<Integer>> tri,int i,int j,int[][] dp){
        if(i>=tri.size() || j>=tri.get(i).size()){
            return Integer.MAX_VALUE;
        }
       if(i==tri.size()-1){
           return tri.get(i).get(j);
       } 
        if(dp[i][j]!=Integer.MIN_VALUE){
            return dp[i][j];
        }
        int down=pathSum(tri,i+1,j,dp);
        int right=pathSum(tri,i+1,j+1,dp);
        return dp[i][j]=tri.get(i).get(j)+Math.min(down,right);
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] dp=new int[triangle.size()][triangle.get(triangle.size()-1).size()];
        for(int[] arr:dp){
            Arrays.fill(arr,Integer.MIN_VALUE);
        }
        return pathSum(triangle,0,0,dp);
    }
}