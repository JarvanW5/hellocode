package javaguide.leetcode.array;

/**
 * @Author: JarvanW
 * @Date: 2024/6/25
 * @Description: 移动零
 * @Version: 1.8
 * @Requirement: 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 */
public class code283 {

    // 1\
    public static void moveZeroes1(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                for (int i1 = i + 1; i1 < nums.length; i1++) {
                    if (nums[i1] != 0) {
                        nums[i] = nums[i1];
                        nums[i1] = 0;
                        break;
                    }
                }
            }

        }

    }

    // 2\快排一次遍历结束
    public static void moveZeroes2(int[] nums) {
        if (nums == null) {
            return;
        }
        //两个指针i和j
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            //当前元素!=0，就把其交换到左边，等于0的交换到右边
            if (nums[i] != 0) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j++] = tmp;
            }
        }
    }


    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
//        moveZeroes1(nums);
        moveZeroes2(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
