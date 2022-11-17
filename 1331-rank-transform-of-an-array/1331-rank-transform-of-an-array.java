class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] arr1=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr1[i]=arr[i];
        }
       Arrays.sort(arr1);
        Map<Integer,Integer> map=new HashMap<>();
        int rank=1;
        for(int i=0;i<arr1.length;i++){
            if(!map.containsKey(arr1[i])){
                map.put(arr1[i],rank);
                rank++;
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }
        
        return arr;
    }
}