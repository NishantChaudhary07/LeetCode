class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(maxheap.size()<k){
                    maxheap.offer(matrix[i][j]);
                }
                else if(matrix[i][j]<maxheap.peek()){
                    maxheap.poll();
                    maxheap.offer(matrix[i][j]);
                }
            }
        }
        return maxheap.peek();
    }
}