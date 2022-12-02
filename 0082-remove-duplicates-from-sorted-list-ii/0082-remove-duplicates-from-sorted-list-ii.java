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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return head;
        
      ListNode temp=head;
        ListNode prev=head.next;
        while(temp!=null){
            if(temp.next!=null && temp.val==temp.next.val){
                while(temp.next!=null && temp.val==temp.next.val){
                    temp=temp.next;
                }
                prev.next=temp.next;
            }
            else{
                prev=temp;
            }
            temp=temp.next;
        }
        if(head.next!=null && head.val==head.next.val){
        while(head.next!=null && head.val==head.next.val){
            head=head.next;
        }
            head=head.next;
        }
        return head;
    }
}