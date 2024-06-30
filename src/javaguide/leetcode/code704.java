package javaguide.leetcode;

/**
 * @Author:JarvanW
 * @Date: 2024/6/21
 * @Description: 二分查找
 * @Version:1.8
 * @Requirement:
 */
public class code704 {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int search = search(nums, target);
        System.out.println(search);


    }

    public static int search(int[] nums, int target) {
        int length = nums.length - 1;
        if (nums[length] < target || nums[0] > target) {
            return -1;
        }
        int left = 0;
        int right = length;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (nums[middle] > target) {
                right = middle - 1;
            } else if (nums[middle] < target) {
                left = middle + 1;
            } else if (nums[middle] == target) {
                return middle;
            }

        }
        return -1;
    }
}
