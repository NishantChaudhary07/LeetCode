import java.util.*;
class Solution {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lst=new ArrayList<>();

         for(int i=1;i<=numRows;i++){
            List<Integer> row=new ArrayList<>();
            for(int j=0;j<i;j++){
                if(j==0 || j==i-1){
                    row.add(1);
                }
                else{
                row.add(lst.get(i-2).get(j-1)+lst.get(i-2).get(j));
                }
            }
            lst.add(row);
        }
        return lst;
    }
}