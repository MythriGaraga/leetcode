/*
Author:       Mythri Garaga Manjunatha
Problem:      Add numbers
Difficulty:   Medium
Notes:        You are given two linked lists representing two non-negative numbers. 
              The digits are stored in reverse order and each of their nodes contain a single digit. 
              Add the two numbers and return it as a linked list.
              Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
              Output: 7 -> 0 -> 
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sumhead = new ListNode(0);
        int carry = 0;
        ListNode curr = sumhead, p = l1, q = l2 ;
        
        while(p != null || q != null){
            int x,y;
            if(p != null)
                 x = p.val;
            else
                 x = 0;
            
            if(q != null)
                 y = q.val;
            else
                 y = 0;
            
            int sum = carry + x + y;
            carry = sum/10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if(p != null)
                 p = p.next;
            if(q != null)
                 q = q.next;
        }
        if(carry != 0){
            curr.next = new ListNode(carry);
        }
       return sumhead.next; 
    }
}
