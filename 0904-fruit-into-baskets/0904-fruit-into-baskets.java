class Solution {
    public int totalFruit(int[] fruits) {
      HashMap<Integer,Integer> map=new HashMap<>();
        int left=0;
        int right=0;
        int maxfruits=0;
        while(right<fruits.length){
            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);
            
            if(map.size()>2){
                map.put(fruits[left],map.get(fruits[left])-1);
                if(map.get(fruits[left])==0){
                    map.remove(fruits[left]);
                }
                left++;
            }
            maxfruits=Math.max(right-left+1,maxfruits);
        
            right++;
        }
        return maxfruits;
    }
}