class Solution {
    public boolean isPalindrome(String s) {
        String str="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            ch=Character.toLowerCase(ch);
            if((ch>='a' && ch<='z') || (ch>='0' && ch<='9')){
                str+=ch;
            }
        }
        
        int end=str.length()-1;
        int start=0;
        while(start<=end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}