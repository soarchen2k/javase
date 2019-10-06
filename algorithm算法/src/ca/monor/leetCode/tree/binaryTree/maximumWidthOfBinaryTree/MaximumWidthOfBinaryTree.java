package ca.monor.leetCode.tree.binaryTree.maximumWidthOfBinaryTree;
/**
 * 662. Maximum Width of Binary Tree
 * https://leetcode.com/problems/maximum-width-of-binary-tree/
 * <p>
 * 未解出
 */

import java.util.LinkedList;
import java.util.Queue;

public class MaximumWidthOfBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) {
            return 0;
        }
        int depth = maxDepth(root, queue);
        queue.offer(root);
        int width = 1;
        int levelSize = queue.size();
        for (int i = 0; i < depth; i++) {
            while (levelSize > 0) {
                root = queue.poll();
                queue.offer(root.left);
                queue.offer(root.right);
                levelSize--;
            }
            levelSize = queue.size();
            width = Math.max(width, levelSize);
        }
        return width;
    }

    private int maxDepth(TreeNode root, Queue<TreeNode> queue) {

        queue.offer(root);
        int depth = 0;
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            while (levelSize > 0) {
                root = queue.poll();
                if (root.left != null) {
                    queue.offer(root.left);
                }
                if (root.right != null) {
                    queue.offer(root.right);
                }
                levelSize--;
            }
            depth++;
        }
        return depth;
    }
}
