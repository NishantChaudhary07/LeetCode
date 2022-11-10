class Solution {
    public int climbStairs(int n) {
        int c=0;
        if(n==0){
            return 1;
        }
        if(n==1)
        {
            return 1;
        }
        
        else{
            int a=1;
            int b=1;
            
            for(int i=2;i<=n;i++){
                c=a+b;
                a=b;
                b=c;
            }
        }
        return c;
    }
}