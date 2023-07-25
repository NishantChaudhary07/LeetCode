class Solution {
    public int nthUglyNumber(int n) {
        PriorityQueue<Long> pq=new PriorityQueue<>();
        pq.add(1l);
        n=n-1;
        while(n-->0){
            long poll=pq.poll();
            if(!pq.contains(2*poll)){
                pq.add(2*poll);
            }
            if(!pq.contains(3*poll)){
                pq.add(3*poll);
            }
            if(!pq.contains(5*poll)){
                pq.add(5*poll);
            }
        }
        long ans=pq.poll();
        return (int)ans;
    }
}