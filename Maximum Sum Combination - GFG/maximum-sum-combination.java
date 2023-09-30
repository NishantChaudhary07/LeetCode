//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int b[] = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }

            Solution obj = new Solution();
            List<Integer> ans = obj.maxCombinations(n, k, a, b);
            for (int e : ans) System.out.print(e + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java
// import java.util.*;
class Solution {
    static void reverse(int[] arr){
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
    }
    static List<Integer> maxCombinations(int N, int K, int A[], int B[]) {
        // code here
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b) -> (b[0]+b[1])-(a[0]+a[1]));
        Arrays.sort(A);
        Arrays.sort(B);
        reverse(A);
        reverse(B);
        List<Integer> lst=new ArrayList<>();
        for(int i=0;i<Math.min(A.length,K);i++){
            int[] pair={A[i],B[0],0};
            pq.offer(pair);
        }
        while(K--!=0 && !pq.isEmpty()){
            int[] rem=pq.poll();
            lst.add(rem[0]+rem[1]);
            if(rem[2]+1<B.length){
                int[] newpair={rem[0],B[rem[2]+1],rem[2]+1};
                pq.offer(newpair);
            }
        }
        return lst;
    }
}
