package ca.monor.leetCode.deleteNode;

public class DeleteNode {
    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(val).append(" ").append(next).append(" ");

            return sb.toString();
        }
    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(4);
        node.next = new ListNode(5);
        node.next.next = new ListNode(1);
        node.next.next.next = new ListNode(9);
        DeleteNode deleteNode = new DeleteNode();
        System.out.println(node);
        deleteNode.deleteNode(node.next);
        System.out.println(node);

    }
}
