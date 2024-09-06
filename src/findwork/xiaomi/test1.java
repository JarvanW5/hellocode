package findwork.xiaomi;

import java.util.Arrays;
import java.util.Scanner;

public class test1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] aTimes = new int[n];
        int[] bTimes = new int[n];
        for (int i = 0; i < n; i++) {
            aTimes[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            bTimes[i] = scanner.nextInt();
        }

        int minTime = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j){
                    int time = Math.max(aTimes[i],bTimes[j]);
                    minTime = Math.min(minTime,time);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            int time = aTimes[i] + bTimes[i];
            minTime = Math.min(minTime,time);
        }

        System.out.println(minTime);
        scanner.close();

    }
}
