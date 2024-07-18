package javaguide.leetcode.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @Author: JarvanW
 * @Date: 2024/7/18
 * @Description:
 * @Requirements:
 */

public class Traversal {

    // 迭代法前序遍历
    public static List<Integer> preorderTraversal(TreeNode root) {
        // 创建一个空列表 result 用于存储遍历结果
        List<Integer> result = new LinkedList<>();
        // 创建一个空的栈 st 用于辅助遍历
        Stack<TreeNode> st = new Stack<>();
        // 如果根节点不为空，将其压入栈中
        if (root != null) st.push(root);
        // 如果栈不为空
        while (!st.empty()) {
            // 取出栈顶节点 node
            TreeNode node = st.peek();
            // 如果 node 不为空
            if (node != null) {
                st.pop(); // 将该节点弹出，避免重复操作，下面再将右中左节点添加到栈中
                if (node.right != null) st.push(node.right);  // 添加右节点（空节点不入栈）
                if (node.left != null) st.push(node.left);    // 添加左节点（空节点不入栈）
                st.push(node);                          // 添加中节点
                st.push(null); // 中节点访问过，但是还没有处理，加入空节点做为标记。

            } else { // 只有遇到空节点的时候，才将下一个节点放进结果集
                st.pop();           // 将空节点弹出
                node = st.peek();    // 重新取出栈中元素
                st.pop();
                result.add(node.val); // 加入到结果集
            }
        }
        return result;
    }

    // 迭代法中序遍历
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        Stack<TreeNode> st = new Stack<>();
        if (root != null) st.push(root);
        while (!st.empty()) {
            TreeNode node = st.peek();
            if (node != null) {
                st.pop(); // 将该节点弹出，避免重复操作，下面再将右中左节点添加到栈中
                if (node.right != null) st.push(node.right);  // 添加右节点（空节点不入栈）
                st.push(node);                          // 添加中节点
                st.push(null); // 中节点访问过，但是还没有处理，加入空节点做为标记。

                if (node.left != null) st.push(node.left);    // 添加左节点（空节点不入栈）
            } else { // 只有遇到空节点的时候，才将下一个节点放进结果集
                st.pop();           // 将空节点弹出
                node = st.peek();    // 重新取出栈中元素
                st.pop();
                result.add(node.val); // 加入到结果集
            }
        }
        return result;
    }

    // 迭代法后序遍历
    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        Stack<TreeNode> st = new Stack<>();
        if (root != null) st.push(root);
        while (!st.empty()) {
            TreeNode node = st.peek();
            if (node != null) {
                st.pop(); // 将该节点弹出，避免重复操作，下面再将右中左节点添加到栈中
                st.push(node);                          // 添加中节点
                st.push(null); // 中节点访问过，但是还没有处理，加入空节点做为标记。
                if (node.right != null) st.push(node.right);  // 添加右节点（空节点不入栈）
                if (node.left != null) st.push(node.left);    // 添加左节点（空节点不入栈）

            } else { // 只有遇到空节点的时候，才将下一个节点放进结果集
                st.pop();           // 将空节点弹出
                node = st.peek();    // 重新取出栈中元素
                st.pop();
                result.add(node.val); // 加入到结果集
            }
        }
        return result;
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
        List<Integer> preresult = preorderTraversal(root);
        System.out.println(preresult);

        // 执行中序遍历并打印结果
        List<Integer> inresult = inorderTraversal(root);
        System.out.println(inresult);

        // 执行后序遍历并打印结果
        List<Integer> postresult = postorderTraversal(root);
        System.out.println(postresult);

    }
}
