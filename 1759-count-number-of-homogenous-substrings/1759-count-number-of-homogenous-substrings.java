class Solution {
    public int countHomogenous(String s) {
        int ans=0,curr_streak=1;;
        for(int i=0;i<s.length();i++){
            if(i!=0 && s.charAt(i-1)==s.charAt(i)){
                curr_streak++;
            }
            else{
                curr_streak=1;
            }
            ans+=curr_streak;
            ans=ans%(1000000007);
        }
        return ans;
    }
}