class Solution {
    public int trap(int[] height) {
       Stack<Integer> st=new Stack<>();
        int totalwater=0;
        
        for(int i=0;i<height.length;i++){
            while(!st.isEmpty() && height[i]>height[st.peek()]){
                int top=st.pop();
                if(!st.isEmpty()){
                    int dist=i-st.peek()-1;
                    int water=(Math.min(height[i],height[st.peek()])-height[top])*dist;
                    totalwater+=water;
                }
            }
            st.push(i);
        }
        return totalwater;
    }
}