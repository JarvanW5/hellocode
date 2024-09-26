package findwork.threesix;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            y[i] = scanner.nextInt();
        }

        int maxHighRiskCount = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                int distance = Math.abs(x[i] - x[j]) + Math.abs(y[i] - y[j]);
                if (distance <= k) {
                    count++;
                }
            }

            maxHighRiskCount = Math.max(maxHighRiskCount, count);
        }
        System.out.println(maxHighRiskCount);
    }
}
