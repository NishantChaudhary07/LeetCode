class Solution {
    public int lcs(String t1,String t2,int idx1,int idx2,int[][] dp){
        if(idx1>=t1.length() || idx2>=t2.length()){
            return 0;
        }
        if(dp[idx1][idx2]!=-1){
            return dp[idx1][idx2];
        }
        int ig12=0;
        if(t1.charAt(idx1)==t2.charAt(idx2)){
            ig12=1+lcs(t1,t2,idx1+1,idx2+1,dp);
        }
        int ig1=lcs(t1,t2,idx1+1,idx2,dp);
        int ig2=lcs(t1,t2,idx1,idx2+1,dp);
        return dp[idx1][idx2]=Math.max(ig12,Math.max(ig1,ig2));
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp=new int[text1.length()][text2.length()];
        for(int[] arr:dp){
            Arrays.fill(arr,-1);
        }
        return lcs(text1,text2,0,0,dp);
    }
}