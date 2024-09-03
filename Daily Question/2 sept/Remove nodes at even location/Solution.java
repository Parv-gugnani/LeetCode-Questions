class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution {
    public void removeEvenNodes(ListNode head) {
        if (head == null) return;

        ListNode current = head;
        ListNode prev = null;
        int position = 1;  // Position starts at 1 (1-based index)

        while (current != null) {
            if (position % 2 == 0) {
                // Remove the current node by skipping it
                prev.next = current.next;
            } else {
                // Move the prev pointer to the current node only if we didn't remove the node
                prev = current;
            }
            current = current.next;
            position++;
        }
    }

    public static void main(String[] args) {
        // Create a linked list 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> NULL
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        // Remove nodes at even locations
        Solution sol = new Solution();
        sol.removeEvenNodes(head);

        // Print the modified list
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }
}
