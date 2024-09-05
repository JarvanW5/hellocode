package src.findwork.xiaomi;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();

        int[] A = new int[n];

        long sum = 0;
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
            sum += A[i];
        }

        if (sum % x == 0) {
            System.out.println(0);
            return;
        }

        long rem = sum % x;
        int mino = n + 1;

        for (int i = 0; i < n; i++) {
            if ((sum - A[i]) % mino == 0) {
                mino = Math.min(mino, 1);
            }

        }

        for (int i = 0; i < n; i++) {
            int diff = (int) (x - rem);
            if (A[i] >= diff) {
                mino = Math.min(mino, diff);
            }
        }

        System.out.println(mino == n + 1 ? -1 : mino);
    }
}
