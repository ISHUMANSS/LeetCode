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

        //thought about using like a set but we need to return to a link list

        //base case
        if (head == null) {
            return head;
        }
        //
        ListNode node = head;

        //run untill the end of the linked list
        while(node.next != null){
            //check if the 2 values match
            if(node.val == node.next.val){
                //move the address over by one skipping the dupe
                node.next = node.next.next;
            }
            else{
                //not dupes go next
                node = node.next;
            }

        }

        //submit the list
        return head;
    }

}