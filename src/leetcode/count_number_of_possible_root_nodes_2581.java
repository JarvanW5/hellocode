package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author:JarvanW
 * @Date:2024/2/29
 * @Description:统计可能的树根数目
 * @Version:1.8
 * @Requirement:
 */
public class count_number_of_possible_root_nodes_2581 {
    public static List<Integer> possibleRoots(int[][] edges, int[][] guesses, int k) {
        Map<Integer, List<Integer>> graph = new HashMap<>();

        // 构建树的邻接表表示
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.computeIfAbsent(u, ArrayList::new).add(v);
            graph.computeIfAbsent(v, ArrayList::new).add(u);
        }

        // 深度优先搜索函数
        int[] guessCount = new int[1];

        // 遍历每个节点，判断是否为可能的树根
        List<Integer> possibleRoots = new ArrayList<>();
        for (int root = 0; root <= edges.length; root++) {
            guessCount[0] = 0;
            if (dfs(root, -1, guesses, graph, guessCount) >= k) {
                possibleRoots.add(root);
            }
        }

        return possibleRoots;
    }

    private static int dfs(int node, int parent, int[][] guesses, Map<Integer, List<Integer>> graph, int[] guessCount) {
        int count = 0;
        for (int child : graph.getOrDefault(node, new ArrayList<>())) {
            if (child == parent) {
                continue;
            }
            for (int[] guess : guesses) {
                int u = guess[0];
                int v = guess[1];
                if ((u == node && v == child) || (u == child && v == node)) {
                    guessCount[0]++;
                    break;
                }
            }
            count += dfs(child, node, guesses, graph, guessCount);
        }
        return count + guessCount[0];
    }

    public static void main(String[] args) {
        int[][] edges = {{0, 1}, {1, 2}, {1, 3}, {4, 2}};
        int[][] guesses = {{1, 3}, {0, 1}, {1, 0}, {2, 4}};
        int k = 3;
        List<Integer> result = possibleRoots(edges, guesses, k);
        System.out.println(result);
    }
}
