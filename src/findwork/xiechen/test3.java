package findwork.xiechen;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int l = scanner.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println(maxStrength(n,k,l,a));
    }

    public static int maxStrength(int n, int k, int l, int[] a) {
        int left = 0, right = (int) 1e9 + 1;
        while (left < right) {
            int mid = (left + right + 1) / 2;
            if (canStrength(mid, n, k, l, a)) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }


    public static boolean canStrength(int x, int n, int k, int l, int[] a) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;

        Deque<Integer> deque = new LinkedList<>();
        deque.add(0);

        for (int i = 1; i <= n; i++) {
            if (a[i - 1] >= x) {
                dp[i] = dp[i - 1];
            }
            while (!deque.isEmpty() && deque.peekFirst() < i - l) {
                deque.pollFirst();
            }
            if (!deque.isEmpty() && dp[deque.peekFirst()] != -1) {
                dp[i] = Math.max(dp[i], dp[deque.peekFirst()] + 1);
            }
            if (dp[i] != -1 && dp[i] < k) {
                deque.addLast(i);
            }

        }
        return dp[n] >= k;
    }
}
