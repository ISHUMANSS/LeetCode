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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //need to first get to the end of the list
        //with 2 pointers we can keep one pointer the distance from the end we need to go
        //like start the second pointer after the pointer going to the end has gone n steps

        //should be like O(n)

        //also need to keep track to the whole list to submit
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode toEnd = dummy;
        ListNode dealyed = dummy;

        //first move the faster pointer n steps ahead
        for(int i = 0; i < n; i++){
            toEnd = toEnd.next;
        }

        //now that both of the pointer are at the same starting location we can run them both
        while(toEnd.next != null){
            toEnd = toEnd.next;
            dealyed = dealyed.next;
        }

        //cut off the nodes after delayed
        dealyed.next = dealyed.next.next;


        //return the list with the removed element
        return dummy.next;

    }
}