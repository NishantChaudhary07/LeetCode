class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1=nums1.length;
        int len2=nums2.length;
        int[] arr=new int[len1+len2];
        int i=0,j=0,k=0;
        double res=0;
        while(i<len1 && j<len2){
            if(nums1[i]<nums2[j]){
                arr[k]=nums1[i];
                i++;
            }
            else{
              arr[k]=nums2[j];
                j++;  
            }
            k++;
        }
        while(i<len1){
            arr[k]=nums1[i];
            i++;
            k++;
        }
         while(j<len2){
            arr[k]=nums2[j];
            j++;
            k++;
        }
        if(k%2!=0){
            res=(double)arr[(k/2)];
        }
        else{
            res=(arr[k/2]+arr[(k/2)-1])/2.0;
        }
        return res;
    }
}