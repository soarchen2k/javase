package ca.monor.list_链表;

/**
 * 不继承任何类，用一个单一类实现 linkedlist
 *
 * @param <E>
 */

public class LinkedListAllInOne<E> {
    private static final int ELEMENT_NOT_FOUND = -1;
    private Node<E> first;
    private Node<E> last;
    private int size;

    private static class Node<E> {
        Node<E> prev;
        E element;
        Node<E> next;

        public Node(Node<E> prev, E element, Node<E> next) {
            this.prev = prev;
            this.element = element;
            this.next = next;
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            if (prev == null) {
                stringBuilder.append("null");
            } else {
                stringBuilder.append(prev);
            }

            stringBuilder.append("_").append(element).append("_");

            if (next == null) {
                stringBuilder.append("null");
            } else {
                stringBuilder.append(next);
            }

            return stringBuilder.toString();
        }
    }

    public void clear() {
        size = 0;
        first = null;
        last = null;
    }

    public E get(int index) {
        rangeCheck(index);
        return node(index).element;
    }

    public E set(int index, E element) {
        rangeCheck(index);
        E currentElement = node(index).element;
        node(index).element = element;
        return currentElement;
    }

    public E remove(int index) {
        rangeCheck(index);
        Node<E> node = node(index);
        node.prev = node.next;
        return node.element;
    }

    public int indexOf(E element) {
        Node<E> node = first;
        if (element == null) {
            for (int i = 0; i < size; i++) {
                if (node.element == null) return i;
                node = node.next;
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (node.element.equals(element)) return i;
                node = node.next;
            }
        }
        return ELEMENT_NOT_FOUND;
    }

    public void add(int index, E element) {
        rangeCheckForAdd(index);

        if (index == size) {
            Node<E> oldLast = last;
            last = new Node<>(oldLast, element, null);
            if (oldLast == null) first = last;
            else oldLast.prev = last;
        } else {
            Node<E> next = node(index);
            Node<E> prev = next.prev;
            Node<E> node = new Node<>(prev, element, next);
            next.prev = node;

            if (index == 0) {
                first = node;
            } else {
                prev.next = node;
            }
        }
        size++;
    }

    public void add(E element) {
        add(size, element);
    }

    private Node<E> node(int index) {
        rangeCheck(index);

        if (index < (size >> 1)) {
            Node<E> node = first;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
            return node;
        } else {
            Node<E> node = last;
            for (int i = size - 1; i > index; i--) {
                node = node.prev;
            }
            return node;
        }
    }

    private void rangeCheck(int index) {
        if (index < 0 || index >= size) {
            outOfBounds(index);
        }
    }

    private void rangeCheckForAdd(int index) {
        if (index < 0 || index > size) {
            outOfBounds(index);
        }
    }

    private void outOfBounds(int index) {
        throw new IndexOutOfBoundsException("Index: " + index + ", size: " + size);
    }
}
