class Solution {
    public int nthUglyNumber(int n) {
        int[] res=new int[n];
        int p1=0;
        int p2=0;
        int p3=0;
        res[0]=1;
        for(int i=1;i<n;i++){
            int twomultiple=2*res[p1];
            int threemultiple=3*res[p2];
            int fivemultiple=5*res[p3];
            res[i]=Math.min(twomultiple,Math.min(threemultiple,fivemultiple));
            if(res[i]==twomultiple) p1++;
            if(res[i]==threemultiple) p2++;
            if(res[i]==fivemultiple) p3++;
        }
        return res[n-1];
    }
}