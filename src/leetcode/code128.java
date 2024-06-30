package leetcode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @Author:JarvanW
 * @Date:2024/4/1
 * @Description:最长连续序列
 * @Version:1.8
 * @Requirement:
 */
public class code128 {
    public static int longestConsecutive(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxlength = 0;

        for (int num : nums) {
            if (!map.containsKey(num)) {
                int left = map.getOrDefault(num - 1, 0);
                int right = map.getOrDefault(num + 1, 0);

                int length = left + right + 1;
                map.put(num, length);
                map.put(num - left, length);
                map.put(num + right, length);

                maxlength = Math.max(maxlength, length);
            }
        }


        return maxlength;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 0};
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

    }
}
