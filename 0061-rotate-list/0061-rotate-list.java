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
    public ListNode rotateRight(ListNode head, int k) {
        int size=0;
        if(head==null){
            return head;
        }
        ListNode temp=head;
        while(temp!=null){
            size+=1;
            temp=temp.next;
        }
        k=k%size;
        
        for(int i=1;i<=k;i++){
            temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            ListNode temp1=temp.next;
            temp.next=null;
            temp1.next=head;
            head=temp1;
        }
        return head;
    }
}