//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
        int[] freq=new int[26];
        int left=0;
        int right=0;
        int max_len=-1;
        int unique=0;
        while(right<s.length()){
            char ch=s.charAt(right);
            if(freq[ch-'a']==0){
                unique++;
            }

            freq[ch-'a']++;
            while(left<=right && unique>k){
                char chl=s.charAt(left);
                freq[chl-'a']--;
                if(freq[chl-'a']==0){
                    unique--;
                }
                left++;
            }
            
             if(unique==k){
                max_len=Math.max(max_len,right-left+1);
            }
            
            right++;
        }
        return max_len;
    }
}