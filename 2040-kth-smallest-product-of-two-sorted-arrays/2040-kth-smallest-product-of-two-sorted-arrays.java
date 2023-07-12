class Solution {
    
    public static long countofproduct(int[] arr1,int[] arr2,long prod){
        long ans=0;
        for(int e1:arr1){
            if(e1>=0){
                long count=0;
                int lo=0;
                int hi=arr2.length-1;
                while(lo<=hi){
                    int mid=(lo+hi)/2;
                    if((long)(e1)*arr2[mid]<=prod){
                        count=mid+1;
                        lo=mid+1;
                    }
                    else{
                        hi=mid-1;
                    }
                }
                ans+=count;
            }else{
                long count=0;
                int lo=0;
                int hi=arr2.length-1;
                while(lo<=hi){
                    int mid=(lo+hi)/2;
                    if((long)(e1)*arr2[mid]<=prod){
                        count=arr2.length-mid;
                        hi=mid-1;
                    }
                    else{
                        lo=mid+1;
                    }
                }
                ans+=count;
            }
        }
        return ans;
    }
    
    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
         long si=-1000_000_0000l;
        long ei=1000_000_0000l;
        long ans=0;
        while(si<=ei){
            long mid=(si+ei)/2;
            if(countofproduct(nums1,nums2,mid)>=k){
                ans=mid;
                ei=mid-1;
            }
            else{
                si=mid+1;
            }
        }
        return ans;
    }
}