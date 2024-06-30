package leetcode_hot;

/**
 * @Author:JarvanW
 * @Date:2024/4/22
 * @Description:最大子数组和
 * @Version:1.8
 * @Requirement:
 */
public class code53 {
    public static int maxSubArray(int[] nums) {

        int len = nums.length;
        int[] dp = new int[len];
        dp[0] = nums[0];

        int res = dp[0];


        for (int i = 1; i < len; i++) {
            if (dp[i - 1] > 0) {
                dp[i] = dp[i - 1] + nums[i];
            } else {
                dp[i] = nums[i];
            }

            res = Math.max(res, dp[i]);


        }


        return res;

    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int res = maxSubArray(nums);
        System.out.println(res);

    }
}
