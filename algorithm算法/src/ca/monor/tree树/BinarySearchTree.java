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

        // add first node (root)
        if (root == null) {
            root = new Node<>(element, null);  //头节点的 parent 是 null
            size++;
            return;
        }

        // add to other nodes, first find the parent
        Node<E> parent = root;
        Node<E> node = root;
        int elementComparator = 0;
        do {
            elementComparator = compare(element, node.element);
            parent = node; //向左或向右之前，先保存父节点
            if (elementComparator > 0) {  //要插入的节点的值比当前节点的值大
                node = node.right;  // 则将 node 移动到当前 node 的右节点，成为新的要插入的节点的 parent
            } else if (elementComparator < 0) {  //要插入的节点值比当前节点值小
                node = node.left;  // 则将 node 移动到当前 node 的左节点
            } else {  //如果要插入的值等于当前节点的值，就用 element 覆盖当前节点的 element
                node.element = element;
                return;
            }
        } while (node != null);  //当进行到空节点时，则比较结束

        // 判断 element 将插入 parent 的哪个位置(left or right)
        Node<E> newNode = new Node<>(element, parent);
        if (elementComparator > 0) {  //新节点的值较大
            parent.right = newNode;  //则做爲 parent 的 right
        } else {
            parent.left = newNode;  //否则将做爲 parent 的 left
        }
        size++;
    }

    public void remove(E element) {  // 删除某元素的 api
        remove(node(element));  // 建立一个删除节点的 api，并调用
    }

    private void remove(Node<E> node) {  //删除某节点的 api
        if (node == null) { //节点为空，则无法进行 remove 操作
            return;
        }
        if (node.hasTwoChildren()) {  // 如果节点的度为 2，需找出其后继结点，
                                      // 并用后继结点替代 node 节点
            Node<E> s = successor(node);
            //用后继结点的值覆盖度为2的节点的值
            node.element = s.element;
            //删除后继结点
            node = s;  //把 S 赋值给 node，之后删除 node，相当于删除s，由于
                       //S 的值已经覆盖原 node，所以无影响
        }

        // 删除 node 节点，因爲第一个 if 已经过滤掉了 node hasTwoChildren 的情况
        // 所以 node 的度必定是 0 或 1，定义一个 replacement 节点
        Node<E> replacement = node.left != null ? node.left : node.right;

        if (replacement != null) { // 说明 node 是度为1的节点
            replacement.parent = node.parent;  // 找出 node 节点的 parent，让 replacement
                                               // 的 parent 指向 node 的 parent
            if (node.parent == null) {  // node 为 root 节点
                root = replacement;     //让 replacement 成为新的 root 节点
            } else if (node == node.parent.left) { //如果 node 不是 root 节点，而是其父节点的左子节点
                node.parent.left = replacement;  //让 node 的父节点的左子节点指向 replacement，断开 node 与父节点的联系
            } else {
                node.parent.right = replacement;
            }
        } else if (node.parent == null) {
            root = null;
        } else {
            if (node == node.parent.left) {
                node.parent.left = null;
            } else {
                node.parent.right = null;
            }
        }

    }

    private Node<E> successor(Node<E> node) {
        if (node == null) {
            return null;
        }

        //前驱结点在左子树当中 (right.left.left.left....)
        Node<E> p = node.right;
        if (p != null) {
            while (p.left != null) {
                p = p.left;
            }
            return p;
        }

        //从父节点，祖父节点中查找前驱结点
        while (node.parent != null && node == node.parent.right) {
            node = node.parent;
        }
        return node.parent;
    }

    private Node<E> node(E element) {  //查找元素所在的节点，因为是 BST，所有没有重复的节点
        Node<E> node = root;
        while (node != null) {
            int elementComparator = compare(element, node.element);

            if (elementComparator == 0) return node; //如果 node 的值等于 element，则返回 node
            if (elementComparator < 0) { // 因为==0的时候已经返回，无需判断==0的情况
                                         // 小于 0 说明 element 小，继续向左比较
                node = node.left;
            } else {
                node = node.right;  // > 0 说明 element 较大，继续向右比较
            }
        }
        return null;  //如果 while 循环内没有返回值，说明无此节点
    }

    private int compare(E element1, E element2) {
        if (comparator != null) {  //如果创建的 BST 携带比较器，就使用 BST 自带的比较器进行比较
            return comparator.compare(element1, element2);
        }
        // 因为 BST 必须是有序的，所以如果没有建立比较器，则强制要求当前比较的元素
        // 的 class 必须实现 comparable 接口
        return ((Comparable<E>) element1).compareTo(element2);

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
