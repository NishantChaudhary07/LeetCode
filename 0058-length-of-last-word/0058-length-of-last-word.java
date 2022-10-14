class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        s=" "+s;
        int i=s.length()-1;
        while(s.charAt(i)!=' '){
            i--;
        }
        return s.length()-i-1;
    }
}