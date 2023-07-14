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
    public int maximalRectangle(char[][] matrix) {
        int[] inp=new int[matrix[0].length];
        int max_rect=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]=='0'){
                    inp[j]=0;
                }
                else{
                    inp[j]++;
                }
            }
            max_rect=Math.max(max_rect,largestRectangleArea(inp));
        }
        return max_rect;
    }
}