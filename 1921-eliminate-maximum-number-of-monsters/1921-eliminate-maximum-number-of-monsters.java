class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int n=dist.length;
        PriorityQueue<Double> heap=new PriorityQueue<>();
        for(int i=0;i<n;i++){
            heap.offer((double)dist[i]/speed[i]);
        }
        int ans=0;
        while(!heap.isEmpty()){
            if(heap.peek()<=ans){
                break;
            }
            heap.remove();
            ans++;
        }
        return ans;
    }
}