class Solution {
    public String longestPalindrome(String s) {
        int mxlen=0;
        String ans="";
        if(s.length()<=1){
            return s;
        }
       for(int i=0;i<s.length();i++){
           String pal="";
           int start=i,end=i;
           while(start>=0 && end<s.length()){
               if(s.charAt(start)!=s.charAt(end))
               {
                  break; 
               }
               if(end!=start)
                   pal=s.charAt(start)+pal+s.charAt(end);
               else if(end==start)
                   pal=pal+s.charAt(end);
               
               if(end-start+1>mxlen){
                   mxlen=end-start+1;
                   ans=pal;
               }
                   start--;
                   end++;
           }
           
            start=i;end=i+1;
           String pal1="";
           while(start>=0 && end<s.length()){
               if(s.charAt(start)!=s.charAt(end))
               {
                  break; 
               }
               pal1=s.charAt(start)+pal1+s.charAt(end);
               if(end-start+1>mxlen){
                   mxlen=end-start+1;
                   ans=pal1;
               }
                   start--;
                   end++;
           }
       }
        return ans;
    }
}