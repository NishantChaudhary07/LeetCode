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
    public static boolean isPossible(int[] stalls,int no_of_cows,int mid){
        int cows=1;
        int i=1;
        int currstall=stalls[0];
        while(i<stalls.length){
            if(stalls[i]-currstall>=mid){
                currstall=stalls[i];
                cows++;
            }
            if(cows==no_of_cows){
                return true;
            }
            i++;
        }
        return false;
    }
    
    public static int solve(int n, int k, int[] stalls) {
        Arrays.sort(stalls);
        int start=0,end=stalls[n-1];
        int ans=0;
        while(start<=end){
            int mid=start+(end-start)/2;
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
}