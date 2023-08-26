class Solution {
    List<Integer> res=new ArrayList<>();
    public void Subset(int[] nums,int idx,int prev,List<Integer> temp,int[] dp){
        if(idx>=nums.length){
            if(temp.size()>res.size()){
                res.clear();
                res.addAll(temp);
            }
            return;
        }
        if(temp.size()>dp[idx] && nums[idx]%prev==0 || prev%nums[idx]==0 ){
            dp[idx]=temp.size();
            temp.add(nums[idx]);
            Subset(nums,idx+1,nums[idx],temp,dp);
            temp.remove(temp.size()-1);
        }
             Subset(nums,idx+1,prev,temp,dp);
    }
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        Subset(nums,0,1,new ArrayList<>(),dp);
        return res;
    }
}