package ca.monor.tree树;


import ca.monor.tree树.printer.BinaryTreeInfo;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<E> implements BinaryTreeInfo {
    protected int size;
    protected Node<E> root;

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

    public boolean isComplete() {
        if (root == null) {
            return false;
        }

        Queue<Node<E>> queue = new LinkedList<>();
        queue.offer(root);
        boolean leaf = false;

        while (!queue.isEmpty()) {
            root = queue.poll();
            if (root.hasTwoChildren()) {
                queue.offer(root.left);
                queue.offer(root.right);
            } else if (root.left == null && root.right != null) {
                return false;
            } else {
                leaf = true;
            }
        }
        return true;
    }

    public int height() {  //迭代
        if (root == null) {
            return 0;
        }

        Queue<Node<E>> queue = new LinkedList<>();
        queue.offer(root);
        int height = 0;
        int levelSize = 1;

        while (!queue.isEmpty()) {
            root = queue.poll();
            levelSize--;
            if (root.left != null) queue.offer(root.left);
            if (root.right != null) queue.offer(root.right);

            if (levelSize == 0) {
                height++;
                levelSize = queue.size();
            }
        }
        return height;
    }

    public int height2() {  //递归
        if (root == null) return 0;
        return height2(root);
    }

    private int height2(Node<E> root) {
        return 1 + Math.max(height2(root.left), height2(root.right));
    }

    protected Node<E> creatNode(E element, Node<E> parent) {
        return new Node<E>(element, parent);
    }

    protected Node<E> predecessor(Node<E> node) {

    }

    @Override
    public Object root() {
        return root;
    }

    @Override
    public Object left(Object node) {
        return ((Node<E>) node).left;
    }

    @Override
    public Object right(Object node) {
        return ((Node<E>) node).right;
    }

    @Override
    public Object string(Object node) {
        return node;
    }

    protected static class Node<E> {
        E element;
        Node<E> left;
        Node<E> right;
        Node<E> parent;

        public Node(E element, Node<E> parent) { //不一定有左右子树，一定有 parent
            this.element = element;
            this.parent = parent;
        }

        public boolean isLeaf() {
            return left == null && right == null;
        }

        public boolean hasTwoChildren() {
            return left != null && right != null;
        }

        public boolean isLeftChild() {
            return parent != null && this == parent.left;
        }

        public boolean isRightChild() {
            return parent != null && this == parent.right;
        }

        public Node<E> sibling() { // 返回节点的兄弟节点
            if (isLeftChild()) {  //是左子树，则返回右子树
                return parent.right;
            }

            if (isRightChild()) {  //是右子树，则返回左子树
                return parent.left;
            }
            return null;  //都不是则返回空
        }
    }
}
