class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        int[] indeg=new int[n];
        int[][] connected=new int[n][n];
        for(int[] arr:roads){
            indeg[arr[0]]++;
            indeg[arr[1]]++;
            connected[arr[0]][arr[1]]=1;
            connected[arr[1]][arr[0]]=1;
        }
        int maxRank=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                maxRank=Math.max(maxRank,indeg[i]+indeg[j]-connected[i][j]);
            }
        }
        return maxRank;
    }
}