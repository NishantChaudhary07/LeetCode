class Solution {
    public static void combinations(String[] arr,String inp,String out,List<String> list){
        if(inp.length()==0){
            list.add(out);
            return;
        }
        String str=arr[Integer.parseInt(inp.substring(0,1))];
        // if(str==""){
        //     return;
        // }
        for(int i=0;i<str.length();i++){
            combinations(arr,inp.substring(1),out+str.charAt(i),list);
        }
    }
    public List<String> letterCombinations(String digits) {
        String[] arr={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> res=new ArrayList<>();
        if(digits.isEmpty()){
            return res;
        }
        combinations(arr,digits,"",res);
        return res;
    }
}