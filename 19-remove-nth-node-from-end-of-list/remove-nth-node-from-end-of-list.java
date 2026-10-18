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
 //Brute Force-Count the length
/*class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int length = 0;
        ListNode temp = head;
        
        //Step 1:Count nodes
        while(temp != null){
            length++;
            temp = temp.next;
        }
        //Step 2:Handle deleting the head(edge case)
        if(length == n){
            return head.next;
        }
        //Step 3:Reach the node before the target
        temp = head;
        for(int i=1; i<length-n; i++){
            temp = temp.next;
        }
        //Step 4: Delete the target
        temp.next = temp.next.next;

        return head;
    }
}*/

//Optimal Appraoch- Two Pointer
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0);
        dummy.next= head;      //Remember
        ListNode fast=dummy;
        ListNode slow=dummy;

        //Step 1: Move fast n+1 step ahead
        for(int i=0; i<=n; i++){
            fast = fast.next;
        }
        //Step 2:Move both slow and fast together until temp==null
        while(fast != null){
            slow=slow.next;
            fast=fast.next;
        }
        //Step 3:Remove the target node
        slow.next = slow.next.next;

        return dummy.next;
    }
}