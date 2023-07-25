class Solution {
    public ArrayList<Integer> helper(int[] nums1,int[] nums2){
          ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> res=new ArrayList<>();
        for(int ele:nums1){
            l1.add(ele);
        }
        for(int ele:nums2){
            if(l1.contains(ele)){
                res.add(ele);
                l1.remove(l1.indexOf(ele));
            }
        }
        return res;
    }
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> res=new ArrayList<>();
        if(nums1.length>nums2.length){
            res=helper(nums1,nums2);
        }
        else{
            res=helper(nums2,nums1);
        }
      int[] ans=new int[res.size()];
        for(int i=0;i<res.size();i++){
            ans[i]=res.get(i);
        }
        return ans;
    }
}