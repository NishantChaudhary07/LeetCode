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
    public ListNode reverseBetween(ListNode head, int left, int right) {
       ListNode dummy=new ListNode(0);
       ListNode prev=dummy;
        dummy.next=head;
        for(int i=1;i<left;i++){
            prev=prev.next;
        }
        
        ListNode curr=prev.next;
        for(int i=left;i<right;i++){
            ListNode forw=curr.next;
            curr.next=forw.next;
            forw.next=prev.next;
            prev.next=forw;
        }
        return dummy.next;
    }
}