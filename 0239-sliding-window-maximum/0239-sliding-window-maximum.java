class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res=new int[nums.length-k+1];
        Deque<Integer> dq=new LinkedList<>();
       
        for(int i=0;i<k;i++){
            while(!dq.isEmpty() && nums[i]>nums[dq.getLast()]){
                dq.removeLast();
            }
            dq.add(i);  
        }
        res[0]=nums[dq.getFirst()];
         int idx=1;
        for(int i=k;i<nums.length;i++){
            while(!dq.isEmpty() && nums[dq.getLast()]<nums[i]){
                dq.removeLast();
            }
            if(!dq.isEmpty() && dq.getFirst()==i-k){
                dq.removeFirst();
            }
            dq.add(i);
            res[idx]=nums[dq.getFirst()];
            idx++;
        }
        return res;
    }
}