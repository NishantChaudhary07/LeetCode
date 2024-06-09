class Solution {
    public int helper(String s,int i,int[] dp){
        if(i==s.length()){
            return 1;
        }
        if(s.charAt(i)=='0'){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int one=helper(s,i+1,dp);
        int two=0;
        if(i<s.length()-1 && (s.charAt(i)=='1' || s.charAt(i)=='2' && s.charAt(i+1)<'7')){
            two=helper(s,i+2,dp);
        }
        return dp[i]=one+two;
    }
    public int numDecodings(String s) {
        int[] dp=new int[s.length()];
        Arrays.fill(dp,-1);
        return helper(s,0,dp);
    }
}