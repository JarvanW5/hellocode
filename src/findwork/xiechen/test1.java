package findwork.xiechen;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for (int query = 0; query < q; query++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();

            long maxTreasure = getMaxTreasure(n, m, k);
            System.out.println(maxTreasure);

        }
        sc.close();
    }

    private static long getMaxTreasure(int n, int m, int k) {
        if (k == 1) {
            return 0;
        }

        int minSteps = n + m - 2;

        long maxTreasure = 0;

        if (k <= minSteps) {
            maxTreasure = calculateSimplePath(n,m,k);
        } else {
            long singleRoundTreasure = calculateSimplePath(n,m,minSteps);

            int remainingSteps = k- minSteps;
            long loopTreasure = getLoopTreasure(n,m,remainingSteps);

            maxTreasure = singleRoundTreasure + loopTreasure;
        }
        return maxTreasure;
    }

    private static long calculateSimplePath(int n, int m, int steps) {
        long treasure = 0;
        int x = 0, y = 0;
        for (int step = 0; step < steps; step++) {
            if (x < n - 1) {
                x++;
            } else if (y < m - 1) {
                y++;
            }
            treasure += x * m + y;
        }
        return treasure;
    }

    private static long getLoopTreasure(int n, int m, int remainingSteps) {
        long treasure = 0;
        for (int step = 0; step < remainingSteps; step++) {
            treasure += (n - 1) * m + (step % 2 == 0 ? 0 : (m - 1));
        }
        return treasure;
    }
}
