package ca.monor.leetCode.tree.binaryTree.symmetricTree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

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
        if (root == null) {
            return false;
        }
        if (root.left != root.right) {
            return false;
        }
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        linkedList.offer(root);
        int levelSize = 1;
        while (!linkedList.isEmpty()) {
            root = linkedList.poll();
            if (root.left!=null) linkedList.offer(root.left);
            if (root.right!=null) linkedList.offer(root.right);
            levelSize--;
            if (levelSize == 0) {
                levelSize = linkedList.size();
                if (levelSize%2!=0) return false;
                int times = levelSize >> 1;
                for (int i = 0; i < times; i++) {
                    if (linkedList.get(i).left.val != linkedList.get(levelSize - i - 1).right.val
                            ||linkedList.get(i).right.val != linkedList.get(levelSize - i - 1).left.val) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
