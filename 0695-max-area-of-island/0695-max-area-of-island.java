class Solution {
    int area=0;
    public int markIsland(int[][] grid,int cr,int cc,int tr,int tc){
        if(cr<0 || cc<0 || cr>=tr || cc>=tc || grid[cr][cc]==0){
            return 0;
        }
        grid[cr][cc]=0;
        area=area+1;
        
        markIsland(grid,cr-1,cc,tr,tc);
        markIsland(grid,cr+1,cc,tr,tc);
        markIsland(grid,cr,cc-1,tr,tc);
        markIsland(grid,cr,cc+1,tr,tc);
        return area;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int tr=grid.length;
        int tc=grid[0].length;
        int maxArea=0;
       
        for(int i=0;i<tr;i++){
            for(int j=0;j<tc;j++){
                if(grid[i][j]==1){
                    area=0;
                    maxArea=Math.max(maxArea,markIsland(grid,i,j,tr,tc));
                
                }
            }
        }
        return maxArea;
    }
}