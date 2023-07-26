class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
     int[] pointer=new int[primes.length];
      long[] ugly=new long[n];
        ugly[0]=1l;
        int j=1;
        for(int i=1;i<n;i++){
            long min=Long.MAX_VALUE;
            for(int k=0;k<primes.length;k++){
                min=Math.min(min,ugly[pointer[k]]*primes[k]);
            }
            ugly[j]=min;
            for(int k=0;k<primes.length;k++){
                if(min==ugly[pointer[k]]*primes[k]) pointer[k]++;
            }
            j++;
            // System.out.println(min);
        }
        Long ans=ugly[n-1];
        return (int)ugly[n-1];
    }
}