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
//Optimal: Rearrange links
/*class Solution {
    public ListNode oddEvenList(ListNode head) {
        //If LL empty
        if(head == null){
            return head;
        }
        //If 1node exist in LL
        if(head.next == null){
            return head;
        }
        //If node more then one in LL
        //Rearrange links
        ListNode oddHead = head;
        ListNode oddTail = head;
        ListNode evenHead = head.next;
        ListNode evenTail = head.next;

        while(evenTail != null && evenTail.next != null){
            //Odd Linking
            oddTail.next = evenTail.next;
            oddTail = evenTail.next;

            //EvenLinking
            evenTail.next = oddTail.next;
            evenTail = oddTail.next;
        }
        //Connect List
        oddTail.next = evenHead;

        //Return head of modified list
        return oddHead;
    }
}*/

//Brute force
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){    //null list && single node  
            return head;
        }

        List<Integer> list=new ArrayList<>();

        //Store odd-position values
        ListNode curr = head;
        int pos=1;
        while(curr != null){
            if(pos % 2 == 1){
                list.add(curr.val);
            } 
            curr = curr.next;
            pos++;    
        }
        //Store even-position values
        curr = head;
        pos=1;
        while(curr != null){
            if(pos % 2 == 0){
                list.add(curr.val);
            }
            curr = curr.next;
            pos++;
        }

        //Copy values back into linked list
        curr = head;
        for(int val:list){
            curr.val=val;
            curr=curr.next;
        }
        return head;
    }
}