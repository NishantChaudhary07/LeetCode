class Solution {
    public static String reverse(String st){
        String s="";
        for(int i=0;i<st.length();i++){
            s=st.charAt(i)+s;
        }
        return s;
    }
    public String reverseWords(String s) {
        String ans="";
        String word="";
        for(int i=0;i<s.length();i++){
           if(s.charAt(i)==' '){
               ans+=reverse(word);
               word="";
               while(s.charAt(i)==' '){
                   ans+=' ';
                   i++;
               }
           } 
            if(i==s.length()-1){
                word+=s.charAt(i);
                ans+=reverse(word);
                word="";
            }
            else{
                word+=s.charAt(i);
            }
        }
        return ans;
    }
}