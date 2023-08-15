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
    public ListNode partition(ListNode head, int x) {
        ListNode first=new ListNode(0);
        ListNode sec=new ListNode(0);
        
        ListNode first_pointer=first;
        ListNode sec_pointer=sec;
        
        while(head!=null){
            if(head.val<x){
                first.next=new ListNode(head.val);
                first=first.next;
            }
            else{
                sec.next=new ListNode(head.val);
                sec=sec.next;
            }
            head=head.next;
        }
        first.next=sec_pointer.next;
        return first_pointer.next;
    }
}