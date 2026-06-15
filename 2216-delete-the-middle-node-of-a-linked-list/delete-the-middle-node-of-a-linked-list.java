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
    public ListNode deleteMiddle(ListNode head) {
        //deal with the list having only one element
        if(head.next == null){
            return null;
        }

        //first thing find the middle of the list
        //we can do this be looping over the list to be able to find the length and then divide it by 2
        ListNode originalHead = head;
        int count = 1;
        ListNode temp = head;
        while(temp.next != null){
            count ++;
            temp = temp.next;

        }

        System.out.println(count);

        //then traverse the list to get to the position that is the middle of the list
        //then remove that middle element by making the element before its next to the element after the middle element
        int half = count /2;
        System.out.println(half);
        int count2 = 0;

        
        while(head.next != null && count2 < half){
            //check if the next node would be the one to remove
            if(count2 + 1 == half){
                //remove the node
                head.next = head.next.next;
                break;//exit the loop
            }
            count2 ++;
            head = head.next;

        }


        
        return originalHead;   
    }
}