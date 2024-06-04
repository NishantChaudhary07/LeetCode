class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq=new int[26];
        int maxf=0,l=0,ans=0;
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            freq[ch-'A']++;
            maxf=Math.max(maxf,freq[ch-'A']);
            if(r-l+1-maxf>k){
                char chl=s.charAt(l);
                freq[chl-'A']--;
                l++;
            }
            ans=Math.max(r-l+1,ans);
        }
        return ans;
    }
}