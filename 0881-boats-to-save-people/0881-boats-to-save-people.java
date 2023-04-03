class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int end=people.length-1,start=0,count=0;
        while(start<=end){
            if(people[start]+people[end]<=limit){
                count++;
                start++;
                end--;
            }
            else{
                count++;
                end--;
            }
        }
       return count;
    }
}