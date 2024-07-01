package javaguide.leetcode;

import java.util.Arrays;

/**
 * @Author: JarvanW
 * @Date: 2024/6/25
 * @Description: 有序数组的平方
 * @Version: 1.8
 * @Requirement: 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
 */
public class code977 {

    public static int[] sortedSquares(int[] nums) {
// 暴力 + 快排
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) Math.pow(nums[i], 2);
        }
        Arrays.sort(nums);

        return nums;
    }

    public static int[] sortedSquares2(int[] nums) {
        int right = nums.length - 1;
        int left = 0;
        int[] result = new int[nums.length];
        int index = result.length - 1;
        while (left <= right) {
            if (nums[left] * nums[left] > nums[right] * nums[right]) {
                // 正数的相对位置是不变的， 需要调整的是负数平方后的相对位置
                result[index--] = nums[left] * nums[left];
                ++left;
            } else {
                result[index--] = nums[right] * nums[right];
                --right;
            }
        }
        return result;
    }

    public static void main(String[] args) {
//        int[] nums1 = {-4, -1, 0, 3, 10};
        int[] nums2 = {-7, -3, 2, 3, 11};

        int[] squares1 = sortedSquares(nums2);
        for (int j : squares1) {
            System.out.println(j);

        }
    }
}
