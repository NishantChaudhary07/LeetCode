class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> res=new ArrayList<>();
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int ele:nums1){
            freq.put(ele,freq.getOrDefault(ele,0)+1);
        }
        
        for(int ele:nums2){
            if(freq.containsKey(ele)  && freq.get(ele)>0){
                res.add(ele);
                freq.put(ele,freq.get(ele)-1);
            }
        }
        
        int[] ans=new int[res.size()];
        for(int i=0;i<res.size();i++){
            ans[i]=res.get(i);
        }
        return ans;
    }
}