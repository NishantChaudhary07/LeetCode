class Solution {
       public int[] TopologicalSort(HashMap<Integer,List<Integer>> map,int[] res){
        int[] in=Indegree(map);
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<in.length;i++){
            if(in[i]==0){
                q.add(i);
            }
        }
        int count=0;
           int i=0;
        while(!q.isEmpty()){
            int rem=q.remove();
             res[i]=rem;
            i++;
            count++;
            for(int nbr:map.get(rem)){
                in[nbr]--;
                if(in[nbr]==0){
                    q.add(nbr);
                }
            }
        }
        return count==map.size()?res:new int[0];
    }
    
     public int[] Indegree(HashMap<Integer,List<Integer>> map){
        int[] in=new int[map.size()];
        for(int key:map.keySet()){
            for(int nbr: map.get(key)){
                in[nbr]++;
            }
        }
        return in;
    } 

    public int[] findOrder(int numCourses, int[][] prerequisites) {
          HashMap<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<numCourses;i++){
            map.put(i,new ArrayList<>());
        }
        
        for(int i=0;i<prerequisites.length;i++){
            int v1=prerequisites[i][0];
            int v2=prerequisites[i][1];
            map.get(v2).add(v1);
        }
       return TopologicalSort(map,new int[map.size()]);
    }

    }
