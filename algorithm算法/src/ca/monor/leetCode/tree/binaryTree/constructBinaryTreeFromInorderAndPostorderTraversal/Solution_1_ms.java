package ca.monor.leetCode.tree.binaryTree.constructBinaryTreeFromInorderAndPostorderTraversal;

public class Solution_1_ms {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    private int indexInorder;   // index of inorder array
    private int indexPostorder; // index of postorder array

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        indexInorder = inorder.length - 1;
        indexPostorder = postorder.length - 1;

        return buildTree(inorder, postorder, null);
    }

    private TreeNode buildTree(int[] inorder, int[] postorder, TreeNode end) {
        if (indexPostorder < 0) {
            return null;
        }

        // create root node
        TreeNode root = new TreeNode(postorder[indexPostorder--]);

        // if right node exist, create right subtree
        if (inorder[indexInorder] != root.val) {
            root.right = buildTree(inorder, postorder, root);
        }

        indexInorder--;

        // if left node exist, create left subtree
        if ((end == null) || (inorder[indexInorder] != end.val)) {
            root.left = buildTree(inorder, postorder, end);
        }
        return root;
    }
}
