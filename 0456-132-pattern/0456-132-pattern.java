class Solution {
    public boolean find132pattern(int[] nums) {
        int[] left_min=new int[nums.length];
        left_min[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            left_min[i]=Math.min(nums[i],left_min[i-1]);
        }
        Stack<Integer> st=new Stack<>();
        for(int i=nums.length-1;i>=0;i--){
              if(nums[i]>left_min[i]){
                  while(!st.isEmpty() && st.peek()<=left_min[i]){
                      st.pop();
                  }
                  if(!st.isEmpty() && st.peek()<nums[i]){
                      return true;
                  }
              }
            st.push(nums[i]);
        }
        return false;
    }
}