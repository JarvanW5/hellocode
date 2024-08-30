package leetcode_hot;

/**
 * @Author: JarvanW
 * @Date: 2024/8/30
 * @Description:
 * @Requirements:
 */

public class code189new {

//    public static void rotate(int[] nums, int k) {
//        int[] newNums = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            newNums[(i + k) % nums.length] = nums[i];
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = newNums[i];
//        }
//    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 1;
        rotate(nums, k);

        for (int num : nums) {
            System.out.println(num);
        }

    }


    // 反转数组
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // 如果 k 大于 n，取模后 k 的有效值
        reverse(nums, 0, n - 1);      // 反转整个数组
        reverse(nums, 0, k - 1);      // 反转前 k 个元素
        reverse(nums, k, n - 1);      // 反转剩下的元素
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }


}
