package leetcode_hot;

/**
 * @Author: JarvanW
 * @Date: 2024/8/29
 * @Description:
 * @Requirements:
 */

public class code53new {

    /**
     * 我们遍历数组 nums，对每个元素 num，我们可以选择：
     *
     * 只使用当前元素 num 开始一个新的子数组。
     * 或者，将当前元素 num 加入到之前的子数组中，从而扩展之前的子数组。
     * 我们使用一个变量 currentSum 来记录以当前元素为结束的最大子数组和，并使用另一个变量 maxSum 来记录全局最大子数组和。
     * @param nums
     * @return
     */
    public static int maxSubArray(int[] nums) {
        int pre = 0, maxAns = nums[0];
        for (int x : nums) {
            pre = Math.max(pre + x,x);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int i = maxSubArray(nums);

        System.out.println(i);
    }
}
