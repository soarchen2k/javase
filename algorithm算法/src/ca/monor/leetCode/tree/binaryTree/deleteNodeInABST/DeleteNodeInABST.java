package ca.monor.leetCode.tree.binaryTree.deleteNodeInABST;

/**
 * 450. Delete Node in a BST
 * https://leetcode.com/problems/delete-node-in-a-bst/
 */
public class DeleteNodeInABST {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "val=" + val +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;

        //先定位需要删除的 node
        if (key < root.val) {  //如果 key 小于 roo 的值，则往左边找
            root.left = deleteNode(root.left, key);
            return root;
        } else if (key > root.val) {  //如果 key 大于 root 的值，则往右边找
            root.right = deleteNode(root.right, key);
            return root;
        } else {  //如果 key = root 的值，则表示找到了要删除的点
            if (root.left == null) {  //如果 root 的左为空，直接返回右
                TreeNode rightNode = root.right;
                root.right = null;
                return rightNode;
            }
            if (root.right == null) {
                TreeNode leftNode = root.left;
                root.left = null;
                return leftNode;
            }

            TreeNode successor = minimum(root.right);
            successor.right = removeMin(root.right);
            successor.left = root.left;
            root.left = null;
            root.right = null;
            return successor;
        }
    }

    private TreeNode removeMin(TreeNode node) {
        if (node.left == null) {
            TreeNode rightNode = node.right;
            node.right = null;
            return rightNode;
        }
        node.left = removeMin(node.left);
        return node;
    }

    private TreeNode minimum(TreeNode node) {
        if (node.left == null) {
            return node;
        }
        return minimum(node.left);
    }

    public TreeNode deleteNode2(TreeNode root, int key) {
        if (root == null) {
            return null;
        }

        if (root.val < key) {
            root.right = deleteNode(root.right, key);
        } else if (root.val > key) {
            root.left = deleteNode(root.left, key);
        } else {
            // we have to delete the root node itself
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                TreeNode newRoot = root.right, parent = null;
                // find the smallest value in the right subtree
                while (newRoot.left != null) {
                    parent = newRoot;
                    newRoot = newRoot.left;
                }
                // right node is the smallest node in the right subtree
                if (parent == null) {
                    // connect the left subtree to new root node
                    newRoot.left = root.left;
                    return newRoot;
                }
                parent.left = newRoot.right;
                newRoot.left = root.left;
                newRoot.right = root.right;
                return newRoot;
            }
        }
        return root;
    }
}
