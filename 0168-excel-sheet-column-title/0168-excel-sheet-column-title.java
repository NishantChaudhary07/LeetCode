class Solution {
    
    public String convertToTitle(int columnNumber) {
        String ans="";
        while(columnNumber>0){
            --columnNumber;
            ans=(char)(columnNumber%26+'A')+ans;
            columnNumber/=26;
        }
        return ans;
    }
}