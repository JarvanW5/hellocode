package findwork.meituan.m240824;

import java.util.Scanner;

/**
 * @Author: JarvanW
 * @Date: 2024/8/24
 * @Description:
 * @Requirements:
 */

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long d = scanner.nextLong();

        long n = scanner.nextLong();
        long totalCost = 0;

        for (int i = 0; i < n; i++) {
            long xi = scanner.nextLong();
            long yi = scanner.nextLong();

            long moveToBottl = calculateDistance(a, b, xi, yi);
            long moveToTarget = calculateDistance(xi, yi, c, d);

            totalCost += moveToBottl + moveToTarget;

            a = c;
            b = d;
        }
        System.out.println(totalCost);
    }

    public static long calculateDistance(long x1, long y1, long x2, long y2) {
        long distanceX = x1 > x2 ? x1 - x2 : x2 - x1;
        long distanceY = y1 > y2 ? y1 - y2 : y2 - y1;
        return distanceX + distanceY;
    }
}
