package ca.monor.list_链表.leetCode;

public class DeleteNode {
    public void deleteListNode(ListNode node) {
        node.val = node.next.val;
        node = node.next.next;
    }
}
