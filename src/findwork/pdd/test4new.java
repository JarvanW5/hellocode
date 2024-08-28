package findwork.pdd;

import java.util.Scanner;

/**
 * @Author: JarvanW
 * @Date: 2024/8/25
 * @Description:
 * @Requirements:
 */

public class test4new {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        String s = scanner.nextLine();
        System.out.println(maxLength(s));
    }

    public static int maxLength(String s) {
        int n = s.length();
        int maxLen = 0;

        int[] leftALternating = new int[n];
        int[] rightALternating = new int[n];

        leftALternating[0] = 1;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                leftALternating[i] = leftALternating[i - 1] + 1;
            } else {
                leftALternating[i] = 1;
            }

        }

        rightALternating[n-1] = 1;
        for (int i = n-2; i >= 0; i--) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                rightALternating[i] = rightALternating[i + 1] + 1;
            } else {
                rightALternating[i] = 1;
            }

        }

        for (int i = 0; i < n - 1; i++) {
            maxLen = Math.max(maxLen, leftALternating[i] + rightALternating[i + 1]);
        }

        for (int i = 0; i < n; i++) {
            maxLen = Math.max(maxLen, leftALternating[i]);
        }
        return maxLen;
    }
}
