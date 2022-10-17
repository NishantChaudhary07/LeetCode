class Solution {
    
    public static boolean isPermutation(char[] ch1,char[] ch2){
        for(int i=0;i<ch1.length;i++){
            if(ch1[i]!=ch2[i]){
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())
            return false;
        char[] ch1=new char[26];
        char[] ch2=new char[26];
        for(int i=0;i<s1.length();i++){
            ch1[s1.charAt(i)-'a']++;
        }
        
        int start=0,end=0;
        for(;end<s1.length();end++){
            ch2[s2.charAt(end)-'a']++;
        }
        if(isPermutation(ch1,ch2)){
            return true;
        }
        
        for(;end<s2.length();end++){
            ch2[s2.charAt(start)-'a']--;
            ch2[s2.charAt(end)-'a']++;
            if(isPermutation(ch1,ch2)){
            return true;
        }
            start++;
        }
        return false;
    }
}