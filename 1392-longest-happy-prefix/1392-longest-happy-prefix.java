class Solution {
    public String longestPrefix(String s) {
        int n = s.length();
        int[] lps = new int[s.length()];
        int i = 1, len = 0;
        while (i < n) {
            if (s.charAt(i) == s.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len > 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return s.substring(0, lps[s.length() - 1]);
    }
}