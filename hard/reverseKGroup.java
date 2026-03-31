class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head;
        int count = 0;
        // Check if there are k nodes left
        while (curr != null && count < k) {
            curr = curr.next;
            count++;
        }
        if (count == k) {
            ListNode prev = null;
            ListNode next = null;
            ListNode tempHead = head;
            for (int i = 0; i < k; i++) {
                next = tempHead.next;
                tempHead.next = prev;
                prev = tempHead;
                tempHead = next;
            }
            if (next != null) {
                head.next = reverseKGroup(next, k);
            }
            return prev;
        }
        return head;
    }
}
