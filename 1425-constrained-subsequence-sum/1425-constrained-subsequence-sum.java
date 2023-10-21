class Solution {
    public int constrainedSubsetSum(int[] nums, int k) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->{
            return b[0]-a[0]; });
        pq.offer(new int[]{nums[0],0});
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            while(i-pq.peek()[1]>k){
                pq.remove();
            }
            
            int curr=Math.max(0,pq.peek()[0])+nums[i];
            ans=Math.max(ans,curr);
            pq.offer(new int[]{curr,i});
        }
        return ans;
    }
}