class Solution {
    public int[] frequencySort(int[] nums) {
          TreeMap<Integer,Integer> freq=new TreeMap<>();
        for(int i=0;i<nums.length;i++){
            int ele=nums[i];
            if(!freq.containsKey(ele)){
                freq.put(ele,1);
            }
            else{
                freq.put(ele,freq.get(ele)+1);
            }
        }
        List<Integer> lst=new ArrayList<>();
        for(int key:freq.keySet()){
            lst.add(freq.get(key));
        }
        Collections.sort(lst);
        int[] ans=new int[nums.length];
        int k=0;
        int l=0;
        int ele=0;
        
        for(int i=0;i<lst.size();i++){
            for(int key:freq.keySet()){
                if(lst.get(i)==freq.get(key)){
                    l=lst.get(i);
                    ele=key;  
                } 
            }
             while(l>0){
                        ans[k++]=ele;
                        freq.put(ele,0);
                        l--; 
                    }
        }
        return ans;
    }
}