class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> lst=new ArrayList<>();
        for(int ele:stones){
            lst.add(ele);
        }
        
        while(lst.size()>1){
            Collections.sort(lst);
            int last=lst.get(lst.size()-1);
            int seclast=lst.get(lst.size()-2);
            lst.remove(lst.size()-1);
            lst.remove(lst.size()-1);
            if(last!=seclast){
                lst.add(last-seclast);
            }
        }
        return lst.size()>=1?lst.get(0):0;
    }
}