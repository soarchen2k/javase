package ca.monor.list_链表;

/**
 * 单链表
 *
 * @param <E>
 */

public class SingleLinkedList<E> extends AbstractList<E> {
    private Node<E> first;  //单链表为单向，只有头节点

    private static class Node<E> { //如果写内部类，前面一律加 private static
        E element;
        Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;  //element 是节点的元素
            this.next = next;        //next 是链表的节点
        }
    }

    @Override
    public void clear() {
        size = 0;
        first = null;
    }

    @Override
    public E get(int index) {
        rangeCheck(index);
        return node(index).element;
    }

    @Override
    public E set(int index, E element) {
        rangeCheck(index);
        Node<E> node = node(index);
        E old = node.element;
        node.element = element;
        return old;
    }

    @Override
    public void add(int index, E element) {
        rangeCheckForAdd(index);

        if (index == 0) {
            first = new Node<>(element, first);
        } else {
            Node<E> prev = node(index - 1);
            prev.next = new Node<>(element, prev.next); //第一个 prev.next 指向新节点，
            // 后面的prev.next指向新节点建立前的前节点的后节点
        }
        size++;
    }

    @Override
    public E remove(int index) {
        rangeCheck(index);
        Node<E> node = node(index);
        E old = node(index).element;
        if (index == 0) {
            first = node.next;
        } else {
            Node<E> prev = node(index - 1);
            prev.next = node.next;
        }
        size--;
        return old;
    }

    @Override
    public int indexOf(E element) {
        Node<E> node = first;
        if (element == null) {
            for (int i = 0; i < size; i++) {
                if (node.element == null) return i;
                node = node.next;
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (node.equals(element)) return i;
                node = node.next;
            }
        }
        return ELEMENT_NOT_FOUND;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Size: " + size + ", [");
        Node<E> node = first;
        for (int i = 0; i < size; i++) {
            stringBuilder.append(i == 0 ? node.element : ", " + node.element);
            node = node.next;
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    private Node<E> node(int index) {
        rangeCheck(index);
        Node<E> node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
}
