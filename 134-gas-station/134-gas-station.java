class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int startindex=0;
        int total=0;
        int currtotal=0;
       for(int i=0;i<gas.length;i++){
           total+=(gas[i]-cost[i]);
           currtotal+=(gas[i]-cost[i]);
           if(currtotal<0){
               currtotal=0;
               startindex=i+1;
           }
       }
        if(total<0)
            return -1;
        else
            return startindex;
    }
}