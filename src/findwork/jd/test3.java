package findwork.jd;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            long sum = scanner.nextLong();

            long maxSum = 0;

            for (int i = n; i > n-k; i--) {
                maxSum += i;
            }
            if (maxSum <= sum) {
                System.out.println(0);
            }else {
                long requiredDecrease = maxSum - sum;
                long maxDecrease = n - k + 1;
                long operations = (requiredDecrease + maxDecrease - 1) / maxDecrease;
                System.out.println(operations);
            }
        }

        scanner.close();
    }
}
