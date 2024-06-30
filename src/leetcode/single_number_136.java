package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author:JarvanW
 * @Date:2023/10/14
 * @Description:只出现一次的数字
 * @Version:1.8
 * @Requirement:
 */
public class single_number_136 {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 4};
        int nums1 = singleNumber(nums);
        System.out.println(nums1);

    }

    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] != nums[j]) {
                    return nums[j];
                }

            }

        }

        return 0;
    }
}
