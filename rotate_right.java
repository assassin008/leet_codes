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
    public ListNode rotateRight(ListNode head, int k) {
    // Edge case: if the list is empty or has only one node, or k is 0, return head as is
    if (head == null || head.next == null || k == 0) {
        return head;
    }

    // Step 1: Count the number of nodes in the list and make it circular
    ListNode current = head;
    int length = 1; // start at 1 to include the head

    while (current.next != null) { // traverse the list to count nodes
        current = current.next;
        length++;
    }

    // Connect the last node to the head to make it circular
    current.next = head;

    // Step 2: Calculate the effective number of rotations
    k = k % length; // if k >= length, we only need to rotate k % length times
    int stepsToNewHead = length - k; // find the new head position

    // Step 3: Find the new tail (the node before the new head)
    ListNode newTail = head;
    for (int i = 1; i < stepsToNewHead; i++) {
        newTail = newTail.next;
    }

    // Step 4: Set the new head and break the circular connection
    ListNode newHead = newTail.next;
    newTail.next = null; // break the link to make it a proper list again

    return newHead;
}

}