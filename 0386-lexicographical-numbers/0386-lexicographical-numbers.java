class Solution {
    public static void lexo(int n,int num,List<Integer> lst){
        if(num>n){
            return;
        }
        lst.add(num);
        int i=0;
        if(num==0){
            i=1;
        }
        for(;i<=9;i++){
            lexo(n,num*10+i,lst);
        }
    }
    public List<Integer> lexicalOrder(int n) {
        List<Integer> res=new ArrayList<>();
        lexo(n,0,res);
        res.remove(0);
        return res;
    }
}