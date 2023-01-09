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
       ListNode tempA=headA;
        int sizeA=0;
        while(tempA!=null){
            sizeA++;
            tempA=tempA.next;
        }
        
        ListNode tempB=headB;
        int sizeB=0;
        while(tempB!=null){
            sizeB++;
            tempB=tempB.next;
        }
        if(sizeA>sizeB){
            int diff=sizeA-sizeB;
            while(diff--!=0){
                headA=headA.next;
            }
        }
        else{
            int diff=sizeB-sizeA;
            while(diff--!=0){
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