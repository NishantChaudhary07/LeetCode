class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int l=0,r=0,maxlen=0;
        while(r<s.length()){
            char ch=s.charAt(r);
            map.put(ch,map.getOrDefault(ch,0)+1);
            r++;
            while(map.get(ch)>1 && l<=r){
                char chl=s.charAt(l);
                map.put(chl,map.get(chl)-1);
                l++;
            }
            maxlen=Math.max(maxlen,r-l);
        }
        return maxlen;
    }
}