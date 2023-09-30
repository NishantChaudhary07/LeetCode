class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)-> (a[0]+a[1])-(b[0]+b[1]));
        for(int i=0;i<Math.min(nums1.length,k);i++){
            int[] addpair={nums1[i],nums2[0],0};
            pq.offer(addpair);
        }
        
        List<List<Integer>> res=new ArrayList<>();
        while(k--!=0 && !pq.isEmpty()){
            int[] rem=pq.poll();
            List<Integer> lst=new ArrayList<>();
            lst.add(rem[0]);
            lst.add(rem[1]);
            if(rem[2]+1<nums2.length){
                int[] newadd={rem[0],nums2[rem[2]+1],rem[2]+1};
                pq.offer(newadd);
            }
            res.add(lst);
        }
        return res;
    }
}