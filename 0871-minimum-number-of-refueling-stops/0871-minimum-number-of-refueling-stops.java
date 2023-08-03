class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
       PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
       int max_reached=startFuel,idx=0,count=0;
        while(max_reached<target){
            while(idx<stations.length && max_reached>=stations[idx][0]){
                pq.offer(stations[idx][1]);
                idx++;
            }
            if(pq.isEmpty()) return -1;
            max_reached+=pq.poll();
            count++;
        }
        return count;
    }
}