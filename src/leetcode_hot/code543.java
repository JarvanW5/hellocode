package leetcode_hot;

/**
 * @Author: JarvanW
 * @Date: 2024/9/10
 * @Description:
 * @Requirements:
 */

public class code543 {

    private int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return maxDiameter;
    }


    private int depth(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftDepth = depth(node.left);
        int rightDepth = depth(node.right);

        int currentDiameter = leftDepth + rightDepth;

        maxDiameter = Math.max(maxDiameter, currentDiameter);

        return Math.max(leftDepth, rightDepth) + 1;

    }

}
