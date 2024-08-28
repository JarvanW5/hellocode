package findwork.pdd;

import java.util.Scanner;

/**
 * @Author: JarvanW
 * @Date: 2024/8/25
 * @Description:
 * @Requirements:
 */

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        Long[] results = new Long[T];

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            Long[] arr = new Long[N];
            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextLong();
            }
            results[t] = (long) minOperations(arr);

        }
            for (long result : results) {
                System.out.println(result);
            }
    }

    public static int minOperations(Long[] arr){
        int operations = 0;
        for (long num : arr){
            while (num % 2 == 0){
                num /= 2;
                operations++;
            }
        }
        return operations;
    }
}
