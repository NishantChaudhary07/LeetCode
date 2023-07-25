class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int len=nums.length;
        Deque<Integer> dq=new LinkedList<>();
        int[] ans=new int[len-k+1];
        for(int i=0;i<k;i++){
            while(!dq.isEmpty() && nums[i]>nums[dq.getLast()]){
                dq.removeLast();
            }
            dq.add(i);
        }
        ans[0]=nums[dq.getFirst()];
        int ind=1;
        for(int i=k;i<len;i++){
            while(!dq.isEmpty() && nums[i]>nums[dq.getLast()]){
                dq.removeLast();
            }
            
            if(!dq.isEmpty() && dq.getFirst()==i-k){
                dq.removeFirst();
            }
            
            dq.add(i);
            ans[ind]=nums[dq.getFirst()];
            ind++;
        }
        return ans;
    }
}