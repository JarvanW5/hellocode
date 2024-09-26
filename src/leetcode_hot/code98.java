package leetcode_hot;

/**
 * @Author: JarvanW
 * @Date: 2024/9/10
 * @Description:
 * @Requirements:
 */

public class code98 {
    public boolean isValidBST(TreeNode root) {
        return validate(root, null, null);
    }

    private boolean validate(TreeNode node, Integer low, Integer high) {
        if (node == null) {
            return true; // 空节点被认为是有效的
        }

        // 检查当前节点的值是否在合法的范围内
        if ((low != null && node.val <= low) || (high != null && node.val >= high)) {
            return false;
        }

        // 递归检查左子树和右子树
        return validate(node.left, low, node.val) && validate(node.right, node.val, high);
    }
}
