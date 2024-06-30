package test.meituan;

import java.util.Scanner;

/**
 * @Author:JarvanW
 * @Date:2024/4/20
 * @Description:
 * @Version:1.8
 * @Requirement:
 */
public class new1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] b = new int[n];

        for (int i = 0; i < n / 2; i++) {
            b[i] = i + 1;
            b[i + n / 2] = i + 1;
        }
        if (n % 2 != 0){
            b[n - 1] = n / 2 + 1;
        }
        for (int i : b) {
            System.out.println(i + " ");

        }
    }
}
