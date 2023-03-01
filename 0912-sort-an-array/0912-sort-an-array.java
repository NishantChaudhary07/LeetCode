class Solution {
    private int[] merge(int[] A1,int[] A2){
        int l1=A1.length;
        int l2=A2.length;
        int[] res=new int[l1+l2];
        int i=0,j=0,k=0;
        while(i<l1 && j<l2){
            if(A1[i]<A2[j]){
                res[k]=A1[i];
                i++;
            }
            else{
                res[k]=A2[j];
                j++;
            }
            k++;
        }
          while(i<l1){
                res[k]=A1[i];
                i++;
                k++;
            }
            while(j<l2){
                res[k]=A2[j];
                j++;
                k++;
            }
        return res;
    }
    
    private int[] mergeSort(int[] nums,int start,int end){
        if(start==end){
            int[] A=new int[1];
            A[0]=nums[start];
            return A;
        }
        int mid=(start+end)/2;
        int[] left=mergeSort(nums,start,mid);
        int[] right=mergeSort(nums,mid+1,end);
        return merge(left,right);
    }
    public int[] sortArray(int[] nums) {
       return  mergeSort(nums,0,nums.length-1);
    }
}