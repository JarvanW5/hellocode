package leetcode_hot;

/**
 * @Author: JarvanW
 * @Date: 2024/8/30
 * @Description:
 * @Requirements:
 */

public class code238new {

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        // 1. 计算前缀积
        answer[0] = 1;  // 初始化第一个元素的前缀积为 1
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        // 2. 计算后缀积并同时计算最终结果
        int suffix = 1;  // 初始化后缀积
        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * suffix;
            suffix *= nums[i];
        }

        return answer;
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
    }
}
