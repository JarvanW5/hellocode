package leetcode_hot;

/**
 * @Author: JarvanW
 * @Date: 2024/9/10
 * @Description: 翻转二叉树
 * @Requirements:
 */

public class code226 {
    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }
}
