class Solution {
    public List<Integer> getRow(int rowIndex) {
       List<List<Integer>> res=new ArrayList<>();
        List<Integer> lst=new ArrayList<>();
        lst.add(1);
        res.add(lst);
        
        if(rowIndex==0){
            return res.get(0);
        }
        lst.add(1);
        res.add(lst);
        if(rowIndex==1){
            return res.get(1);
        }
        else{
            for(int i=2;i<=rowIndex;i++){
                List<Integer> lst0=new ArrayList<>();
                lst0.add(1);
              
                int k=1; 
                while(k<i){
                    lst0.add(res.get(i-1).get(k-1)+res.get(i-1).get(k));
                    
                    k++;
                }
                lst0.add(1);
                res.add(lst0);
            }
            
        }

        return res.get(res.size()-1);
    }
}