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
        ListNode nA=headA;
        ListNode nB=headB;
        while(nA!=nB){
            nA=(nA==null)?headB:nA.next;
            nB=(nB==null)?headA:nB.next;
        }
        return nA;
    }
}