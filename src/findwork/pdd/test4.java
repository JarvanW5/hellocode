package findwork.pdd;

import java.util.Scanner;

/**
 * @Author: JarvanW
 * @Date: 2024/8/25
 * @Description:
 * @Requirements:
 */

public class test4 {
    public static int maxLength(String s) {
        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                currentLength++;
            } else {
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 1;
            }
        }
        return Math.max(maxLength, currentLength);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        String s = scanner.nextLine();

        int maxLen = 0;
        for (int i = 1; i < n; i++) {
            String left = new StringBuilder(s.substring(0, i)).reverse().toString();
            String right = new StringBuilder(s.substring(i)).reverse().toString();

            String newString = left + right;
            maxLen = Math.max(maxLen, maxLength(newString));

        }
        System.out.println(maxLen);
    }
}
