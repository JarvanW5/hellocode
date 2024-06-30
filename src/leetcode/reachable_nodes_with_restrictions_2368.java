package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author:JarvanW
 * @Date:2024/3/2
 * @Description:受限条件下可到达节点的数目
 * @Version:1.8
 * @Requirement:
 */
public class reachable_nodes_with_restrictions_2368 {


    public static class TreeNode {
        int val;
        List<TreeNode> children;

        public TreeNode(int val) {
            this.val = val;
            this.children = new ArrayList<>();
        }
    }

    public int maxNodes(int n, int[][] edges, int[] restricted) {
        // 构建树
        TreeNode[] tree = new TreeNode[n];
        for (int i = 0; i < n; i++) {
            tree[i] = new TreeNode(i);
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            tree[u].children.add(tree[v]);
            tree[v].children.add(tree[u]);
        }

        // 将受限节点加入集合
        Set<Integer> restrictedSet = new HashSet<>();
        for (int node : restricted) {
            restrictedSet.add(node);
        }

        // DFS遍历并计算最多到达的节点数
        int[] result = new int[]{0};
        dfs(tree[0], null, restrictedSet, result);

        return result[0];
    }

    private int dfs(TreeNode node, TreeNode parent, Set<Integer> restrictedSet, int[] result) {
        int count = 1;  // 当前节点算一个
        for (TreeNode child : node.children) {
            if (child != parent && !restrictedSet.contains(child.val)) {
                count += dfs(child, node, restrictedSet, result);
            }
        }
        result[0] = Math.max(result[0], count);
        return count;
    }

    public static void main(String[] args) {
        reachable_nodes_with_restrictions_2368 solution = new reachable_nodes_with_restrictions_2368();
        int n = 7;
        int[][] edges = {{0, 1}, {1, 2}, {3, 1}, {4, 0}, {0, 5}, {5, 6}};
        int[] restricted = {4,5};
        int result = solution.maxNodes(n, edges, restricted);
        System.out.println(result);
    }
}
