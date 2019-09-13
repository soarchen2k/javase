package ca.monor.list_链表;

public class SingleLinkedList<E> extends AbstractList<E> {
    private Node<E> first;

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
        return null;
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

    private Node<E> node(int index) {
        rangeCheck(index);
        Node<E> node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
}
