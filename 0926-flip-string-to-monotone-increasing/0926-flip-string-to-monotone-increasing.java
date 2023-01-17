class Solution {
    public int minFlipsMonoIncr(String s) {
        int flips=0;
        int ones=0;
        for(char c:s.toCharArray()){
            if(c=='1'){
                ++ones;
            }
            else{
                if(ones>0){
                    --ones;
                    ++flips;
                }
            }
        }
        return flips;
    }
}