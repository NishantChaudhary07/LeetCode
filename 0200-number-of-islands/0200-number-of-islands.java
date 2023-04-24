class Solution {
    public void markIsland(char[][] grid,int nr,int nc,int cr,int cc){
        if(cr<0 || cr>=nr || cc<0 || cc>=nc ||  grid[cr][cc]=='0'){
            return;
        }
        grid[cr][cc]='0';
        
        markIsland(grid,nr,nc,cr+1,cc);
        markIsland(grid,nr,nc,cr-1,cc);
        markIsland(grid,nr,nc,cr,cc+1);
        markIsland(grid,nr,nc,cr,cc-1);
    }
    public int numIslands(char[][] grid) {
        int nr=grid.length;
        int nc=grid[0].length;
        int no_of_Islands=0;
        
        for(int i=0;i<nr;i++){
            for(int j=0;j<nc;j++){
                if(grid[i][j]=='1'){
                    markIsland(grid,nr,nc,i,j);
                   no_of_Islands++; 
                }
            }
        }
        return no_of_Islands;
    }
}