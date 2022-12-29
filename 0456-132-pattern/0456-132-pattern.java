class Solution {
    public boolean find132pattern(int[] nums) {
        int[] min=new int[nums.length];
        min[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            min[i]=Math.min(min[i-1],nums[i]);
        }
        
        Stack<Integer> st=new Stack<>();
        for(int i=nums.length-1;i>=0;i--){
            int ith=min[i];
            if(nums[i]>ith){
                while(!st.isEmpty() && st.peek()<=ith){
                    st.pop();
                }
                if(!st.isEmpty() && st.peek()<nums[i])
                    return true;
            }
            st.push(nums[i]);
        }
        return false;
    }
}