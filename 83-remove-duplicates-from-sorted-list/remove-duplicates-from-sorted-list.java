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
    public ListNode deleteDuplicates(ListNode head) {
        //If empty
        if(head==null){
            return head;
        }
        //If 1 node
        if(head.next==null){
            return head;
        }
        //When more then 1 node
        ListNode prev=head;
        ListNode curr=head.next;
        while(curr!=null){
            if(prev.val!=curr.val){
                prev = prev.next;
                curr = curr.next;
            }else{
                prev.next = curr.next;
                curr = curr.next;
            }
        }
        //All duplicates removed from the Linked List
        return head;
    }
}