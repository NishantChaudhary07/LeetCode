class Solution {
    public boolean isPalindrome(int x) {
        int num=x;
        int reverse=0;
        if(x<0)
            return false;
        else{
            while(x!=0){
                int rem=x%10;
                reverse=reverse*10+rem;
                x/=10;
            }
        }
        if(num==reverse)
            return true;
        else 
            return false;
    }
}