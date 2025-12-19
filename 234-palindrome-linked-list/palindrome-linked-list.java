import java.util.Stack;
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
    public boolean isPalindrome(ListNode head) {
            //can just use like use a stack
            //theck check the stack compared to the list
            Stack<Integer> reversed = new Stack<>();

            ListNode header = head;

            //add to stack
            while(header != null){
                reversed.push(header.val);
                header = header.next;
            }

            //check if it matches
            while(head != null){
                

                //not correctly saying its false
                if(reversed.pop() != head.val){
                    return false;
                }
                head = head.next;
            }


        
        return true;
    }

    // public  addToStack(){

    // }


    // public checkPalindrome(){

    // }


}