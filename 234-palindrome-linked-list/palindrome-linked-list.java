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
    //Getting mid point function
    public ListNode getMidPoint(ListNode head){
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    //Getting reverse of LinkedList through traversal
    public ListNode reverseLL(ListNode head){
        ListNode prev=null;
        ListNode curr=head;

        while(curr!=null){
            ListNode forward=curr.next;

            curr.next=prev;
            prev=curr;
            curr=forward;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        //Handling edge case: An empty list or a list with one node is always a palindrome.
        if(head==null || head.next==null){
            return true; 
        }

        // Find the end of the first half
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast.next != null && fast.next.next != null) { //We want to find the end of the first half, not the middle/second-middle node.
            slow = slow.next;       //This stops slow at the correct splitting point.
            fast = fast.next.next;
        }
        
        // Reverse the second half
        ListNode head2 = reverseLL(slow.next);
        slow.next = null;

        //List 1 & List 2 Compare
        ListNode temp1=head;
        ListNode temp2=head2;

        while(temp1!=null && temp2!=null){
            if(temp1.val!=temp2.val){
                return false;
            }else{

                temp1=temp1.next;
                temp2=temp2.next;
            }
        }
        //Return t or f
        return true;

    }
}