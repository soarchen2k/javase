package ca.monor.list_链表;

public class SandBox {
    public static void main(String[] args) {
        SingleLinkedList<Integer> linkedList = new SingleLinkedList<>();
        linkedList.add(5);
        linkedList.add(10);
        linkedList.add(1, 12);
        linkedList.add(0, 0);
        System.out.println(linkedList);
        System.out.println(linkedList.remove(2));
        System.out.println(linkedList);
    }
}
