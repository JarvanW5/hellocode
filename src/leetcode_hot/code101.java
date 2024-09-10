package leetcode_hot;

/**
 * @Author: JarvanW
 * @Date: 2024/9/10
 * @Description:
 * @Requirements:
 */

public class code101 {

    /**
     * 通过递归的方法，可以判断左右子树是否镜像对称。两个子树对称的条件是：
     * <p>
     * 左子树的左子树与右子树的右子树对称。
     * 左子树的右子树与右子树的左子树对称。
     * 左右子树的根节点值相等。
     *
     * @param root
     * @return
     */

    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true; // 空树是对称的
        }
        return isMirror(root.left, root.right);
    }

    // 判断两个子树是否镜像对称
    private static boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true; // 都为空则对称
        }
        if (left == null || right == null) {
            return false; // 只有一个为空则不对称
        }
        // 两个节点的值相等，且左子树的左子树与右子树的右子树对称，左子树的右子树与右子树的左子树对称
        return (left.val == right.val)
                && isMirror(left.left, right.right)
                && isMirror(left.right, right.left);
    }
}
