package findwork.dd;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        long m = scanner.nextLong();

        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextLong();
        }

        int left = 0;
        long currentSum = 0;
        int maxToys = 0;

        for (int right = 0; right < n; right++) {
            currentSum += a[right];

            while (currentSum > m) {
                currentSum -= a[left];
                left++;
            }
            maxToys = Math.max(maxToys, right - left + 1);
        }

        System.out.println(maxToys);
    }
}
