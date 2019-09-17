package ca.monor.list_链表.circleLinkedList;

import ca.monor.list_链表.AbstractList;

public class SingleCircleLinkedList<E> extends AbstractList<E> {
    private int size;
    private Node<E> first;

    @Override
    public void clear() {
        size = 0;
        first = null;
    }

    @Override
    public E get(int index) {
        return node(index).e;
    }

    private Node<E> node(int index) {
        rangeCheck(index);
        Node<E> node = first;
        for (int i = 0; i < size; i++) {
            node = node.next;
        }
        return node;
    }

    @Override
    public E set(int index, E element) {
        rangeCheck(index);
//        E old = node(index).e;
//        node(index).e = element;
        /*
        上面的方法虽然也能返回正确的值，但是需要进行两次遍历，增加时间复杂度
         */

        Node<E> node = node(index);
        E old = node.e;
        node.e = element;
        return old;
    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public E remove(int index) {
        rangeCheck(index);
        E eOld = node(index).e;

        if (index == 0) {
            if (size == 1) {
                first = null;
            } else {
                Node<E> last = node(size - 1);
                first = first.next;
                last.next = first;
            }
        } else {
            Node<E> prev = node(index - 1);

        }
        size--;
        return eOld;
    }

    @Override
    public int indexOf(E element) {
        Node<E> node = first;
        if (element == null) {
            for (int i = 0; i < size; i++) {
                if (node.e == null) return i;
                node = node.next;
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (node.e.equals(element)) return i;
                node = node.next;
            }
        }
        return ELEMENT_NOT_FOUND;
    }

    private static class Node<E> {
        E e;
        Node<E> next;

        public Node(E e, Node<E> next) {
            this.e = e;
            this.next = next;
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();

            stringBuilder.append(e).append("_").append(next.e);
            return stringBuilder.toString();
        }
    }
}
