package findwork.jd;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int minL = 1, maxR = n;

        for (int i = 0; i < m; i++) {
            int li = scanner.nextInt();
            int ri = scanner.nextInt();

            minL = Math.max(minL, li);
            maxR = Math.min(maxR, ri);
        }
        int total = Math.max(0, maxR - minL + 1);

        System.out.println(total);
    }
}
