/*
Author: Mythri Garaga Manjunatha
Problem: Reverse Linked List II
Difficulty: Hard
Notes: Reverse a linked list from position m to n. Do it in-place and in one-pass.
       For example:
                  Given 1->2->3->4->5->NULL, m = 2 and n = 4,

                  return 1->4->3->2->5->NULL.
*/

public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        ListNode dummyhead = new ListNode(0);
        dummyhead.next = head;
        ListNode start = head;
        int count = 1;
        while(count < m-1){
            start = start.next;
            count++;
        }
        ListNode curr = start.next;
        ListNode prev = curr;
        ListNode fwd = curr.next;
        count = m;
        while(fwd != null && count <= n){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
            count++;
        }
        start.next.next = fwd;
        start.next =  prev;
        return dummyhead.next;
   }
