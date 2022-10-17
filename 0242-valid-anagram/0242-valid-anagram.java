class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        char[] s1=s.toCharArray();
        char[] t1=t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        String s11=new String(s1);
        String t11=new String(t1);
             
        if(s11.equals(t11))
            return true;
        else 
            return false;
    }
}