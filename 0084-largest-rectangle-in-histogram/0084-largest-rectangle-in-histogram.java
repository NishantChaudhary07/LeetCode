class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st=new Stack<>();
        int ans=0;
        for(int i=0;i<heights.length;i++){
            while(!st.isEmpty() && heights[i]<heights[st.peek()]){
                int h=heights[st.pop()];
                int r=i;
                if(!st.isEmpty()){
                    int l=st.peek();
                    ans=Math.max(ans,(r-l-1)*h);
                    }
                else{
                    ans=Math.max(ans,r*h);
                }
            }
            st.push(i);
        }
        int r=heights.length;
        while(!st.isEmpty()){
            int h=heights[st.pop()];
            if(!st.isEmpty()){
                int l=st.peek();
                ans=Math.max(ans,h*(r-l-1));
            }
            else{
                ans=Math.max(ans,h*r);
            }
        }
        return ans;
    }
}