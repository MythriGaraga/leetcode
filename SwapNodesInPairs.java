/*
Author:   Mythri Garaga Manjunatha
Problem:  Given a linked list, swap every two adjacent nodes and return its head.
          For example,
          Given 1->2->3->4, you should return the list as 2->1->4->3.
Source:   https://leetcode.com/problems/swap-nodes-in-pairs/
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public ListNode swapPairs(ListNode head) {
        
        ListNode curr = head;
        ListNode prev = null;
        ListNode fwd = head;
        int count = 0;
        
        while(curr !=null && count < 2){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
            count++;
        }
        
        if(fwd != null){
            head.next = swapPairs(fwd);
        }
       return prev; 
}
