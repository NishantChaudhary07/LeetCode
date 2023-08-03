class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((arr1,arr2)->{
            double x=(double)arr2[0]/arr2[1];
            double y=(double)arr1[0]/arr1[1];
            if(x>y){
                return 1;
            }
            return -1;
        } );
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int[] curr={arr[i],arr[j]};
                    pq.offer(curr);
                while(pq.size()>k){
                    pq.poll();
                }
                }
            }
        
        return pq.poll();
      
    }
}