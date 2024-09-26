package findwork.dewu;

import java.util.*;

/**
 * @Author: JarvanW
 * @Date: 2024/9/24
 * @Description:
 * @Requirements:
 */

public class test3 {
    static class Edge{
        int to, weight;
        Edge(int to, int weight){
            this.to = to;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int w = scanner.nextInt();
            graph.get(u).add(new Edge(v,w));
            graph.get(v).add(new Edge(u,w));
        }

        int[] dist = new int[n + 1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[1] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparing(a -> a[1]));
        pq.offer(new int[]{1,0});
        while (!pq.isEmpty()){
            int[] current = pq.poll();
            int u = current[0];
            int d = current[1];

            if (d > dist[u]) continue;

            for (Edge edge : graph.get(u)) {
                int v = edge.to;
                int weight = edge.weight;

                if (dist[u] + weight < dist[v]){
                    dist[v] = dist[u] + weight;
                    pq.offer(new int[]{v,dist[v]});
                }
            }
        }

        int canReduce = 0;
        for (int i = 0; i < k; i++) {
            int p = scanner.nextInt();
            int s = scanner.nextInt();
            if (dist[p] <= s){
                canReduce++;
            }
        }
        System.out.println(canReduce);
    }
}
