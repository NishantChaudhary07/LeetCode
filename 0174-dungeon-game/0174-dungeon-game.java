class Solution {
    int helper(int[][] dungeon,int r,int c,int[][] dp){
        if(r==dungeon.length || c==dungeon[0].length){
            return Integer.MAX_VALUE;
        }
        if(r==dungeon.length-1 && c==dungeon[0].length-1){
            return dungeon[r][c]>0?1:1-dungeon[r][c];
        }
        if(dp[r][c]!=Integer.MIN_VALUE){
            return dp[r][c];
        }
        int right=helper(dungeon,r,c+1,dp);
        int down=helper(dungeon,r+1,c,dp);
        int health=Math.min(right,down)-dungeon[r][c];
        return dp[r][c]=health>0?health:1;
    }
    public int calculateMinimumHP(int[][] dungeon) {
        int[][] dp=new int[dungeon.length][dungeon[0].length];
            for(int[] arr:dp){
                Arrays.fill(arr,Integer.MIN_VALUE);
            }
        return helper(dungeon,0,0,dp);
    }
}