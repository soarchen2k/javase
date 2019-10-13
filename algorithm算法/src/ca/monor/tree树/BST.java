package ca.monor.tree树;

import java.util.Comparator;

public class BST<E> extends BinaryTree<E> {
    private Comparator<E> comparator;

    public BST() {
        this(null);
    }

    public BST(Comparator<E> comparator) {
        this.comparator = comparator;
    }

    public void add(E element) {
        elementNotNullCheck(element);

        //添加第一个节点
        if (root == null) {
            root = createNode(element, null);
            size++;
            afterAdd(root);
            return;
        }

        //添加的节点不是第一个节点，找到父节点
        Node<E> parent = root;
        Node<E> node = root;
        int cmp = 0;
        do {
            cmp = compare(element, node.element);
            parent = node;
            if (cmp > 0) {
                node = node.right;
            } else if (cmp < 0) {
                node = node.left;
            } else {
                node.element = element;
                return;
            }
        } while (node != null);

        //看插入到哪个位置
        Node<E> newNode = createNode(element, parent);
        if (cmp > 0) {
            parent.right = newNode;
        } else parent.left = newNode;
        size++;

        afterAdd(newNode);
    }

    public boolean contains(E element) {
        return node(element) != null;
    }

    public void remove(E element) {
        remove(node(element));
    }

    private void remove(Node<E> node) {
        if (node == null) {
            return;
        }
        size--;
        if (node.hasTwoChildren()) {
            Node<E> s = successor(node);
            node.element = s.element;
            node = s;
        }

        Node<E> replacement = node.left != null ? node.left : node.right;

        if (replacement != null) {
            replacement.parent = node.parent;

            if (node.parent == null) {
                root = replacement;
            } else if (node == node.parent.left) {
                node.parent.left = replacement;
            } else {
                node.parent.right = replacement;
            }

            afterRemove(node);
        } else if (node.parent == null) {
            root = null;
            afterRemove(node);
        } else {
            if (node == node.parent.left) {
                node.parent.left = null;
            } else {
                node.parent.right = null;
            }
            afterRemove(node);
        }
    }

    private Node<E> node(E element) {
        Node<E> node = root;
        while (node != null) {
            int cmp = compare(element, node.element);
            if (cmp == 0) return node;
            if (cmp > 0) {
                node = node.right;
            } else {
                node = node.left;
            }
        }
        return null;
    }

    private int compare(E e1, E e2) {
        if (comparator != null) {
            return comparator.compare(e1, e2);
        }
        return ((Comparable<E>) e1).compareTo(e2);
    }

    protected void afterAdd(Node<E> node) {
    }

    protected void afterRemove(Node<E> node) {
    }

    private void elementNotNullCheck(E element) {
        if (element == null) {
            throw new IllegalArgumentException("element is null");
        }
    }
}
