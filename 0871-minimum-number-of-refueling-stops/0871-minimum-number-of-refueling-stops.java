class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());
        int max_reach=startFuel,index=0;
        int count=0;
        
        while(max_reach<target){
        while(index<stations.length && stations[index][0]<=max_reach){
            maxheap.offer(stations[index][1]);
            index++;
           }
            
            if(maxheap.isEmpty()) return -1;
            
            max_reach+=maxheap.poll();
            count++;
        }
        return count;
    }
}