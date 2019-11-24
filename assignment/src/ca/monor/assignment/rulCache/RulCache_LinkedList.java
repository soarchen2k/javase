package ca.monor.assignment.rulCache;

public class RulCache_LinkedList<E> {
    private static final int MAX_SIZE = 7;
    private Node<E> first;
    private int size;

    private static class Node<E> {
        E element;
        Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(element).append("_").append(next.element);
            return sb.toString();
        }
    }

    public void add(E element) {
        if (this.size == MAX_SIZE) {
            reset(element);
        } else {
            add(size++, element);
        }
    }

    private void add(int index, E element) {
        if (index == 0) {
            Node<E> newFirst = new Node<>(element, first);
            newFirst.next = newFirst;
            first = newFirst;
        } else {
            Node<E> prev = node(index - 1);
            prev.next = new Node<>(element, prev.next);
        }
    }

    private Node<E> node(int i) {
        Node<E> node = first;
        for (int j = 0; j < i; j++) {
            node = node.next;
        }
        return node;
    }

    private void reset(E element) {
        Node<E> newFirst = first.next;
        first.element = element;
        first = newFirst;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("size=").append(size).append(", [");
        Node<E> node = first;
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                string.append(", ");
            }

            string.append(node);

            node = node.next;
        }
        string.append("]");
        return string.toString();
    }
}
