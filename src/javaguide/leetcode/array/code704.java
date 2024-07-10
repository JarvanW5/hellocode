package javaguide.leetcode.array;

/**
 * @Author: JarvanW
 * @Date: 2024/6/21
 * @Description: 二分查找
 * @Version: 1.8
 * @Requirement: 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
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
