package leetcode;

/**
 * @Author:JarvanW
 * @Date:2024/3/1
 * @Description:检查数组是否存在有效划分
 * @Version:1.8
 * @Requirement:
 *
 *
 *
 *        "&&" : 两个布尔表达式都为’true‘时，才为'true'
 *        "||" : 两个布尔表达式中有一个为'true'时，才为’true‘
 *
 *
 *
 *
 */
public class check_if_there_is_a_valid_partition_for_the_array_2369 {

    public static boolean isValidPartition(int[] nums) {
        int n = nums.length;
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        for (int i = 1; i <= n; i++) {
            if (i >= 2) {
                dp[i] = dp[i - 2] && validTwo(nums[i - 2], nums[i - 1]);
            }
            if (i >= 3) {
                dp[i] = dp[i] || (dp[i - 3] && validThree(nums[i - 3], nums[i - 2], nums[i - 1]));
            }
        }
        return dp[n];
    }

    public static boolean validTwo(int num1, int num2) {
        return num1 == num2;
    }

    public static boolean validThree(int num1, int num2, int num3) {
        return (num1 == num2 && num1 == num3) || (num1 + 1 == num2 && num2 + 1 == num3);
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 3, 4, 4, 5, 5};
        boolean result = isValidPartition(nums);
        System.out.println(result);
    }

}
