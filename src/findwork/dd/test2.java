package findwork.dd;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int n = scanner.nextInt();
            int[] minRank = new int[n + 1];
            int[] maxRank = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                minRank[i] = 1;
                maxRank[i] = n;
            }

            boolean possible = true;
            for (int i = 0; i < n; i++) {
                int op = scanner.nextInt();
                int x = scanner.nextInt();

                if (op == 1) {
                    if (x < n) {
                        minRank[x] = Math.max(maxRank[x], x + 1);
                    }
                } else if (op == -1) {
                    if (x > 1) {
                        maxRank[x] = Math.min(maxRank[x], x - 1);
                    }
                } else if (op == 0) {
                    minRank[x] = Math.max(minRank[x], x);
                    maxRank[x] = Math.min(maxRank[x], x);
                }
            }

            for (int i = 1; i <= n; i++) {
                if (minRank[i] > maxRank[i]) {
                    possible = false;
                    break;
                }
            }

            System.out.println(possible ? "YES" : "NO");
        }
        scanner.close();
    }
}
