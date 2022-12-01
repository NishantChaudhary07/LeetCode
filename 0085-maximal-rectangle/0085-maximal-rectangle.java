class Solution {
    public static int largestRectangleArea(int[] height){
        Stack<Integer> st=new Stack<>();
        int maxarea=0;
        for(int i=0;i<height.length;i++){
            while(!st.isEmpty() && height[i]<height[st.peek()]){
                int right=i;
                int heigh=height[st.pop()];
                if(!st.isEmpty()){
                   int left=st.peek();
                    maxarea=Math.max(maxarea,(right-left-1)*heigh);
                }
                else{
                    maxarea=Math.max(maxarea,heigh*right);
                }
            }
            st.push(i);
        }
       int  right=height.length;
        while(!st.isEmpty()){
                int heigh=height[st.pop()];
                if(!st.isEmpty()){
                   int left=st.peek();
                    maxarea=Math.max(maxarea,(right-left-1)*heigh);
                }
                else{
                    maxarea=Math.max(maxarea,heigh*right);
                }
        }
        return maxarea;
    }
    
    public int maximalRectangle(char[][] matrix) {
        int[] arr=new int[matrix[0].length];
        int maxrect=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]=='0'){
                    arr[j]=0;
                }
                else{
                    arr[j]++;
                }
            }
            maxrect=Math.max(maxrect,largestRectangleArea(arr));
        }
        return maxrect;
    }
}