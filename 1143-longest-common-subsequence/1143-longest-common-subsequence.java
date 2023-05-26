class Solution {
    private int lcs(String st1,String st2,int i,int j,int[][] dp){
        int count=0;
        if(i==st1.length() || j==st2.length()){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(st1.charAt(i)==st2.charAt(j)){
            count=1+lcs(st1,st2,i+1,j+1,dp);
        }
        else{
            int ig_f=lcs(st1,st2,i+1,j,dp);
            int ig_s=lcs(st1,st2,i,j+1,dp);
            count=Math.max(ig_f,ig_s);
        }
        return dp[i][j]=count;
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp=new int[text1.length()][text2.length()];
        for(int[] ar:dp){
            Arrays.fill(ar,-1);
        }
       return lcs(text1,text2,0,0,dp);
    }
}