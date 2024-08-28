package findwork.pdd;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: JarvanW
 * @Date: 2024/8/25
 * @Description:
 * @Requirements:
 */

public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int[] gifts = new int[n];

        for (int i = 0; i < n; i++) {
            gifts[i] = scanner.nextInt();
        }

        Arrays.sort(gifts);

        int swapCount = 0;

        for (int i = 0; i < n; i++) {
            if (x > gifts[i]) {
                int temp = x;
                x = gifts[i];
                gifts[i] = temp;
                swapCount++;
            } else {
                break;
            }
        }


        for (int i = 1; i < n; i++) {
            if (gifts[i] < gifts[i - 1]) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(swapCount);
    }
}
