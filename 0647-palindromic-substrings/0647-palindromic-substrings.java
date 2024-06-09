class Solution {
    public int countSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            int l=i,r=i;
            while(l>=0 && r<s.length()){
                if(s.charAt(l)!=s.charAt(r)){
                    break;
                }
                else{
                    count++;
                }
                l--;
                r++;
            }
        }
        
        for(int i=1;i<s.length();i++){
            int l=i-1,r=i;
            while(l>=0 && r<s.length()){
                if(s.charAt(l)!=s.charAt(r)){
                    break;
                }
                else{
                    count++;
                }
                l--;
                r++;
            }
        }
        return count;
    }
}