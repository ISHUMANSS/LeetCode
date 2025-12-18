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
    public ListNode reverseList(ListNode head) {
        //becasue there is no end node kept we will need to actually loop through

        //set a previous node so 
        ListNode prev = null;
        ListNode current = head;

        while(current != null){
            ListNode temp = current.next;

            current.next = prev;
            prev = current;
            current = temp;
        }

        return prev;
    }

}