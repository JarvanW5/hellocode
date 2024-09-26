package findwork.xiechen;

import java.util.Arrays;
import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int p = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[k];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < k; i++) {
            b[i] = scanner.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b);

        int left = 0, right = Integer.MAX_VALUE;
        while (left < right) {
            int mid = (left + right) / 2;
            if (canAssignInTime(a, b, p, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(left);
    }

    public static boolean canAssignInTime(int[] a, int[] b, int p, int t) {
        int n = a.length;
        int k = b.length;
        int j = 0;

        for (int i = 0; i < n; i++) {
            while (j < k && Math.max(Math.abs(b[j] - a[i]), Math.abs(b[j] - p)) > t) {
                j++;
            }
            if (j == k) {
                return false;
            }
            j++;
        }
        return true;
    }
}
