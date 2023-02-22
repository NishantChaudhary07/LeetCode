/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    private static ListNode merge2lists(ListNode list1,ListNode list2){
        ListNode list3=new ListNode();
        ListNode head=list3;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                list3.next=new ListNode(list1.val);
                list1=list1.next;
            }
            else{
                list3.next=new ListNode(list2.val);
                list2=list2.next;
                
            }
            list3=list3.next;
        }
            if(list1!=null){
                list3.next=list1;
            }
            if(list2!=null){
                list3.next=list2;
            } 
        return head.next;
    }
    
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode reslist=new ListNode(Integer.MIN_VALUE);
        ListNode head=reslist;
        for(int i=0;i<lists.length;i++){
            head=merge2lists(head,lists[i]);
        }
        return head.next;
    }
}