package findwork.meituan.m240824;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: JarvanW
 * @Date: 2024/8/24
 * @Description:
 * @Requirements:
 */

public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        long[] shelfLife = new long[m];
        for (int i = 0; i < m; i++) {
            shelfLife[i] = scanner.nextLong();
        }
        int[] productType = new int[m];
        for (int i = 0; i < m; i++) {
            productType[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int li = scanner.nextInt();
            int ri = scanner.nextInt();
            int ti = scanner.nextInt();
            int ki = scanner.nextInt();

            List<int[]> candidates = new ArrayList<>();
            for (int j = li - 1; j < ri; j++) {
                if (productType[j] == ti) {
                    candidates.add(new int[]{j + 1, (int) shelfLife[j]});
                }
            }
            if (candidates.isEmpty()) {
                System.out.println("-1");
                continue;
            }

            candidates.sort((a, b) -> {
                if (b[1] != a[1]) return b[1] - a[1];
                return a[0] - b[0];
            });

            if (candidates.size() < ki) {
                System.out.println("-1");
            } else {
                for (int j = 0; j < ki; j++) {
                    if (j > 0) System.out.println(" ");
                    System.out.println(candidates.get(j)[0]);
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
