package javaguide.leetcode;

/**
 * @Author:JarvanW
 * @Date:2024/6/25
 * @Description: 长度最小的子数组
 * @Version:1.8
 * @Requirement:
 */
public class code209 {

    // 滑动窗口
    public static int minSubArrayLen(int s, int[] nums) {
        int left = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= s) {
                result = Math.min(result, right - left + 1);
                sum -= nums[left++];
            }
        }
        // 这样的设计确保了函数在所有可能情况下都有明确的返回值，避免了未定义行为或者不符合预期的返回结果。
        return result == Integer.MAX_VALUE ? 0 : result;
    }

    public static void main(String[] args) {

        int[] nums = {2, 3, 1, 2, 4, 3};
        int s = 7;
        int i = minSubArrayLen(s, nums);
        System.out.println(i);

    }
}
