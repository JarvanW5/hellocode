package leetcode_hot;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: JarvanW
 * @Date: 2024/9/10
 * @Description:
 * @Requirements:
 */

public class code104 {

    public static int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return Math.max(leftDepth, rightDepth) + 1;
    }


    public static int maxDepth1(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int depth = 0;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            depth++;
            // 遍历当前层的所有节点
            for (int i = 0; i < levelSize; i++) {
                TreeNode current = queue.poll();
                // 将左右子节点加入队列
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
        }

        return depth;
    }

}
