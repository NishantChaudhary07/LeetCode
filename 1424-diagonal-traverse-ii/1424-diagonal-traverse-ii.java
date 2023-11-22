class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        Map<Integer,List<Integer>> map=new HashMap<>();
        int len=0;
        for(int i=nums.size()-1;i>=0;i--){
            for(int j=0;j<nums.get(i).size();j++){
                int dia=i+j;
                if(!map.containsKey(dia)){
                    map.put(dia,new ArrayList<Integer>());
                }
                map.get(dia).add(nums.get(i).get(j));
                len++;
            }
        }
        int idx=0;
        int key=0;
        int[] res=new int[len];
        while(map.containsKey(key)){
            for(int num:map.get(key)){
                res[idx]=num;
                idx++;
            }
            key++;
        }
        return res;
    }
}