//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    long n = Long.parseLong(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[(int)n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    System.out.println(new Solution().getMaxArea(arr, n));
		}
	}
}




// } Driver Code Ends


class Solution
{
    //Function to find largest rectangular area possible in a given histogram.
    public static long getMaxArea(long hist[], long n) 
    {
        // your code here
        Stack<Integer> st=new Stack<>();
        long max_area=0;
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && hist[i]<=hist[st.peek()]){
                long ht=hist[st.pop()];
                if(!st.isEmpty()){
                    max_area=Math.max(max_area,ht*(i-st.peek()-1));
                }
                else{
                    max_area=Math.max(max_area,ht*i);
                }
               
            }
             st.push(i);
        }
        while(!st.isEmpty()){
            long ht=hist[st.pop()];
            if(!st.isEmpty()){
                max_area=Math.max(max_area,ht*(n-st.peek()-1));
            }
            else{
                max_area=Math.max(max_area,ht*n);
            }
        }
        return max_area;
    }
        
}



