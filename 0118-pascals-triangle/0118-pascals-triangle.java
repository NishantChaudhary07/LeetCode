import java.util.*;
class Solution {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lst=new ArrayList<>();
        lst.add(new ArrayList(Arrays.asList(1)));
        if(numRows==1)
            return lst;
        lst.add(new ArrayList(Arrays.asList(1,1)));
        if(numRows==2)
            return lst;
        
        for(int i=2;i<numRows;i++){
            List<Integer> lst0=new ArrayList<>();
            lst0.add(0,1);
            for(int j=1;j<i;j++){
                lst0.add(j,lst.get(i-1).get(j-1)+lst.get(i-1).get(j));
            }
            lst0.add(1);
            lst.add(lst0);
        }
        return lst;
    }
}