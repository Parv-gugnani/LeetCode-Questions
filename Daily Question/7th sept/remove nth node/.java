public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Create a dummy node to handle edge cases easily
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Initialize two pointers, both starting from the dummy node
        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move the fast pointer `n` steps ahead
        for (int i = 1; i <= n + 1; i++) {
            fast = fast.next;
        }

        // Move both pointers until fast reaches the end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Skip the nth node
        slow.next = slow.next.next;

        // Return the head of the modified list
        return dummy.next;
    }
}
