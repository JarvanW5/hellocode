package javaguide.leetcode.array;

/**
 * @Author: JarvanW
 * @Date: 2024/6/21
 * @Description: 搜索插入位置
 * @Version: 1.8
 * @Requirement: 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * <p>
 * 请必须使用时间复杂度为 O(log n) 的算法。
 */
public class code35 {
    public static void main(String[] args) {
        int nums[] = {1, 3, 5, 6};
        int target = 4;
        int insert = searchInsert(nums, target);
        System.out.println(insert);

    }


    public static int searchInsert(int[] nums, int target) {
        int length = nums.length - 1;
        int left = 0;
        int right = length;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (nums[middle] > target) {
                right = middle - 1;
            } else if (nums[middle] < target) {
                left = middle + 1;
            } else {
                return middle;
            }
        }
        return right + 1;
    }
}
