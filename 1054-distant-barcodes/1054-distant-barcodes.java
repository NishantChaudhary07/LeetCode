class Solution {
    public int[] rearrangeBarcodes(int[] barcodes) {
        Map<Integer,Integer> freq=new HashMap<>();
        for(int i=0;i<barcodes.length;i++){
            freq.put(barcodes[i],freq.getOrDefault(barcodes[i],0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->freq.get(b)-freq.get(a));
        for(int key:freq.keySet()){
            pq.add(key);
        }
        
        int[] ans=new int[barcodes.length];
        
        for(int i=0;i<barcodes.length;i++){
            if(i>0 && ans[i-1]==pq.peek()){
                int poll=pq.poll();
                ans[i]=pq.peek();
                freq.put(pq.peek(),freq.get(pq.peek())-1);
                pq.offer(poll);
            }
            else{
                ans[i]=pq.peek();
                freq.put(pq.peek(),freq.get(pq.peek())-1);
            }
            
        }
            return ans;
    }
}