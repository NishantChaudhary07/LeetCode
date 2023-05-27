class Solution {
    private int lcsBottomUp(String st1,String st2){
        int[][] dp=new int[st1.length()+1][st2.length()+1];
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                int ans=0;
        if(st1.charAt(i-1)==st2.charAt(j-1)){
            ans=1+dp[i-1][j-1];
        }
        else{
            int ig_f=dp[i][j-1];
            int ig_s=dp[i-1][j];
            ans=Math.max(ig_f,ig_s);
        }
                dp[i][j]=ans;
      }
    }
        return dp[dp.length-1][dp[0].length-1];
    }
    public int longestCommonSubsequence(String text1, String text2) {
       return lcsBottomUp(text1,text2);
    }
}