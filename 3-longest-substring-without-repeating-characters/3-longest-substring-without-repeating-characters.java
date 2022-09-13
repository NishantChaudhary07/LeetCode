class Solution {
    public int lengthOfLongestSubstring(String s) {
       Map<Character,Integer> map=new HashMap<>();
        int mxcount=0;
        int start=0;
        
        for(int end=0;end<s.length();end++){
            char ch=s.charAt(end);
            if(map.containsKey(ch)){
                start=Math.max(start,map.get(ch)+1);
            }   
            map.put(ch,end);
             mxcount=Math.max(mxcount,end-start+1);
                  
        }
        // mxcount=Math.max(mxcount,end-start+1);
        return mxcount;
    }
}