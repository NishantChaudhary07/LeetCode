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
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        ListNode temp1=head;
        if(count==1){
            head=null;
        }
        else if(count-n==0){
            head=head.next;
        }
        else if(n==1 && count==2){
            temp1.next=null;
        }
       
        else{
        int i=1;
        while(i<count-n){
            temp1=temp1.next;
            i++;
        }
        temp1.next=temp1.next.next;
        }
        return head;
    }
    
}