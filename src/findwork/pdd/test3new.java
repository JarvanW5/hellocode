package findwork.pdd;

import java.util.Scanner;

/**
 * @Author: JarvanW
 * @Date: 2024/8/25
 * @Description:
 * @Requirements:
 */

public class test3new {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        scanner.close();
        String rotatedS = s + s;
        int maxAfterOperation = getMaxLength(rotatedS);

        System.out.println(Math.min(maxAfterOperation, n));
    }

    public static int getMaxLength(String s) {
        int maxLen = 1;
        int currentLen = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                currentLen++;
            } else {
                maxLen = Math.max(maxLen, currentLen);
                currentLen = 1;
            }
        }
        return Math.max(maxLen, currentLen);
    }
}
