package test.xiecheng;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author:JarvanW
 * @Date:2024/5/20
 * @Description:
 * @Version:1.8
 * @Requirement:
 */
public class test4 {
    static int count = 0;

    static void dfs(ArrayList<Integer>[] graph, String letters, boolean[] visited, int u, String current) {
        visited[u] = true;
        current += letters.charAt(u);

        if (current.equals("you")) {
            count++;
        }

        for (int v : graph[u]) {
            if (!visited[v]) {
                dfs(graph, letters, visited, v, current);
            }
        }

        visited[u] = false;
    }

    static int findYoupath(ArrayList<Integer>[] graph, String letters) {
        int n = graph.length;
        boolean[] visited = new boolean[n];
        count = 0;

        for (int i = 0; i < n; i++){
            dfs(graph,letters,visited,i,"");
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String letters = scanner.next();
        ArrayList<Integer>[] graph = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();

        }

        for (int i = 0; i < n - 1; i++) {
            int u = scanner.nextInt() - 1;
            int v = scanner.nextInt() - 1;

            graph[u].add(v);
            graph[v].add(u);
        }

        int result = findYoupath(graph,letters);
        System.out.println(result);
    }
}
