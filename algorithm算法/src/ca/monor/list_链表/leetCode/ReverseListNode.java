package ca.monor.list_链表.leetCode;

public class ReverseListNode {
    /**
     * Method 1 Iterator
     *
     * @param head
     * @return
     */
    public ListNode ReverseListNode(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = null;
        while (head != null) {
            ListNode tmp = head.next;
            head.next = newHead;
            newHead = head;
            head = tmp;
        }
        return newHead;
    }
}
