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
        ListNode current = head;
        ListNode dummy =new ListNode(0, head);
        ListNode left = dummy;
        while(n > 0){
            current = current.next;
            n--;
        }
        while(current != null){
            left = left.next;
            current = current.next;
        }
            left.next = left.next.next;
        return dummy.next;
    }
}
