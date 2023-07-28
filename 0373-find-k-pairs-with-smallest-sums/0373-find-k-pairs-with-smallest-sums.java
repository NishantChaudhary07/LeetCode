class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
       PriorityQueue<int[]> minheap=new PriorityQueue<>((a,b)->(a[0]+a[1])-(b[0]+b[1]));
        for(int i=0;i<Math.min(nums1.length,k);i++){
            int[] curr={nums1[i],nums2[0],0};
            minheap.offer(curr);
        }
        List<List<Integer>> res=new ArrayList<>();
        while(k--!=0 && !minheap.isEmpty()){
            int[] rem=minheap.poll();
            List<Integer> lst=new ArrayList<>();
            lst.add(rem[0]);
            lst.add(rem[1]);
            res.add(lst);
            if(rem[2]+1<nums2.length){
                int[] curr={rem[0],nums2[rem[2]+1],rem[2]+1};
                minheap.offer(curr);
            }
        }
        return res;
    }
}