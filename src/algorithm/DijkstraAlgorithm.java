package algorithm;

/**
 * @Author:JarvanW
 * @Date:2024/3/5
 * @Description:迪杰斯特拉算法
 * @Version:1.8
 * @Requirement:
 */

import java.util.Arrays;

class DijkstraAlgorithm {
    private static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        int[][] graph = {
                {0, 2, 4, 0, 0, 0},
                {0, 0, 1, 7, 0, 0},
                {0, 0, 0, 0, 3, 0},
                {0, 0, 0, 0, 0, 1},
                {0, 0, 0, 2, 0, 5},
                {0, 0, 0, 0, 0, 0}
        };

        int startVertex = 0;
        dijkstra(graph, startVertex);
    }

    private static void dijkstra(int[][] graph, int start) {
        int vertices = graph.length;
        int[] distance = new int[vertices];
        boolean[] visited = new boolean[vertices];

        Arrays.fill(distance, INF);
        distance[start] = 0;

        for (int i = 0; i < vertices - 1; i++) {
            int minVertex = findMinDistanceVertex(distance, visited);
            visited[minVertex] = true;

            for (int j = 0; j < vertices; j++) {
                if (!visited[j] && graph[minVertex][j] != 0 && distance[minVertex] != INF &&
                        distance[minVertex] + graph[minVertex][j] < distance[j]) {
                    distance[j] = distance[minVertex] + graph[minVertex][j];
                }
            }
        }

        printSolution(distance);
    }

    private static int findMinDistanceVertex(int[] distance, boolean[] visited) {
        int minDistance = INF;
        int minVertex = -1;

        for (int i = 0; i < distance.length; i++) {
            if (!visited[i] && distance[i] < minDistance) {
                minDistance = distance[i];
                minVertex = i;
            }
        }

        return minVertex;
    }

    private static void printSolution(int[] distance) {
        System.out.println("Vertex \t Distance from Source");
        for (int i = 0; i < distance.length; i++) {
            System.out.println(i + " \t\t " + distance[i]);
        }
    }
}

