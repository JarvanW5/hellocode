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

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;

    }
}
