class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0){
            return 1;
        }
        if(n==1){
            return 10;
        }
        int res=10,prod=9;
        for(int i=2;i<=n;i++){
            prod=prod*(11-i);
            res+=prod;
        }
        return res;
    }
}