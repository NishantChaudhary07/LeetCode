class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> lst=new ArrayList<>();
        for(int ele:stones){
            lst.add(ele);
        }
        
        while(lst.size()>1){
            Collections.sort(lst);
            int size=lst.size();
            int last=lst.get(size-1);
            int seclast=lst.get(size-2);
            lst.remove(size-1);
            lst.remove(size-2);
            if(last!=seclast){
                lst.add(last-seclast);
            }
        }
        return lst.size()>=1?lst.get(0):0;
    }
}