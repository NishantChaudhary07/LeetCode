/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA=0;
        ListNode tempA=headA;
        while(tempA!=null){
            tempA=tempA.next;
            lenA++;
        }
        int lenB=0;
        ListNode tempB=headB;
        while(tempB!=null){
            tempB=tempB.next;
            lenB++;
        }
        
        if(lenA>lenB){
            int diff=lenA-lenB;
            while(diff-->0){
                headA=headA.next;
            }
        }
        else{
             int diff=lenB-lenA;
            while(diff-->0){
                headB=headB.next;
            }
        }
        while(headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }
        return headA;
    }
}