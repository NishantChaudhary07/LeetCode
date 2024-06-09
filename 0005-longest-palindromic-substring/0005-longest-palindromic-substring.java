class Solution {
    public String extend(String s,int left,int right,String res){
            while(left>=0 && right<s.length()){
                if(s.charAt(left)!=s.charAt(right)){
                    break;
                }
                if(left!=right){
                    res=s.charAt(left)+res+s.charAt(right);
                }
                else if(left==right){
                    res+=s.charAt(right);
                }
                left--;
                right++;
            }
            return res;
        }
    public String longestPalindrome(String s) {
        String ans="";
        int mxlen=0;
        for(int i=0;i<s.length();i++){
            String res=extend(s,i,i,"");
            String res1=extend(s,i,i+1,"");
            if(res.length()>mxlen){
                mxlen=res.length();
                ans=res;
            }
            if(res1.length()>mxlen){
                mxlen=res1.length();
                ans=res1;
            }
            
        }
        return ans;
    }
}