class Solution {
    public int lcs(String text1, String text2,int i,int j,int[][] dp){
        if(i==text1.length() || j==text2.length()){
            return 0;
        }
        int count=0;
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(text1.charAt(i)==text2.charAt(j)){
            count=1+lcs(text1,text2,i+1,j+1,dp);
        }
        else{
            int ignore_first=lcs(text1,text2,i+1,j,dp);
            int ignore_sec=lcs(text1,text2,i,j+1,dp);
            count=Math.max(ignore_first,ignore_sec);
        }
        return dp[i][j]=count;
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp=new int[text1.length()][text2.length()];
        for(int[] arr:dp){
            Arrays.fill(arr,-1);
        }
        return lcs(text1,text2,0,0,dp);
    }
}