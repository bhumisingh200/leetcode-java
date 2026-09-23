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
 //Turtle-Rabbit algorithm
class Solution {
public ListNode middleNode(ListNode head) {

ListNode slow=head; //Turtle=1step forward
ListNode fast=head; //Rabbit=2step forward

    while(fast!=null && fast.next!=null){   //Not checking fast.next.next because it can be null to terminae the while condition
        fast=fast.next.next;
        slow=slow.next;
    }
    //After coming out of the loop our slow will be standing at mid
    return slow;
}

}