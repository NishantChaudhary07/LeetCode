class Solution {
    public int lcs(String s1,String s2,int i,int j,int[][] dp){
        if(i== s1.length() || j==s2.length()){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int ignore_both=0;
        if(s1.charAt(i)==s2.charAt(j)){
            ignore_both=1+lcs(s1,s2,i+1,j+1,dp);
        }
        int ignore_first=lcs(s1,s2,i+1,j,dp);
        int ignore_sec=lcs(s1,s2,i,j+1,dp);
        return dp[i][j]=Math.max(ignore_both,Math.max(ignore_first,ignore_sec));
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp=new int[text1.length()][text2.length()];
        for(int[] arr:dp){
            Arrays.fill(arr,-1);
        }
        return lcs(text1,text2,0,0,dp);
    }
}