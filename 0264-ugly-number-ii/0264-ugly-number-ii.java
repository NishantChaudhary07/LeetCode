class Solution {
    public int nthUglyNumber(int n) {
    int[] ugly=new int[n+1];
        int idx2=0,idx5=0,idx3=0;
        ugly[0]=1;
        for(int i=1;i<=n;i++){
    int ele=Math.min(5*ugly[idx5],Math.min(3*ugly[idx3],2*ugly[idx2]));
            ugly[i]=ele;
          if(ugly[i]==2*ugly[idx2]){
              idx2++;
          }  
            if(ugly[i]==3*ugly[idx3]){
              idx3++;
          }
        if(ugly[i]==5*ugly[idx5]){
              idx5++;
          }
        }
        return ugly[n-1];
    }
}