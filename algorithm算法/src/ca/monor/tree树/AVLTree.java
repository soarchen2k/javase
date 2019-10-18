package ca.monor.tree树;

import java.util.Comparator;

public class AVLTree<E> extends BST<E> {

    public AVLTree() {
        this(null);
    }

    public AVLTree(Comparator<E> comparator) {
        super(comparator);
    }

    @Override
    protected void afterAdd(Node<E> node) { //首先，新添加的节点一定是 leaf
        /**
         * while 括号内表示给 node 赋值为 node.parent，并且判断其不为空
         */
        while ((node = node.parent) != null) {
            if (isBalanced(node)) {
                updateHeight(node);
            } else {
                rebalance(node);
                break;
            }
        }
    }

    @Override
    protected void afterRemove(Node<E> node) {
        while ((node = node.parent) != null) {
            if (isBalanced(node)) {
                updateHeight(node);
            } else {
                rebalance(node);
            }
        }
    }

    @Override
    protected Node<E> createNode(E element, Node<E> parent) {
        return new AVLNode<>(element, parent);
    }

    private void rebalance(Node<E> grand) {
        Node<E> parent = ((AVLNode<E>) grand).tallerChild();
        Node<E> node = ((AVLNode<E>) parent).tallerChild();
        if (parent.isLeftChild()) { // L
            if (node.isLeftChild()) {  // LL
                rotate(grand, node, node.right, parent, parent.right, grand);
            } else {  //LR
                rotate(grand, parent, node.left, node, node.right, grand);
            }
        } else {  //R
            if (node.isLeftChild()) {  // RL
                rotate(grand, grand, node.left, node, node.right, parent);
            } else {
                rotate(grand, grand, parent.left, parent, node.left, node);
            }
        }
    }

    private void rotate(Node<E> r,
                        Node<E> b, Node<E> c,
                        Node<E> d, Node<E> e, Node<E> f) {
        d.parent = r.parent;  //让 d 成为这颗子树的根节点
        if (r.isLeftChild()) {
            r.parent.left = d;
        } else if (r.isRightChild()) {
            r.right = d;
        } else {
            root = d;
        }

        //b-c
        b.right = c;
        if (c != null) {
            c.parent = b;
        }
        updateHeight(b);

        // e-f
        f.left = e;
        if (e != null) {
            e.parent = f;
        }
        updateHeight(f);

        //b-d-f
        d.left = b;
        d.right = f;
        d.parent = d;
        f.parent = d;
        updateHeight(d);
    }

    private void rebalance2(Node<E> grand) {
        Node<E> parent = ((AVLNode<E>) grand).tallerChild();
        Node<E> node = ((AVLNode<E>) parent).tallerChild();
        if (parent.isLeftChild()) {  // L
            if (node.isLeftChild()) {  // LL
                rotateRight(grand);
            } else {
                rotateLeft(parent);
            }
        } else {  // R
            if (node.isLeftChild()) {  // RL
                rotateRight(parent);
                rotateLeft(grand);
            } else {  //RR
                rotateLeft(grand);
            }
        }
    }

    private void rotateLeft(Node<E> grand) {
        Node<E> parent = grand.right;
        Node<E> child = parent.left;
        grand.right = child;
        parent.left = grand;
        afterRotate(grand, parent, child);
    }

    private void rotateRight(Node<E> grand) {
        Node<E> parent = grand.left;
        Node<E> child = parent.right;
        grand.left = child;
        parent.right = grand;
        afterRotate(grand, parent, child);
    }

    private void afterRotate(Node<E> grand, Node<E> parent, Node<E> child) {
        // 让 parent 成为子树的根节点
        parent.parent = grand.parent;
        if (grand.isLeftChild()) {
            grand.parent.left = parent;
        } else if (grand.isRightChild()) {
            grand.parent.right = parent;
        } else { // grand 是 root 节点
            root = parent;
        }

        // 更新 child 的 parent
        if (child != null) {
            child.parent = grand;
        }

        // 更新 grand 的 parent
        grand.parent = parent;

        // 更新高度
        updateHeight(grand);
        updateHeight(parent);
    }

    private void updateHeight(Node<E> node) {
        ((AVLNode<E>) node).updateHeight();
    }

    private boolean isBalanced(Node<E> node) {
        return Math.abs(((AVLNode<E>) node).balanceFactor()) <= 1;
    }

    private static class AVLNode<E> extends Node<E> {
        int height = 1; //新添加的叶子结点，默认高度为1

        public AVLNode(E element, Node<E> parent) {
            super(element, parent);
        }

        public int balanceFactor() {  //平衡因子，节点的左右高度差
            int leftHeight = left == null ? 0 : ((AVLNode<E>) left).height;
            int rightHeight = right == null ? 0 : ((AVLNode<E>) right).height;
            return leftHeight - rightHeight;
        }

        public void updateHeight() {
            int leftHeight = left == null ? 0 : ((AVLNode<E>) left).height;
            int rightHeight = right == null ? 0 : ((AVLNode<E>) right).height;
            height = 1 + Math.max(leftHeight, rightHeight);
        }

        public Node<E> tallerChild() {
            int leftHeight = left == null ? 0 : ((AVLNode<E>) left).height;
            int rightHeight = right == null ? 0 : ((AVLNode<E>) right).height;
            if (leftHeight > rightHeight) {
                return left;
            }
            if (leftHeight < rightHeight) {
                return right;
            }
            /**
             * 这里如何理解？
             */
            return isLeftChild() ? left : right;
        }

        @Override
        public String toString() {
            String parentString = "null";
            if (parent != null) {
                parentString = parent.element.toString();
            }
            return element + "_p(" + parentString + ")_h" + height + ")";
        }
    }
}
