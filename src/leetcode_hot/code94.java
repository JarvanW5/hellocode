package leetcode_hot;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author: JarvanW
 * @Date: 2024/9/10
 * @Description:
 * @Requirements: 给定一个二叉树 root ，返回其最大深度。
 * <p>
 * 二叉树的 最大深度 是指从根节点到最远叶子节点的最长路径上的节点数。
 */

public class code94 {

    public static List<Integer> inorderTraversal(TreeNode root) {

        ArrayList<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    // 递归
    public static void inorder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }

        inorder(root.left, result);
        result.add(root.val);
        inorder(root.right, result);
    }


    // 非递归
    public void inorder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            // 一直遍历左子树并压入栈
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            // 弹出栈顶元素并访问
            current = stack.pop();
            System.out.print(current.val + " ");
            // 转向右子树
            current = current.right;
        }
    }

}
