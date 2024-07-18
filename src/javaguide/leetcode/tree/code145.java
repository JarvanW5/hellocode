package javaguide.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: JarvanW
 * @Date: 2024/7/18
 * @Description: 二叉树的后序遍历
 * @Requirements: 给你一棵二叉树的根节点 root ，返回其节点值的 后序遍历 。
 * 示例 1：
 * 输入：root = [1,null,2,3]
 * 输出：[3,2,1]
 * 示例 2：
 * <p>
 * 输入：root = []
 * 输出：[]
 * 示例 3：
 * <p>
 * 输入：root = [1]
 * 输出：[1]
 */

public class code145 {
    public static List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        postorder(root, result);

        return result;

    }

    public static void postorder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        postorder(root.left, result);
        postorder(root.right, result);
        result.add(root.val);
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
        List<Integer> result = postorderTraversal(root);
        System.out.println(result);

    }
}
