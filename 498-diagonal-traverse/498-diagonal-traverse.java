class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int row=mat.length;
        int col=mat[0].length;
        List<Integer> list=new ArrayList<>();
        int[] arr=new int[row*col];
        int k=0;
        for(int d=0;d<row+col-1;d++){
            int r=0,c=0;
            if(d<col){
               r=0;
               c=d;
             
            }
            else{
                c=col-1;
                r=d-col+1;
            }
                  while(r<row && c>=0){
                    list.add(mat[r][c]);
                    r++;
                    c--;
                }
        
             if(d%2==0){
                    Collections.reverse(list);
                    // System.out.println(list);
                }
             for(int ele:list){
                 arr[k++]=ele;
             }   
                list.clear();
    }
        return arr;
}
}