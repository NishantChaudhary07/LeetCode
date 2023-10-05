class Solution {
    public boolean find132pattern(int[] nums) {
        int n=nums.length;
        int[] leftmin=new int[n];
        leftmin[0]=nums[0];
        for(int i=1;i<n;i++){
            leftmin[i]=Math.min(nums[i],leftmin[i-1]);
        }
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=leftmin[i]){
                st.pop();
            }
            if(!st.isEmpty() && nums[i]>st.peek()){
                return true;
            }
            st.push(nums[i]);
        }
        return false;
    }
}