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
class Solution {
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
}

//Brute force
/*class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null){
            return null;
        }

        List<ListNode> odd=new ArrayList<>();
        List<ListNode> even=new ArrayList<>();

        ListNode curr = head;
        int pos = 1;

        //Separate nodes by position
        while(curr != null){
            if(pos % 2 == 1){
                odd.add(curr);
            }else{
                even.add(curr);
            }
            curr=curr.next;
            pos++;
        }
        //Connect odd-position nodes
        for (int i = 0; i < odd.size() - 1; i++) {
            odd.get(i).next = odd.get(i + 1);
        }

        // Connect even-position nodes
        for (int i = 0; i < even.size() - 1; i++) {
            even.get(i).next = even.get(i + 1);
        }

        // Connect odd list to even list
        odd.get(odd.size() - 1).next =
            even.isEmpty() ? null : even.get(0);

        // End the list
        if (!even.isEmpty()) {
            even.get(even.size() - 1).next = null;
        }

        return odd.get(0);
    }
}*/