class Solution {
    public int findJudge(int n, int[][] trust) {
        List<Integer> vis=new ArrayList<>();
        int nsum=n*(n+1)/2;
        int nsum2=nsum;
        for(int i=0;i<trust.length;i++){
            if(!vis.contains(trust[i][0])){
                nsum-=trust[i][0];
            }
            vis.add(trust[i][0]);
            
        }
        // System.out.println(nsum);
        if(nsum>0 && nsum<=n){
            for(int i=0;i<trust.length;i++){
                if(trust[i][1]==nsum)
                    nsum2-=trust[i][0];
            }
            if(nsum==nsum2)
                return nsum;
        }
    
        return -1;
    }
}