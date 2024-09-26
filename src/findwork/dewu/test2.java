package findwork.dewu;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @Author: JarvanW
 * @Date: 2024/9/24
 * @Description:
 * @Requirements:
 */

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        scanner.close();


        int[] result = new int[N];
        boolean[] swapped = new boolean[N];

        for (int i = 0; i < N; i++) {
            int target = N -i;
            if (arr[i] != target){
                for (int j = i + 1; j < N; j++) {
                    if (arr[j] == target && !swapped[j]){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        swapped[j] = true;
                        break;
                    }

                }
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }


    }
}
