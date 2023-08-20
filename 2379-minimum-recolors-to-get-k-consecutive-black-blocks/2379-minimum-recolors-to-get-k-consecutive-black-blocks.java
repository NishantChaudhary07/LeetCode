class Solution {
    public int minimumRecolors(String blocks, int k) {
        int len=blocks.length();
        int[] b=new int[len];
        for(int i=0;i<len;i++){
            if(blocks.charAt(i)=='B'){
                b[i]=1;
            }
        }
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=b[i];
        }
        int ans=k-sum;
        for(int i=k;i<len;i++){
            sum=sum+b[i]-b[i-k];
            ans=Math.min(ans,k-sum);
        }
        return ans;
    }
}