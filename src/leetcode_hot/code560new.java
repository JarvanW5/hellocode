package leetcode_hot;

import java.util.HashMap;

/**
 * @Author: JarvanW
 * @Date: 2024/8/29
 * @Description:
 * @Requirements:
 */

public class code560new {
    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        prefixSumMap.put(0, 1);     // 初始化前缀和为0的出现次数为1

        for (int num : nums) {
            sum += num;
            // 检查是否存在一个前缀和等于当前

            if (prefixSumMap.containsKey(sum - k)) {
                count += prefixSumMap.get(sum - k);
            }

            prefixSumMap.put(sum, prefixSumMap.getOrDefault(sum, 0) + 1);
        }

        return count;

    }


    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        int k = 2;

        int i = subarraySum(nums, k);

        System.out.println(i);
    }
}
