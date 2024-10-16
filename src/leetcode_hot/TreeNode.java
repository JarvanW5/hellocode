package leetcode_hot;

/**
 * @Author:JarvanW
 * @Date:2024/5/10
 * @Description:
 * @Version:1.8
 * @Requirement:
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