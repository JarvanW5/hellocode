package leetcode_hot;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: JarvanW
 * @Date: 2024/9/10
 * @Description:
 * @Requirements:
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
