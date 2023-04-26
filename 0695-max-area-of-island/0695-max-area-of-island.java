class Solution {
    static int count=0;
    
    public void findIsland(int[][] grid,int cr,int cc,int tr,int tc){
        if(cr<0 || cr>=tr || cc<0 ||cc>=tc || grid[cr][cc]==0){
            return;
        }
        if(grid[cr][cc]==1){
            count++;
        }
        grid[cr][cc]=0;
        
        // int up=findIsland(grid,cr-1,cc,tr,tc);
        // int down=findIsland(grid,cr+1,cc,tr,tc);
        // int left=findIsland(grid,cr,cc-1,tr,tc);
        // int right=findIsland(grid,cr,cc+1,tr,tc);
        findIsland(grid,cr-1,cc,tr,tc);
        findIsland(grid,cr+1,cc,tr,tc);
        findIsland(grid,cr,cc-1,tr,tc);
        findIsland(grid,cr,cc+1,tr,tc);
        // return up+down+left+right;
        // return findIsland(grid,cr-1,cc,tr,tc)+findIsland(grid,cr+1,cc,tr,tc)+
    }
    public int maxAreaOfIsland(int[][] grid) {
        int max_area=0;
        int tr=grid.length;
        int tc=grid[0].length;
        for(int i=0;i<tr;i++){
            for(int j=0;j<tc;j++){
                if(grid[i][j]==1){
                    // System.out.println(findIsland(grid,i,j,tr,tc));
                    findIsland(grid,i,j,tr,tc);
                    max_area=Math.max(max_area,count);
                    count=0;
                    // max_area=Math.max(max_area,findIsland(grid,i,j,tr,tc));
                }
            }
        }
        return max_area;
    }
}