class Solution {
    public static int no_of_1(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n%2==0) 
            return no_of_1(n/2);
        else
            return 1+no_of_1(n/2);
    }
    public int[] countBits(int n) {
        int[] ans=new int[n+1];
         for(int i=0;i<=n;i++){
             ans[i]=no_of_1(i);
         }
        return ans;
    }
}