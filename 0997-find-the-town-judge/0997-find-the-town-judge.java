class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n==1){
            return 1;
        }
    int[] trusts=new int[n+1];
        for(int i=0;i<trust.length;i++){
            trusts[trust[i][0]]--;
            trusts[trust[i][1]]++;
        }
        
        for(int i=0;i<trusts.length;i++){
            if(trusts[i]==n-1)
                return i;
        }
        return -1;
}
}