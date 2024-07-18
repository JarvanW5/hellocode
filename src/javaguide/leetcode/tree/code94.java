package javaguide.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: JarvanW
 * @Date: 2024/7/18
 * @Description: 二叉树的中序
 * @Requirements:
 */

public class code94 {

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        inorder(root, result);
        return result;

    }

    public static void inorder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }

        inorder(root.left, result);
        result.add(root.val);
        inorder(root.right, result);
    }

    public static void main(String[] args) {
        // 创建二叉树
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        // 执行前序遍历并打印结果
        List<Integer> result = inorderTraversal(root);
        System.out.println(result);
    }
}
