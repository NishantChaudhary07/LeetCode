class Solution {
    public char findTheDifference(String s, String t) {
        int c1=0,c2=0;
        for(int i=0;i<s.length();i++){
            c1+=(int)s.charAt(i);
            c2+=(int)t.charAt(i);
        }
        c2+=(int)t.charAt(t.length()-1);
        return (char)(c2-c1);
    }
}