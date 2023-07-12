class Solution {
    
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            while(!st.isEmpty() && nums[i]>nums[st.peek()]){
                res[st.pop()]=nums[i];
            }
            st.push(i);
        }
        for(int i=0;i<nums.length;i++){
            while(!st.isEmpty() && nums[i]>nums[st.peek()]){
                res[st.pop()]=nums[i];
            }
        }
        while(!st.isEmpty()){
            res[st.pop()]=-1;
        }
        return res;
    }
}