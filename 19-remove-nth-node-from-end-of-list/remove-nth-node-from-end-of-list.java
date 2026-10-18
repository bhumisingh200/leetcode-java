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
 //Brute Force
class Solution {
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
}