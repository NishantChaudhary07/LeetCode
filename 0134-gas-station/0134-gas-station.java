class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int ind=0;
        int totalcost=0;
        int totalgas=0;
        int currcost=0;
        int currgas=0;
        for(int i=0;i<gas.length;i++){
            totalcost+=cost[i];
            totalgas+=gas[i];
            currcost+=cost[i];
            currgas+=gas[i];
            if(currgas<currcost){
                ind=i+1;
                currcost=0;
                currgas=0;
            }
        }
        if(totalcost>totalgas){
            ind=-1;
        }
        return ind;
    }
}