package ca.monor.leetCode.binaryTree.binaryTreePostorderTraversal;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class PostorderTraversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            this.val = x;
        }
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new LinkedList<>();
        if (root != null) {
            stack.push(root);
        }
        while (!stack.isEmpty()) {
            root = stack.pop();
            list.add(root.val);
            if (root.left != null) {
                stack.push(root.left);
            }
            if (root.right != null) {
                stack.push(root.right);
            }
        }
        Collections.reverse(list);
        return list;
    }
}
