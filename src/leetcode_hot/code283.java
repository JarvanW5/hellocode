package leetcode_hot;

/**
 * @Author:JarvanW
 * @Date:2024/4/18
 * @Description:移动零
 * @Version:1.8
 * @Requirement:
 */
public class code283 {
    public static void moveZeroes(int[] nums) {

        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0){
                nums[left] = nums[right];
                left++;
            }
        }

        for (int i =left;i<nums.length;i++){
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {

        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);

        }
    }
}
