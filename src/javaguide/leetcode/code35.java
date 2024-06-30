package javaguide.leetcode;

/**
 * @Author:JarvanW
 * @Date: 2024/6/21
 * @Description: 搜索插入位置
 * @Version:1.8
 * @Requirement:
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
