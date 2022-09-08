class Solution {
public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral=new LinkedList<>();
        int row=0;
        int col=0;
        int maxrow=matrix.length-1;
        int maxcol=matrix[0].length-1;
        int maxcount=(maxrow+1)*(maxcol+1);
        int count=1;
    
        while(count<=maxcount){
            for(int i=col;i<=maxcol;i++){
                spiral.add(matrix[row][i]);
                count++;
            }
            row++;
            
            for(int i=row;i<=maxrow;i++){
                spiral.add(matrix[i][maxcol]);
                count++;
            }
            maxcol--;
            
            
            for(int i=maxcol;i>=col && count<=maxcount;i--){
                spiral.add(matrix[maxrow][i]);
                count++;
            }
            maxrow--;
            
            for(int i=maxrow;i>=row && count<=maxcount;i--){
                spiral.add(matrix[i][col]);
                count++;
            }
            col++;
        }
        return spiral;
}
}