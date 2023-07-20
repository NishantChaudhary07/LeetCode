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
    
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        
        prev.next=null;
        ListNode list1=sortList(head);
        ListNode list2=sortList(slow);
        return Merge(list1,list2);
    }
    
    public static ListNode Merge(ListNode list1,ListNode list2){
        ListNode merge=new ListNode(-1);
        ListNode mergehead=merge;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                merge.next=new ListNode(list1.val);
                merge=merge.next;
                list1=list1.next;
            }
            else{
                merge.next=new ListNode(list2.val);
                merge=merge.next;
                list2=list2.next;
            }
        }
        if(list1!=null){
            merge.next=list1;
        }
        else{
            merge.next=list2;
        }
        return mergehead.next;
    }
}