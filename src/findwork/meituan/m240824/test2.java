package findwork.meituan.m240824;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: JarvanW
 * @Date: 2024/8/24
 * @Description:
 * @Requirements:
 */

public class test2 {
    private static final BigInteger MOD = BigInteger.valueOf(1000000007);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        long k = scanner.nextLong();
        scanner.close();

        int[] nums = {a, b, c};
        Arrays.sort(nums);

        long minIncrement = Math.min(k, nums[2] - nums[0]);
        nums[0] += minIncrement;
        k -= minIncrement;

        long increment = k / 3;
        long remainder = k % 3;

        for (int i = 0; i < 3; i++) {
            nums[i] += increment;
            if (remainder > 0) {
                nums[i]++;
                remainder--;
            }

        }
        BigInteger result = BigInteger.valueOf(nums[0]).multiply(BigInteger.valueOf(nums[1])).multiply(BigInteger.valueOf(nums[2])).mod(MOD);
        System.out.println(result);
    }
}
