class Solution {
    public int LCS(String st1,String st2,int i,int j,int[][] dp){
        if(i>=st1.length() || j>=st2.length()){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int count=0;
        if(st1.charAt(i)==st2.charAt(j)){
            count=1+LCS(st1,st2,i+1,j+1,dp);
        }
        else{
            int ig_first=LCS(st1,st2,i+1,j,dp);
            int ig_sec=LCS(st1,st2,i,j+1,dp);
            count=Math.max(ig_first,ig_sec);
        }
            return dp[i][j]=count;
        }
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp=new int[text1.length()][text2.length()];
        for(int[] arr:dp){
            Arrays.fill(arr,-1);
        }
        return LCS(text1,text2,0,0,dp);
    }
}