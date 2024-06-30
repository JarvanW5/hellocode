package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author:JarvanW
 * @Date:2024/2/27
 * @Description:统计树中的合法路径数目
 * @Version:1.8
 * @Requirement:
 */
public class count_valid_paths_in_a_tree_2867 {
    // 建立树节点
    static class TreeNode {
        public int val;
        public List<TreeNode> neighbors;

        public TreeNode(int val) {
            this.val = val;
            this.neighbors = new ArrayList<>();
        }
    }

    // 检查给定的整数是否是质数
    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 深度优先搜索遍历树结构
    private static int dfs(TreeNode node, TreeNode parent, Set<Integer> primes) {
        int count = 0;
        for (TreeNode neighbor : node.neighbors) {
            if (neighbor != parent) {
                count += dfs(neighbor, node, primes);
            }
        }

        // Check if the path from the current node to its parent is legal
        if (parent != null && (primes.contains(node.val) || primes.contains(parent.val))) {
            count++;
        }

        return count;
    }

    // 初始化质数集合，创建一个“TreeNode”数组来表示树结构
    public static int countLegalPaths(int n, int[][] edges) {
        // 集合实现，HashSet用于存储唯一的元素，不允许重复
        Set<Integer> primes = new HashSet<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }

        TreeNode[] nodes = new TreeNode[n + 1];
        for (int i = 1; i <= n; i++) {
            nodes[i] = new TreeNode(i);
        }

        for (int[] edge : edges) {
            nodes[edge[0]].neighbors.add(nodes[edge[1]]);
            nodes[edge[1]].neighbors.add(nodes[edge[0]]);
        }

        return dfs(nodes[1], null, primes);
    }

    public static void main(String[] args) {
        int n = 6;
        int[][] edges = {{1, 2}, {1, 3}, {2, 4}, {3, 5},{3,6}};
        int result = countLegalPaths(n, edges);
        System.out.println(result);
    }

}
