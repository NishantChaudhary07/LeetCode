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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len=0;
        ListNode temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        ListNode head1=new ListNode();
        ListNode prev=head1;
        ListNode curr=head;
        for(int i=0;i<len-n;i++){
            prev.next=curr;
            curr=curr.next;
            prev=prev.next;
        }
        
        prev.next=curr.next;
        return head1.next;
    }
}