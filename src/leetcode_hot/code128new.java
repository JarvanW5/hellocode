package leetcode_hot;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @Author: JarvanW
 * @Date: 2024/8/28
 * @Description:
 * @Requirements:
 */

public class code128new {

    public static int longestConsecutive(int[] nums) {
        // 使用hashset来保证没有重复的，做到去重的目的
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int max = 0;

        for (Integer num : set) {
            // 对于num，只需要判断最有可能是  最小的数字（怎么判断，就看它前面还有没有其他数字）
            if (!set.contains(num - 1)) {
                int currentnum = num;
                int length = 1;

                // 然后再计算以它为起点的下面数字的长度
                while (set.contains(currentnum + 1)) {
                    currentnum++;
                    length++;
                }
                max = Math.max(length, max);
            }
        }


        return max;
    }


    public static void main(String[] args) {


        int[] nums = {100, 4, 200, 1, 2, 3};
    }

}
