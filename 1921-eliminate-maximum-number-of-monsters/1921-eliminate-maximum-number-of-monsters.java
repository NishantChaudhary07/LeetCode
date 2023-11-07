class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int n=dist.length;
        double[] arrival=new double[n];
        for(int i=0;i<n;i++){
            arrival[i]=(double)dist[i]/speed[i];
        }
        Arrays.sort(arrival);
        int ans=0;
        for(int i=0;i<n;i++){
            if(arrival[i]<=i){
                break;
            }
            ans++;
        }
        return ans;
    }
}