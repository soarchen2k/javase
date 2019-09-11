package ca.monor.list_链表.study学习链表;

import java.util.LinkedList;

public class LinkedListMethodsDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("first");
        linkedList.add("second");
        linkedList.add("third");
        System.out.println(linkedList);

        linkedList.addFirst("addFirst");
        System.out.println(linkedList);

        linkedList.addLast("addLast");
        System.out.println(linkedList);

        linkedList.add(1, "add1");
        System.out.println(linkedList);

        linkedList.remove(5);
        System.out.println(linkedList);

        linkedList.clear();
        System.out.println(linkedList);

        linkedList.add("first");
        linkedList.add("second");
        linkedList.add("first");
        linkedList.add("third");
        linkedList.add("first");
        linkedList.add("five");

        System.out.println(linkedList);
        /*
        boolean removeFirstOccurrence(Object o)：移除链表中第一次出现所在位置的元素；
        boolean removeLastOccurrence(Object o)：移除链表中最后一次出现所在位置的元素；
         */

        linkedList.removeFirstOccurrence("first");
        System.out.println(linkedList);
        linkedList.removeLastOccurrence("first");
        System.out.println(linkedList);
    }
}
