class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<tasks.length;i++){
            if(!map.containsKey(tasks[i])){
                map.put(tasks[i],1);
            }
            else{
                map.put(tasks[i],map.get(tasks[i])+1);
            }
        }
        int count=0;
        for(int key:map.keySet()){
            int ele=map.get(key);
            if(ele==1){
                return -1;
            }
            else if(ele%3==0){
                count+=ele/3;
            }
            else{
                count+=(ele/3)+1;
            }
        }
        return count;
    }
}