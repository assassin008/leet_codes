import java.util.PriorityQueue;

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
    public ListNode mergeKLists(ListNode[] lists) {
        // Step 1: Initialize the minHeap
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);
        
        // Step 2: Add initial nodes to the minHeap
        for (ListNode list : lists) {
            if (list != null) {
                minHeap.add(list);
            }
        }
        
        // Step 3: Initialize dummy and current pointers
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        // Step 4: Build the merged list
        while (!minHeap.isEmpty()) {
            ListNode smallestNode = minHeap.poll();
            current.next = smallestNode;
            current = current.next;
            
            if (smallestNode.next != null) {
                minHeap.add(smallestNode.next);
            }
        }
        
        return dummy.next;
    }
}
