package ca.monor.leetCode.binaryTree.maximumDepthOfBinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthOfBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);
        int levelSize = 1;
        int depth = 0;

        while (!queue.isEmpty()) {
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
            levelSize = queue.size();
        }
        return depth;
    }
}
