package leetcode;

import java.util.*;

/**
 * @Author:JarvanW
 * @Date:2024/3/5
 * @Description:
 * @Version:1.8
 * @Requirement:
 */
public class number_of_ways_to_arrive_at_destination_1976 {

    public int countPaths(int n, int[][] roads) {
        final int MOD = 1000000007;
        List<int[]>[] graph = new List[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] road : roads) {
            int u = road[0];
            int v = road[1];
            int time = road[2];
            graph[u].add(new int[]{v, time});
            graph[v].add(new int[]{u, time});
        }

        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        int[] distances = new int[n];
        Arrays.fill(distances, Integer.MAX_VALUE);
        int[] counts = new int[n];
        distances[0] = 0;
        counts[0] = 1;
        minHeap.offer(new int[]{0, 0});

        while (!minHeap.isEmpty()) {
            int[] current = minHeap.poll();
            int node = current[0];
            int distance = current[1];

            if (distance > distances[node]) {
                continue;
            }

            for (int[] neighbor : graph[node]) {
                int nextNode = neighbor[0];
                int nextDistance = distance + neighbor[1];

                if (nextDistance < distances[nextNode]) {
                    distances[nextNode] = nextDistance;
                    counts[nextNode] = counts[node];
                    minHeap.offer(new int[]{nextNode, nextDistance});
                } else if (nextDistance == distances[nextNode]) {
                    counts[nextNode] = (counts[nextNode] + counts[node]) % MOD;
                }
            }
        }

        return counts[n - 1];
    }

    public static void main(String[] args) {
        number_of_ways_to_arrive_at_destination_1976 solution = new number_of_ways_to_arrive_at_destination_1976();
        int n = 5;
        int[][] roads = {{0, 2, 4}, {2, 3, 3}, {0, 4, 3}, {2, 4, 1}, {0, 3, 2}, {1, 3, 4}, {2, 0, 3}, {0, 1, 2}};
        int result = solution.countPaths(n, roads);
        System.out.println(result);
    }

}
