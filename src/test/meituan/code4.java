package test.meituan;

import java.util.*;

/**
 * @Author:JarvanW
 * @Date:2024/4/20
 * @Description:
 * @Version:1.8
 * @Requirement:
 */
public class code4 {
    static class TreeNode {
        int val;
        List<TreeNode> children;

        public TreeNode(int val) {
            this.val = val;
            this.children = new ArrayList<>();
        }
    }

    static int countSquarePaths(int n, int[] weights, int[][] edges) {
        int[] count = new int[1];
        Set<Integer> squares = new HashSet<>();
        for (int i = 1; i * i < 1000000000; i++) {
            squares.add(i * i);
        }

        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());

        }
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);

        }

        dfs(1,-1,1,weights,count,squares,graph);

        return count[0];


    }

    static void dfs(int node, int parent, long product, int[] weights, int[] count, Set<Integer> squares, Map<Integer, List<Integer>> graph) {
        product *= weights[node - 1];

        int root = (int) Math.sqrt(product);
        if (root * root == product){
            count[0]++;
        }

        for (int child : graph.get(node)){
            if (child != parent){
                dfs(child,node,product,weights,count,squares,graph);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            weights[i] = scanner.nextInt();

        }
        int[][] edges = new int[n-1][2];
        for (int i = 0; i < n-1; i++) {
            edges[i][0] = scanner.nextInt();
            edges[i][1] = scanner.nextInt();

        }
        int result = countSquarePaths(n,weights,edges);
        System.out.println(result);
    }
}
