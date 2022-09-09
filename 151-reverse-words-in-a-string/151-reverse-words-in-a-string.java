class Solution {
    public String reverseWords(String s) {
        s=" "+s+" ";
        String st="";
        String resst="";
       for(int i=1;i<s.length();i++){
           char ch=s.charAt(i);
           if(ch==' ' && s.charAt(i-1)!=' '){
               resst=st+" "+resst;
               st="";  
           }
           else if(ch!=' '){
                st+=ch;
           }
       }
        
        return resst.trim();
    }
}