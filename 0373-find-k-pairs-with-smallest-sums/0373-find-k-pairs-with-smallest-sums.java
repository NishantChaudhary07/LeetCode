class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        
       PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->(b[0]+b[1])-(a[0]+a[1]));
        for(int i=0;i<Math.min(nums1.length,k);i++){
            for(int j=0;j<Math.min(nums2.length,k);j++){
                int[] curr={nums1[i],nums2[j]};
                if(pq.size()==k){
                    int[] rem=pq.peek();
                    if(rem[0]+rem[1]>curr[0]+curr[1]){
                        pq.poll();
                        pq.offer(curr);
                    }
                    else break;
                }
                else{
                    pq.offer(curr);
                }
            }
        }
        List<List<Integer>> res=new ArrayList<>();
        while(!pq.isEmpty()){
           List<Integer> lst=new ArrayList<>();
            int[] rem=pq.poll();
            lst.add(rem[0]);
            lst.add(rem[1]);
           res.add(lst); 
        }
        return res;
    }
}