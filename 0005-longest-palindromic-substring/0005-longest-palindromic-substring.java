class Solution {
    public static String expand(String s,int start,int end,String res){
         
           while(start>=0 && end<s.length()){
               if(s.charAt(start)!=s.charAt(end))
               {
                  break; 
               }
               if(end!=start)
                   res=s.charAt(start)+res+s.charAt(end);
               else if(end==start)
                   res=res+s.charAt(end);
            
                   start--;
                   end++;
           }
        return res;
    }
    public String longestPalindrome(String s) {
        int mxlen=0;
        String ans="";
        if(s.length()<=1){
            return s;
        }
       for(int i=0;i<s.length();i++){
          String res=expand(s,i,i,"");
           String res1=expand(s,i,i+1,"");
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