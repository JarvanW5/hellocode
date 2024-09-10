package findwork.mihayou;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        long[] extraRewards = new long[m + 1];
        for (int i = 1; i <= m; i++) {
            extraRewards[i] = scanner.nextLong();
        }
        long[][] rewards = new long[n][3];
        int[][] sources = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                rewards[i][j] = scanner.nextLong();
            }
            for (int j = 0; j < 3; j++) {
                sources[i][j] = scanner.nextInt();
            }
        }
        long maxAbilityValue = 0;
        int totalChoices = (int) Math.pow(3, n);

        for (int choice = 0; choice < totalChoices; choice++) {
            long[] heroCounts = new long[m + 1];
            long totalValue = 0;

            for (int level = 0; level < n; level++) {
                int rewardIndex = (choice / (int) Math.pow(3,level)) % 3;
                int hero = sources[level][rewardIndex];
                totalValue += rewards[level][rewardIndex];
                heroCounts[hero]++;
            }

            for (int hero = 1; hero <= m; hero++) {
                if (heroCounts[hero] >= 3) {
                    totalValue += heroCounts[hero];
                }
            }

            maxAbilityValue = Math.max(maxAbilityValue, totalValue);
        }
        System.out.println(maxAbilityValue);
        scanner.close();

    }
}
