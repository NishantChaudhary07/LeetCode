class Solution {
    private int helpDP(String s,String t,int j,int i,int[][] dp){
        if(i==t.length()){
            return 1;
        }
        if(j==s.length()){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int inc=0;
        int exc=0;
        if(s.charAt(j)==t.charAt(i)){
            inc=helpDP(s,t,j+1,i+1,dp);
        }
        exc=helpDP(s,t,j+1,i,dp);
        return dp[i][j]=inc+exc;
    }
    public int numDistinct(String s, String t) {
        int[][] dp=new int[t.length()+1][s.length()+1];
        for(int []arr:dp){
            Arrays.fill(arr,-1);
        }
        return helpDP(s,t,0,0,dp);
    }
}