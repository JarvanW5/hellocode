package findwork.xiechen;

import java.util.Arrays;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        Arrays.sort(a);
        int left = 0;
        int remaining = n;

        for (int right = 0; right < n; right++) {
            while (a[right] - a[left] > k){
                left++;
            }

            if (right - left + 1 >= m){
                remaining--;
                left++;
            }
        }

        System.out.println(remaining);
    }
}
