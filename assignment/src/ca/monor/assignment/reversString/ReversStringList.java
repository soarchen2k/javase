package ca.monor.assignment.reversString;

public class ReversStringList {
    public static void main(String[] args) {
        String string = "ABCD EFG";
        System.out.println(revers(string));
//        revers(string);
    }

    /*
    入口函数，接收需要反转的 String 并返回反转后的 String
     */
    public static String revers(String string) {
        if (string == null) {
            return null;
        }
        return listToString(revers2(stringToLIst(string)));
    }

    /*
    通过给定的 head，返回相应的 String
     */
    private static String listToString(ListNode head) {
        if (head == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        ListNode temp = head;
        while (temp != null) {
            sb.append(temp.c);
            temp = temp.next;
        }
        return sb.toString();
    }

    /*
    反转 list 并返回反转后的 list
    迭代
     */
    private static ListNode revers(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }

    /*
    反转 list 并返回反转后的 list
    递归
    */
    private static ListNode revers2(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode newHead = revers2(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    /*
    把 String 转为 List，并返回 list 的 head
     */
    private static ListNode stringToLIst(String string) {
        ListNode head = new ListNode(string.charAt(0));
        ListNode temp = head;
        for (int i = 1; i < string.length(); i++) {
            temp.next = new ListNode(string.charAt(i));
            temp = temp.next;
        }
        return head;
    }

    private static class ListNode {
        char c;
        ListNode next;

        public ListNode(char c) {
            this.c = c;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(c).append(next);
            return sb.toString();
        }
    }
}
