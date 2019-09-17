package ca.monor.list_链表.SingleLinkedList;

/**
 * 增加一个虚拟头节点
 *
 * @param <E>
 */
public class SingleLinkedList2<E> {
    private Node<E> first;
    private int size;
    private static final int ELEMENT_NOT_FOUND = -1;

    public SingleLinkedList2() {
        first = new Node<>(null, null);
    }

    private static class Node<E> {
        E element;
        Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }
    }

    public int size() {
        return size;
    }

    public void clear() {
        size = 0;
        first = null;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int indexOf(E element) {
        Node<E> node = first.next;
        if (element == null) {
            for (int i = 0; i < size; i++) {
                if (node.element == null) return i;
                node = node.next;
            }
        } else for (int i = 0; i < size; i++) {
            if (node.element.equals(element)) return i;
            node = node.next;
        }
        return ELEMENT_NOT_FOUND;
    }

    public boolean contains(E element) {
        return indexOf(element) != -1;
    }

    public E get(int index) {
        rangeCheck(index);
        return node(index).element;
    }

    public E set(int index, E element) {
        rangeCheck(index);
        Node<E> node = node(index);
        E old = node.element;
        node.element = element;
        return old;
    }

    public void add(int index, E element) {
        rangeCheckForAdd(index);
        Node<E> prev = index == 0 ? first : node(index - 1); //first 为虚拟节点，元素和指向均为空
        prev.next = new Node<>(element, prev.next); //使前节点的next指向新节点，新节点的next指向原前节点的next
        size++;
    }

    public void add(E element) {
        add(size, element);
    }

    public E remove(int index) {
        rangeCheck(index);
        Node<E> prev = size == 0 ? first : node(index - 1); //first为虚拟节点，元素和指向均为空
        Node<E> node = prev.next; // node 为即将被移除的节点
        prev.next = node.next; //prev.next 指向 node.next，node和 node.next 的关系被断开
        size--;
        return node.element;
    }

    private Node<E> node(int index) {
        Node<E> node = first;
        for (int i = 0; i <= index; i++) {
            node = node.next;
        }
        return node;
    }

    private void rangeCheck(int index) {
        if (index < 0 || index >= size) {
            outOfBounds(index);
        }
    }

    public void rangeCheckForAdd(int index) {
        if (index < 0 || index > size) {
            outOfBounds(index);
        }
    }

    private void outOfBounds(int index) {
        throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }
}
