package ca.monor.list链表;

public class SingleLinkedList<E> extends AbstractList {
    private Node<E> first; // 定义链表的头节点

    private static class Node<E> {
        E element;
        Node<E> next;

        public Node(E element, Node<E> next) {

        }
    }

    @Override
    public void clear() {
        size = 0;
        first = null;
    }

    @Override
    public E get(int index) {
//        return node(index).element;
        return null;
    }

    private E node(int index) {
        return null;
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object element) {
        return 0;
    }
}
