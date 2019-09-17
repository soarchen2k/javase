package ca.monor.list_链表.leetCode;

public class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode() {
    }

    @Override
    public String toString() {

        return val + ", " + next;
    }
}
