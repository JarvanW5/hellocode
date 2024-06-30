package leetcode_hot;

/**
 * @Author:JarvanW
 * @Date:2024/5/10
 * @Description: 层序遍历
 * @Version:1.8
 * @Requirement:
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    public TreeNode(int val) {
//        this.val = val;
//    }
//}

/**
 * 需要创建一个result二维数组来存储层序遍历的结果
 * 创建一个队列，用于存储每一层的节点
 * 创建一个链表，将队列中的值存储至链表中
 */

public class tree1 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                currentLevel.add(node.val);

                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            result.add(currentLevel);
        }

        return result;
    }

    // 示例用法
    public static void main(String[] args) {
        // 构建二叉树
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        // 层序遍历
        tree1 traversal = new tree1();
        List<List<Integer>> result = traversal.levelOrder(root);
        System.out.println("二叉树的层序遍历结果为：" + result);
    }
}
