class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set=new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int max=0;
        int thirdmax=0;
        int count=0;
        for(Integer ele:set){
            max=ele;
            if(count==set.size()-3){
                thirdmax=ele;
            }
            count++;
        }
        System.out.print(set);
        if(set.size()<3){
            return max;
        }
        else
            return thirdmax;
    }
}