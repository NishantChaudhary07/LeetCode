class Solution {
    public int helper(int[][] dun,int i,int j,int[][] dp){
        if(i==dun.length || j==dun[0].length){
            return Integer.MAX_VALUE;
        }
        if(i==dun.length-1 && j==dun[0].length-1){
            return dun[i][j]>0?1:1-dun[i][j];
        }
        if(dp[i][j]!=Integer.MIN_VALUE){
            return dp[i][j];
        }
        int right=helper(dun,i,j+1,dp);
        int down=helper(dun,i+1,j,dp);
        int energy=Math.min(right,down)-dun[i][j];
        return dp[i][j]=energy>0?energy:1;
    }
    public int calculateMinimumHP(int[][] dungeon) {
        int[][] dp=new int[dungeon.length][dungeon[0].length];
        for(int[] arr:dp){
            Arrays.fill(arr,Integer.MIN_VALUE);
        }
        return helper(dungeon,0,0,dp);
    }
}