package findwork.qunaer;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String T = scanner.next();
        scanner.close();

        int i = maxPseudoPeriodStrings(n, T);
        System.out.println(i);
    }

    public static int maxPseudoPeriodStrings(int n, String T) {
        int[] freq = new int[10];
        for (char c : T.toCharArray()) {
            freq[c - '0']++;
        }

        for (int len = n; len >= 1; len--) {
            if (n % len == 0) {
                boolean valid = true;
                for (int i = 0; i < 10; i++) {
                    if (freq[i] % len != 0) {
                        valid = false;
                        break;
                    }
                }
                if (valid) {
                    return n / len - 1;
                }
            }

        }
        return 1;
    }
}
