class Solution {
    public int reverse(int x) {
       int rev=0;
       long rev1=0;
        while(x!=0){
            rev1=rev1*10+x%10;
            if(rev1>Math.pow(2,31)-1 || rev1<-Math.pow(2,31)){
                rev=0;
                break;
            }
            else
                rev=rev*10+x%10;
            x/=10;
        }
        return rev;
    }
}