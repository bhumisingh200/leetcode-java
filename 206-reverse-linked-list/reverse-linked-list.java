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
 //Iterative method
 //Time Complexity: O(n)
 //Space Complexity: no recursion → O(1) space
/*class Solution {
    public ListNode reverseList(ListNode head) {
        
        //1.Firstly Create
        ListNode prev=null;
        ListNode curr=head;

        //2.It will work until current is at null
        while(curr!=null){
            ListNode forward=curr.next;

            curr.next=prev;
            prev=curr;
            curr=forward;
        }
        return prev;
    }
}*/

//Recurion Method
//Time Complexity: O(n) because full linklist is being Traversed
//Space Complexity:recursion stack → O(n) space
class Solution{
    public ListNode solve(ListNode prev, ListNode curr){
        //Base Condition
        if(curr==null){
            return prev;
        }

        //One case i will Solve and other work will be done by recursion
        ListNode forward=curr.next;
        //Make it point backward
        curr.next=prev;
        //Move prev and curr 1 step forward
        prev=curr;
        curr=forward;

        //Recursion Call
        ListNode ans=solve(prev,curr);
        return ans;
    }

    public ListNode reverseList(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        ListNode ans=solve(prev,curr);
        return ans;
    }
}