class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st=new Stack<>();
        int max_area=0;
        for(int i=0;i<heights.length;i++){
            
            while(!st.isEmpty() && heights[i]<=heights[st.peek()]){
                 int ht=heights[st.pop()];
                 if(!st.isEmpty()){
               max_area=Math.max(max_area,ht*(i-st.peek()-1));
            }
            else{
                max_area=Math.max(max_area,ht*(i));
               }
            }
           
                st.push(i);
        }
        int l=heights.length;
        while(!st.isEmpty()){
            int ht=heights[st.pop()];
             if(!st.isEmpty()){
               max_area=Math.max(max_area,ht*(l-st.peek()-1));
            }
            else{
                max_area=Math.max(max_area,ht*l);
               }
        }
        return max_area;
    }
}