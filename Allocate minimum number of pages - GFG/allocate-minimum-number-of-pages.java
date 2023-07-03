//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.findPages(a,n,m));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution 
{
    public static boolean isPossible(int[] a,int m,int mid){
        int pages=0;
        int i=0;
        int students=1;
        while(i<a.length){
            if(pages+a[i]<=mid){
                pages+=a[i];
                i++;
            }
            else{
                pages=0;
                students++;
            }
            if(students>m){
                return false;
            }
        }
        return true;
    } 
    //Function to find minimum number of pages.
    public static int findPages(int[]A,int N,int M)
    {
        //Your code here
        if(N<M){
            return -1;
        }
        int start=0;
        int end=0;
        for(int i=0;i<N;i++){
            end+=A[i];
        }
        int ans=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isPossible(A,M,mid)){
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