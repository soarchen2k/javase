package ca.monor.tree树;

import ca.monor.tree树.printer.BinaryTreeInfo;

import java.util.Comparator;

public class BinarySearchTree<E> implements BinaryTreeInfo {
    private int size;
    private Node<E> root;
    private Comparator<E> comparator;

    public BinarySearchTree() {
        this(null);
    }

    public BinarySearchTree(Comparator<E> comparator) {
        this.comparator = comparator;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        size = 0;
        root = null;
    }

    public void add(E element) {
        elementNotNullCheck(element);

    }

    private void elementNotNullCheck(E element) {
        if (element == null) {
            throw new IllegalArgumentException("element must not be null");
        }
    }

    @Override

    public Object root() {
        return null;
    }

    @Override
    public Object left(Object node) {
        return null;
    }

    @Override
    public Object right(Object node) {
        return null;
    }

    @Override
    public Object string(Object node) {
        return null;
    }

    private static class Node<E> {
        E element;
        Node<E> left;
        Node<E> right;
        Node<E> parent;

        public Node(E element, Node<E> parent) {  //节点不一定有 child，但一定有 parent
            this.element = element;
            this.parent = parent;
        }

        public boolean isLeaf() {
            return left == null && right == null;
        }

        public boolean hasTwoChildren() {
            return left != null && right != null;
        }
    }
}
