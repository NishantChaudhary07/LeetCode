class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st=new Stack<>();
        int max_area=0;
        for(int i=0;i<heights.length;i++){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                int ht=heights[st.pop()];
                if(!st.isEmpty()){
                    max_area=Math.max(max_area,ht*(i-st.peek()-1));
                }
                else{
                    max_area=Math.max(max_area,ht*i);
                }
            }
            
            st.push(i);
        }
        
        int len=heights.length;
        while(!st.isEmpty()){
            int ht=heights[st.pop()];
            if(!st.isEmpty()){
                max_area=Math.max(max_area,ht*(len-st.peek()-1));
            }
            else{
                max_area=Math.max(max_area,ht*len);
            }
        }
        
        return max_area;
    }
}