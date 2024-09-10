package leetcode_hot;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: JarvanW
 * @Date: 2024/9/10
 * @Description:
 * @Requirements:
 *
 * 给定一个二叉树 root ，返回其最大深度。
 * <p>
 * 二叉树的 最大深度 是指从根节点到最远叶子节点的最长路径上的节点数。
 */

public class code94 {

    public static List<Integer> inorderTraversal(TreeNode root) {

        ArrayList<Integer> result = new ArrayList<>();
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

}
