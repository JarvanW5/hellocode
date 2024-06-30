package leetcode;

/**
 * @Author:JarvanW
 * @Date:2023/10/9
 * @Description:最大子数组和
 * @Version:1.8
 * @Requirement:
 */
public class maximum_subarray_53 {
    public static void main(String[] args) {

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int max = maxSubArray(nums);
        System.out.println(max);

    }

    public static int maxSubArray(int[] nums) {

        int maxSubArray = 0;

        for (int i = 0; i < nums.length + 1; i++) {
            int temp = 0;
            temp += nums[i];
            if (temp > maxSubArray) {
                maxSubArray = temp;
            }

        }

        return maxSubArray;

    }
}
