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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode head=new ListNode();
        ListNode temp=head;
    while(true){
        if(l1==null || l2==null){
            break;
        }
        ListNode l=new ListNode((l1.val+l2.val+carry)%10);
        temp.next=l;
        temp=temp.next;
        carry=(l1.val+l2.val+carry)/10;
        l1=l1.next;
        l2=l2.next;
    }
        
        while(l1!=null){
           ListNode l=new ListNode((l1.val+carry)%10);
            temp.next=l;
          temp=temp.next;
          carry=(l1.val+carry)/10;
          l1=l1.next;
        }
        
         while(l2!=null){
           ListNode l=new ListNode((l2.val+carry)%10);
             temp.next=l;
            temp=temp.next;
        carry=(l2.val+carry)/10;
        l2=l2.next;
        }
        
        if(carry!=0){
            temp.next=new ListNode(carry);
        }
        
        head=head.next;
        return head;
    }
}