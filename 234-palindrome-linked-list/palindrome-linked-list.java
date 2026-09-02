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
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode fwd = null;
        ListNode curr = head;
        while(curr != null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }
    
     public boolean isPalindrome(ListNode head) {
          ListNode temp = head;
    //      ListNode temp2 = newHead;
    //     while(temp != null){
    //         if(temp.val != temp2.val) return false;
    //         temp = temp.next;
    //        temp2 = temp2.next;
    //     }
    //     return true;

      int len = 0;
   while(temp != null){
    temp = temp.next;
    len++;
   }
   temp = head;
   for(int i = 1; i < len/2; i++){
    temp = temp.next;
   }
     ListNode newHead = temp.next;
     temp.next = null;
     newHead = reverse(newHead);
     temp = head;
     ListNode temp2 = newHead;
        while(temp != null && temp2 != null){
            if(temp.val != temp2.val) return false;
            temp = temp.next;
           temp2 = temp2.next;
        }
        return true;
    }
}