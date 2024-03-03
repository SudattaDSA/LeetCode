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
    public ListNode removeElements(ListNode head, int val) {
    // Create a dummy head node
    ListNode dummy = new ListNode(-1,head);
    //dummy.next = head;

    ListNode curr = dummy;
    while (curr.next != null) {

      // Check if the value matches
      if (curr.next.val == val)
        curr.next = curr.next.next;
      else
        curr = curr.next;
    }

    // Return the head
    return dummy.next;
    }
}