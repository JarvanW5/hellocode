package findwork.qunaer;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long m = scanner.nextLong();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextLong();
        }

        long[] b = new long[n];
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextLong();
        }


        System.out.println(minimumDaysToReachTarget(n,m,a,b));


    }

    public static long minimumDaysToReachTarget(int n, long m, long[] a, long[] b) {
        long totalBaseSum = 0;
        for (long l : a) {
            totalBaseSum += l;
        }

        if (totalBaseSum >= m) {
            return 0;
        }
        long left = 1;
        long right = n;
        long result = -1;
        while (left <= right) {
            long mid = (left + right) / 2;
            if (canReachTarget(n,m,a,b,mid)) {
                result = mid;
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return result;
    }


    private static boolean canReachTarget(int n, long m, long[] a, long[] b, long x) {
//        long[] doubleValues = Arrays.copyOf(a, a.length);
        long[] doubleValues = Arrays.copyOf(a,a.length);
        Arrays.sort(b);
        Arrays.sort(doubleValues);

        long total = 0;
        for (int i = 0; i < x; i++) {
            total += doubleValues[i] * b[i];
        }
        for (int i = (int) x; i < n; i++) {
            total += doubleValues[i];
        }

        return total >= m;
    }
}
