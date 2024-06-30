package test.meituan;

import java.util.Scanner;

/**
 * @Author:JarvanW
 * @Date:2024/4/20
 * @Description:
 * @Version:1.8
 * @Requirement:
 */
public class code3 {
    private static boolean canTransform(String s, String t, int k) {
        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            int diff = t.charAt(i) - s.charAt(i);
            if (diff < 0) diff += 26;
            count[diff]++;
        }

        for (int c : count) {
            k -= c;
            if (k < 0 || (k % 26 == 0 && k / 26 < c)){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        scanner.nextLine();


        for (int i = 0; i < q; i++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            scanner.nextLine();
            String s = scanner.nextLine();
            String t = scanner.nextLine();

            if (canTransform(s,t,k)){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }

        }
        scanner.close();
    }
}
