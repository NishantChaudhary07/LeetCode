class Solution {
    public static boolean isPalindrome(String str){
        int left=0,right=str.length()-1;
        while(left<=right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    public static void palPartition(String inp,List<String> lst,List<List<String>> res){
        if(inp.length()==0){
            res.add(new ArrayList<>(lst));
            return;
        }
            
        for(int i=1;i<=inp.length();i++){
            if(isPalindrome(inp.substring(0,i))){
                lst.add(inp.substring(0,i));
                palPartition(inp.substring(i),lst,res);
                lst.remove(lst.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<String> lst=new ArrayList<>();
        List<List<String>> res=new ArrayList<>();
        palPartition(s,lst,res);
        return res;
    }
}