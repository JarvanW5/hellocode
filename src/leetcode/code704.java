package leetcode;

import java.util.Arrays;

/**
 * @Author:JarvanW
 * @Date: 2024/4/20
 * @Description:
 * @Version:1.8
 * @Requirement: 二分查找
 */
public class code704 {

    public static int search(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2 + 1;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid +1;
            }else {
                right = mid -1;
            }
        }


        return -1;


    }

    public static void main(String[] args) {

        int[] nums = {-1, 0, 2, 4, 3, 5, 6, 9, 22};
        int traget = 9;

    }
}
