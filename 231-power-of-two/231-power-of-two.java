class Solution {
    public boolean isPowerOfTwo(int n) {
        boolean res=true;
        if(n==1)
            return true;
        if(n<=0)
            return false;
        while(n>=2){
            if(n%2!=0){
                res=false;
                break;
            }
            n/=2;
        }
       return res;
    }
}