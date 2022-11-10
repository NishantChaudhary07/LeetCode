class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] f1=new int[1001];

        for(int ele:nums1){
            f1[ele]++;
        }
        List<Integer> lst=new ArrayList<>();
        for(int ele:nums2){
            if(f1[ele]>0){
              lst.add(ele);
              f1[ele]--;
            }
        }

        int[] out=new int[lst.size()];
        int i=0;
        for(Integer ele:lst){
            out[i]=ele;
            i++;
        }
        return out;
    }
}