package Grind75;

public class SwapPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode node = head.next;
        ListNode prev = head;
        head = node;  // Update head to the second node as it will become the new head

        while (true) {
            ListNode next = node.next;  // Store the next node to be processed
            node.next = prev;           // Swap current pair by pointing the current node to the previous

            // Check if there are more nodes to process and if not, break
            if (next == null || next.next == null) {
                prev.next = next;
                break;
            }

            prev.next = next.next;  // Point the last swapped node to the node after the next pair
            prev = next;            // Move to the next pair
            node = prev.next;
        }

        return head;

    }
}
