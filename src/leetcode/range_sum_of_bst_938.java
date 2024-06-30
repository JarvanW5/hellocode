package leetcode;

/**
 * @Author:JarvanW
 * @Date:2024/2/26
 * @Description:二叉搜索树的范围和
 * @Version:1.8
 * @Requirement:
 */



public class range_sum_of_bst_938 {
    static class TreeNode {
        public int val;
        public TreeNode left, right;
        public TreeNode(int x) {
            val = x;
        }
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }

        // 如果当前节点的值在范围内，则加上当前节点的值，并递归遍历左右子树
        if (root.val >= low && root.val <= high) {
            return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
        }
        // 如果当前节点的值小于low，说明在范围内的节点应该在右子树，只需遍历右子树
        else if (root.val < low) {
            return rangeSumBST(root.right, low, high);
        }
        // 如果当前节点的值大于high，说明在范围内的节点应该在左子树，只需遍历左子树
        else {
            return rangeSumBST(root.left, low, high);
        }
    }

    public static void main(String[] args) {
        // 示例用法
        // 创建一个二叉搜索树
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(18);

        // 定义范围 [low, high]
        int low = 7;
        int high = 15;

        // 计算范围内节点值的和
        range_sum_of_bst_938 solution = new range_sum_of_bst_938();
        int result = solution.rangeSumBST(root, low, high);

        // 输出结果
        System.out.println("Sum of node values in the range [" + low + ", " + high + "]: " + result);
    }
}
