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
    public ListNode swapNodes(ListNode head, int k) {
        int len=0;
        ListNode temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        
        ListNode nodeA=head;
        for(int i=1;i<k;i++){
            nodeA=nodeA.next;
        }
        ListNode nodeB=head;
        for(int i=0;i<len-k;i++){
            nodeB=nodeB.next;
        }
        
        int tempo=nodeA.val;
        nodeA.val=nodeB.val;
        nodeB.val=tempo;
        return head;
    }
}