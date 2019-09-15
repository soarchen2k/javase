package ca.monor.list_链表;

public class SandBox {
    public static void main(String[] args) {
        NewSingleLinkedList<Integer> linkedList = new NewSingleLinkedList<>();
        linkedList.add(5);
        linkedList.add(10);
        linkedList.add(1, 12);
        linkedList.add(0, 0);
        linkedList.add(null);
        System.out.println("Contains null: " + linkedList.contains(null));
        System.out.println("Contains 5: " + linkedList.contains(5));
        System.out.println("Current Size: " + linkedList.size());
        System.out.println(linkedList);
        System.out.println(linkedList.remove(3));
        System.out.println("Current Size: " + linkedList.size());
        System.out.println(linkedList);
    }
}
