class Solution {
    public int squareOfDigits(int num){
        int digsquare=0;
        while(num!=0){
            int dig=num%10;
            digsquare+=dig*dig;
            num/=10;
        }
        return digsquare;
    }
    public boolean isHappy(int n) {
        boolean res=false;
        int num1=squareOfDigits(n);
        int num2=0;
    while(true){
      num2=squareOfDigits(num1);
        num1=num2;
        if(num2==1){
            res=true;
            break;
        }
        if(num2<10)
            break;
        }
        return res;
    }
}