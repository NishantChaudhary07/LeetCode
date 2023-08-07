class Solution {
    public void markIslands(char[][] grid,int cr,int cc,int tr,int tc){
        if(cr<0 || cc<0 || cr>=tr || cc>=tc || grid[cr][cc]=='0'){
            return;
        }
        grid[cr][cc]='0';
        markIslands(grid,cr-1,cc,tr,tc);
        markIslands(grid,cr+1,cc,tr,tc);
        markIslands(grid,cr,cc-1,tr,tc);
        markIslands(grid,cr,cc+1,tr,tc);
    }
    public int numIslands(char[][] grid) {
        int tr=grid.length;
        int tc=grid[0].length;
        int islands=0;
        for(int i=0;i<tr;i++){
            for(int j=0;j<tc;j++){
                if(grid[i][j]=='1'){
                    markIslands(grid,i,j,tr,tc);
                    islands++;
                }
            }
        }
        return islands;
    }
}