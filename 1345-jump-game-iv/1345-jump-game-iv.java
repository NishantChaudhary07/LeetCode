class Solution {
    public int minJumps(int[] arr) {
        int n=arr.length;
        if(n<=1)
            return 0;
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!map.containsKey(arr[i])){
                List<Integer> lst=new ArrayList<>();
                lst.add(i);
                map.put(arr[i],lst);
            }
            else{
                List<Integer> lst=map.get(arr[i]);
                lst.add(i);
                map.put(arr[i],lst);
            }
        }
        int step=0;
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        
        while(!q.isEmpty()){
            step++;
            int size=q.size();
            for(int i=0;i<size;i++){
                int j=q.poll();
                if(j-1>=0 && map.containsKey(arr[j-1])){
                    q.add(j-1);
                }
                if(j+1<n && map.containsKey(arr[j+1])){
                    if(j+1==n-1)
                        return step;
                    q.add(j+1);
                }
                
                if(map.containsKey(arr[j])){
                    for(int k:map.get(arr[j])){
                        if(j!=k){
                            if(k==n-1)
                                return step;
                            q.add(k);
                        }
                    }
                }
                map.remove(arr[j]);
            }
        }
        return step;
    }
}