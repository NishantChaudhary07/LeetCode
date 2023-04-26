class Solution {
    
    public int findIsland(int[][] grid,int cr,int cc,int tr,int tc){
        if(cr<0 || cr>=tr || cc<0 ||cc>=tc || grid[cr][cc]==0){
            return 0;
        }
        grid[cr][cc]=0;
        
        int up=findIsland(grid,cr-1,cc,tr,tc);
        int down=findIsland(grid,cr+1,cc,tr,tc);
        int left=findIsland(grid,cr,cc-1,tr,tc);
        int right=findIsland(grid,cr,cc+1,tr,tc);
        return up+down+left+right+1;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int max_area=0;
        int tr=grid.length;
        int tc=grid[0].length;
        for(int i=0;i<tr;i++){
            for(int j=0;j<tc;j++){
                if(grid[i][j]==1){
                    max_area=Math.max(max_area,findIsland(grid,i,j,tr,tc));
                }
            }
        }
        return max_area;
    }
}