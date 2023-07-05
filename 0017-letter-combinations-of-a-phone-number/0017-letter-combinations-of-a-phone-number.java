class Solution {
    public static void combinations(String[] keypad,String digits,int i,String ans,List<String> lst){
        if(ans.length()==digits.length()){
            lst.add(ans);
        }
        if(i==digits.length()){
            return;
        }
        
        String str=keypad[Integer.parseInt(digits.substring(i,i+1))-1];
        
        for(int j=0;j<str.length();j++){
            combinations(keypad,digits,i+1,ans+str.charAt(j),lst);
        }
    }
    public List<String> letterCombinations(String digits) {
        String[] keypad={"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> res=new ArrayList<>();
        if(digits.isEmpty()){
            return res;
        }
        combinations(keypad,digits,0,"",res);
        
        return res;
    }
}