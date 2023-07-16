class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq=new LinkedList<>();
        int[] res=new int[nums.length-k+1];
        for(int i=0;i<k;i++){
            while(!dq.isEmpty() && nums[i]>nums[dq.getLast()]){
                dq.removeLast();
            }
            dq.add(i);
        }
        int j=1;
        res[0]=nums[dq.getFirst()];
        for(int i=k;i<nums.length;i++){
            while(!dq.isEmpty() && nums[i]>nums[dq.getLast()]){
                dq.removeLast();
            }
            if(!dq.isEmpty() && dq.getFirst()==i-k){
                dq.removeFirst();
            }
            dq.add(i);
            res[j]=nums[dq.getFirst()];
            j++;
        }
        return res;
    }
}