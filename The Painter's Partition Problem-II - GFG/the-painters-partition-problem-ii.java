//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input_line1[] = read.readLine().trim().split("\\s+");
            int k = Integer.parseInt(input_line1[0]);
            int n = Integer.parseInt(input_line1[1]);
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[n];
            for(int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.minTime(arr,n,k));
        }
    }
}


// } Driver Code Ends


//User function Template for Java

 class Solution{
     public static boolean isPossible(int[] arr,int k,long mid){
         int painters=1;
         int i=0;
         long time=0;
         while(i<arr.length){
             if(time+arr[i]<=mid){
                 time+=arr[i];
                 i++;
             }
             else{
                 time=0;
                 painters++;
             }
             if(painters>k){
                 return false;
             }
         }
         return true;
     }
    static long minTime(int[] arr,int n,int k){
        //code here
        long start=0;
        long end=0;
        for(int i=0;i<n;i++){
            end+=arr[i];
        }
        long ans=0;
        while(start<=end){
            long mid=start+(end-start)/2;
            if(isPossible(arr,k,mid)){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
}


