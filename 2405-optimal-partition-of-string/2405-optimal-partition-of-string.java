class Solution {
    public int partitionString(String s) {
        int[] freq=new int[26];
        int right=0;
        int count=1;
        while(right<s.length()){
            int idx=s.charAt(right)-'a';
            if(freq[idx]==1){
                Arrays.fill(freq,0);
                count++;
            }
            freq[idx]=1;
            right++;
        }
        return count;
    }
}