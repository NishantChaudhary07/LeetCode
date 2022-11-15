class Solution {
    public boolean checkPerfectNumber(int num) {
        int divsum=1;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                divsum+=i+num/i;
            }
        }
        if(divsum==num && num!=1)
            return true;
        else
            return false;
    }
}