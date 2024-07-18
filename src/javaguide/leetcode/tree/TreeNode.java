package javaguide.leetcode.tree;

/**
 * @Author: JarvanW
 * @Date: 2024/7/18
 * @Description: 二叉树的构造
 * @Requirements:
 */

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
