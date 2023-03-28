class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int dp[]=new int[days.length+1];
        return check(days,costs,0,dp);
    }
    public static int check(int d[],int c[],int day,int dp[]){
        if(day>=d.length) return 0;
        if(dp[day]!=0) return dp[day];
        int d1=check(d,c,day+1,dp)+c[0];
        int i;
        for(i=day;i<d.length;i++){
            if(d[i]>=d[day]+7) break;
        }
        int d7=check(d,c,i,dp)+c[1];
        for(i=day;i<d.length;i++){
            if(d[i]>=d[day]+30) break;
        }
        int d30=check(d,c,i,dp)+c[2];
        return dp[day]=Math.min(d1,Math.min(d7,d30));
    }
}