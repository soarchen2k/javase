package ca.monor.leetCode.tree.binaryTree.symmetricTree;

/**
 * 101. Symmetric Tree
 * https://leetcode.com/problems/symmetric-tree/
 * 先比较 root 的左右是否一致，不一致则 false，如果一致，则比较两路是否对称，各个元素进行比较
 */

public class SymmetricTree {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public boolean isSymmetric(TreeNode root) {
        if (root.left.val != root.right.val) {
            return false;
        }


        return true;
    }
}
