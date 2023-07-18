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
        ListNode dummy=new ListNode(-1);
        ListNode newhead=dummy;
        ListNode temp=head;
        for(int i=1;i<left;i++){
            ListNode newnode=new ListNode(temp.val);
            dummy.next=newnode;
            dummy=dummy.next;
            temp=temp.next;
        }
        for(int i=left;i<=right;i++){
           ListNode newnode=new ListNode(temp.val);
            newnode.next=dummy.next;
            dummy.next=newnode;
            temp=temp.next;
        }
        while(dummy.next!=null){
            dummy=dummy.next;
        }
        dummy.next=temp;
        return newhead.next;
    }
}