class Solution {
    public static boolean isPalindrome(String str){
        int start=0,end=str.length()-1;
        while(start<=end){
            if(str.charAt(start)!=str.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
    
    public static void partition1(String inp,List<String> list,List<List<String>> res){
        if(inp.length()==0){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=1;i<=inp.length();i++){
            if(isPalindrome(inp.substring(0,i))){
                list.add(inp.substring(0,i));
                partition1(inp.substring(i),list,res);
                list.remove(list.size()-1);
            }
        }
    }
    
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        List<String> list=new ArrayList<>();
        partition1(s,list,res);
        return res;
    }
}