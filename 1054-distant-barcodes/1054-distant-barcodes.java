class Solution {
    public int[] rearrangeBarcodes(int[] barcodes) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int ele:barcodes){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        for(int key:map.keySet()){
            pq.offer(key);
        }
        
        int[] ans=new int[barcodes.length];
        int idx=0;
        while(!pq.isEmpty()){
            int ele=pq.poll();
            int freq=map.remove(ele);
            while(freq-->0){
                ans[idx]=ele;
                idx+=2;
                if(idx>=barcodes.length){
                    idx=1;
                }
            }
        }
        return ans;
    }
}