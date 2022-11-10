class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet<>();
        Set<Integer> intersect=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(set1.contains(nums2[i])){
                intersect.add(nums2[i]);
            }
        }

        int[] out=new int[intersect.size()];
        int i=0;
        for(Integer ele:intersect){
                out[i]=ele;
                i++;
        }
        return out;
    }
}