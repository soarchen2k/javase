package ca.monor.leetCode.tree.binaryTree.validateBinarySearchTree;

/**
 * 98. Validate Binary Search Tree
 * https://leetcode.com/problems/validate-binary-search-tree/
 */
public class ValidateBinarySearchTree {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

//    public boolean isValidBST(TreeNode root) {
//        List<Integer> list1 = new ArrayList<>();
//        inOrder(root, list1);
//        List<Integer> list2 = new ArrayList<>(list1);
//        Collections.sort(list1);
//        return list1.equals(list2);
//    }
//
//    private void inOrder(TreeNode root, List<Integer> list1) {
//        if (root == null) {
//            return;
//        }
//
//        inOrder(root.left, list1);
//        list1.add(root.val);
//        inOrder(root.right, list1);
//    }

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }

        return isValidBST(root.left, root, root.right);
    }

    private boolean isValidBST(TreeNode left, TreeNode root, TreeNode right) {
        if (left == null && right == null) {
            return true;
        } else if (left == null) {
            if (right.val < root.val) {
                return false;
            }
        } else if (right == null) {
            if (left.val > root.val) {
                return false;
            }
        } else if (left.val > root.val || right.val < root.val) {
            return false;
        }

        isValidBST(left.left, left, left.right);
        isValidBST(right.left, right, right.right);
        return true;
    }
}
