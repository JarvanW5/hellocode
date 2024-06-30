package leetcode;

/**
 * @Author:JarvanW
 * @Date:2024/4/1
 * @Description:
 * @Version:1.8
 * @Requirement:
 */
public class code283 {
    public static void moveZeroes(int[] nums) {
        int left = 0;
        for (int right = 0; right < nums.length; right++) {

            if (nums[right] != 0) {
                nums[left] = nums[right];
                left++;
            }

        }

        for (int i = left; i < nums.length; i++){
            nums[i] = 0;
        }


    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 0, 0, 0, 3, 4};

        moveZeroes(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);

        }

    }
}
