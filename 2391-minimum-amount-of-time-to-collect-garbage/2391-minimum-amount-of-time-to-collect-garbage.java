class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int m=0,p=0,g=0;
        for(int i=garbage.length-1;i>=0;i--){
            for(int j=0;j<garbage[i].length();j++){
                char ch=garbage[i].charAt(j);
                if(ch=='M'){
                    m++;
                }
                else if(ch=='P'){
                    p++;
                }
                else if(ch=='G'){
                    g++;
                }
            }
             if(m>0 && i>0){
                    m+=travel[i-1];
                }
                if(p>0 && i>0){
                    p+=travel[i-1];
                }
                if(g>0 && i>0){
                    g+=travel[i-1];
                }
        }
        // System.out.print(m+","+p+","+g);
        return m+p+g;
    }
}