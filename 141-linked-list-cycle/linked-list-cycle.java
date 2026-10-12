/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 //Fast-Slow pattern to find circular pattern in lL
public class Solution {
    public boolean hasCycle(ListNode head) {

        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

            //Now check for Circular pattern
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
}