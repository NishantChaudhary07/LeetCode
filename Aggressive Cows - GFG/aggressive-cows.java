//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {

            int n;
            n = sc.nextInt();

            int k;
            k = sc.nextInt();

            int[] v = new int[n];
            for (int i = 0; i < n; i++) v[i] = sc.nextInt();

            Solution obj = new Solution();
            int res = obj.solve(n, k, v);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public static int solve(int n, int k, int[] stalls) {
        Arrays.sort(stalls);
        int start=0;
        int end=stalls[stalls.length-1];
        int ans=0;
        while(start<=end){
             int mid=(start+end)/2;
            if(isPossible(stalls,k,mid)){
                ans=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
     public static boolean isPossible(int[] stalls,int no_of_cows,int mid){
        int curr=stalls[0];
        int i=1;
        int cows=1;
        while(i<stalls.length){
        if(stalls[i]-curr>=mid){
            cows++;
            curr=stalls[i];
        }
        if(cows>=no_of_cows){
            return true;
        }
        i++;
        }
        
        return false;
    }
    }
