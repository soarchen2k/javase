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

    public void preOrder(Visitor<E> visitor) {
        if (visitor == null) {
            return;
        }

        preOrder(root, visitor);
    }

    private void preOrder(Node<E> node, Visitor<E> visitor) {
        if (node == null && visitor.stop) {
            return;
        }
        assert node != null;
        visitor.stop = visitor.visit(node.element);
        preOrder(node.left, visitor);
        preOrder(node.right, visitor);
    }

    public void inOrder(Visitor<E> visitor) {
        if (visitor == null) {
            return;
        }
        inOrder(root, visitor);
    }

    private void inOrder(Node<E> node, Visitor<E> visitor) {
        if (node == null && visitor.stop) {
            return;
        }
        inOrder(node.left, visitor);
        visitor.stop = visitor.visit(node.element);
        inOrder(node.right, visitor);
    }

    public void postOrder(Visitor<E> visitor) {
        if (visitor == null) {
            return;
        }
        postOrder(root, visitor);
    }

    private void postOrder(Node<E> node, Visitor<E> visitor) {
        if (node == null && visitor.stop) {
            return;
        }
        postOrder(node.left, visitor);
        postOrder(node.right, visitor);
        visitor.stop = visitor.visit(root.element);
    }

    private static abstract class Visitor<E> {
        boolean stop;

        // 如果 stop 返回 true，则停止遍历
        abstract boolean visit(E element);
    }

    public boolean isComplete2() {
        if (root == null) return false;
        Queue<Node<E>> queue = new LinkedList<>();
        queue.offer(root);
        boolean leaf = false;
        while (!queue.isEmpty()) {
            root = queue.poll();
            if (leaf && !root.isLeaf()) {
                return false;
            }
            if (root.left != null) {
                queue.offer(root.left);
            } else if (root.right != null) { //root.left == null && root.right == null
                return false;
            }

            if (root.right != null) {
                queue.offer(root.right);
            } else {  //root.left != null && root.right == null
                leaf = true;
            }
        }
        return true;
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
            if (leaf && !root.isLeaf()) {
                return false;
            }
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

    protected Node<E> createNode(E element, Node<E> parent) {
        return new Node<E>(element, parent);
    }

    protected Node<E> predecessor(Node<E> node) {
        if (node == null) return null;
        Node<E> p = node.left;
        if (p != null) {
            while (p.right != null) {
                p = p.right;
            }
            return p;
        }

        while (node.parent != null && node.parent.left == node) {
            return node.parent;
        }
        return node.parent;
    }

    protected Node<E> successor(Node<E> node) {
        if (node == null) return null;
        if (node.right != null) {
            Node<E> s = node.right;
            while (s.left != null) {
                s = s.left;
            }
            return s;
        }

        while (node.parent != null && node.parent.right == node) {
            return node.parent;
        }
        return node.parent;
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
