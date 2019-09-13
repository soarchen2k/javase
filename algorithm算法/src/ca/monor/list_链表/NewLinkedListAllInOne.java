package ca.monor.list_链表;

public class NewLinkedListAllInOne<E> {
    private static final int ELEMENT_NOT_FOUND = -1;
    private int size;
    private Node<E> first;
    private Node<E> last;

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
            stringBuilder.append(prev == null ? "null" : prev.element).append("_")
                    .append(element + "_").append(next == null ? "null" : next.element);
            return stringBuilder.toString();
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
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

        E old = node(index).element;
        node(index).element = element;
        return old;
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

    public boolean contains(E element) {
        return indexOf(element) != -1;
    }

    public void add(int index, E element) {
        rangeCheckForAdd(index);

        if (index == size) {
            Node<E> oldLast = last;
            last = new Node<>(oldLast, element, null);
            if (oldLast == null) {
                first = last;
            } else {
                oldLast.next = last;
            }
        } else {
            Node<E> next = node(index);
            Node<E> prev = next.prev;
            Node<E> node = new Node<>(prev, element, next);
            next.prev = node;
            if (prev == null) {
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

    public E remove(int index) {
        rangeCheck(index);
        Node<E> node = node(index);
        Node<E> prev = node.prev;
        Node<E> next = node.next;

        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
        }

        size--;
        return node.element;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Size: " + size + " [");
        for (int i = 0; i < size; i++) {
            stringBuilder.append(i == 0 ? node(i) : ", " + node(i));
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    private void rangeCheckForAdd(int index) {
        if (index < 0 || index > size) {
            outOfBounds(index);
        }
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

    private void outOfBounds(int index) {
        throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }
}
