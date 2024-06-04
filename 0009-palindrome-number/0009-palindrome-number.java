class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int num=0;
        int y=x;
        while(y!=0){
            int rem=y%10;
            num=num*10+rem;
            y=y/10;
        }
        if(num==x){
            return true;
        }
        return false;
    }
}