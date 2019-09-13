package ca.monor.list_链表;

public class SandBox {
    public static void main(String[] args) {
        LinkedListAllInOne<Integer> linkedList = new LinkedListAllInOne<>();
        linkedList.add(5);
        linkedList.add(10);
        linkedList.add(1, 12);
        linkedList.add(0, 0);
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(2));
        System.out.println(linkedList.get(3));

    }
}
