class Solution {
   public static void lexicoCounting(int curr, int n,List<Integer> lst){
        if(curr>n){
            return;
        }
        lst.add(curr);
        int i=0;
       if(curr==0){
            i=1;
        }
        for(;i<=9;i++){
            lexicoCounting(curr*10+i,n,lst);
        }
    }
    
    public List<Integer> lexicalOrder(int n) {
        List<Integer> lst=new ArrayList<>();
        lexicoCounting(0,n,lst);
        lst.remove(0);
        return lst;
    }
}