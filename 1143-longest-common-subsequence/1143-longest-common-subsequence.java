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
        int[][] dp=new int[text1.length()+1][text2.length()+1];
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                int ans=0;
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    ans=1+dp[i-1][j-1];
                }
                else{
                    int igf=dp[i-1][j];
                    int igs=dp[i][j-1];
                    ans=Math.max(igf,igs);
                }
                dp[i][j]=ans;
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}