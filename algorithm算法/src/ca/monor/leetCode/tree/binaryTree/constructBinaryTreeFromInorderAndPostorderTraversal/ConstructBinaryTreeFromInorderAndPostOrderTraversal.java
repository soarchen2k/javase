package ca.monor.leetCode.tree.binaryTree.constructBinaryTreeFromInorderAndPostorderTraversal;

import java.util.Arrays;

/**
 * 106. Construct Binary Tree from Inorder and Postorder Traversal
 * https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/
 */

public class ConstructBinaryTreeFromInorderAndPostOrderTraversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int inLength = inorder.length;
        int postLength = postorder.length;

        if (inLength == 0) {
            return null;
        }

        if (inLength == 1) {
            return new TreeNode(inorder[0]);
        }

        //后续遍历最后的节点是树的根节点
        int rootVal = postorder[postLength - 1];

        //找出根节点值在中序遍历中的位置，以划分左右子树
        int indexRootInOrder = 0;
        while (indexRootInOrder < inLength) {
            if (rootVal == inorder[indexRootInOrder]) {
                break;
            }
            indexRootInOrder++;
        }

        TreeNode root = new TreeNode(rootVal);
        root.left = buildTree(Arrays.copyOfRange(inorder, 0, indexRootInOrder)
                , Arrays.copyOfRange(postorder, 0, indexRootInOrder));

        root.right = buildTree(Arrays.copyOfRange(inorder, indexRootInOrder + 1
                , inLength), Arrays.copyOfRange(postorder, indexRootInOrder, postLength - 1));
        return root;
    }
}
