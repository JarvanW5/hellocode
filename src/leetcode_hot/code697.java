package leetcode_hot;

import java.util.HashMap;

/**
 * @Author: JarvanW
 * @Date: 2024/9/1
 * @Description:
 * @Requirements:
 *
 * count.values() 返回一个 collection ，其中包含了哈希表中所有的值
 *
 * count.keySet() 返回一个 Set，其中包含了哈希表中所有的键
 *
 */

public class code697 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 1};
        int shortestSubArray = findShortestSubArray(nums);
        System.out.println(shortestSubArray);
    }

    public static int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();       // 用一个哈希表 count 记录每个元素出现的频数 （数组的度就是 count 中的最大值）
        HashMap<Integer, Integer> first = new HashMap<>();       // 用一个哈希表 first 记录每个元素第一次出现的索引
        HashMap<Integer, Integer> last = new HashMap<>();        // 用一个哈希表 last 记录每个元素最后一次出现的索引

        // 遍历数组，记录元素出现的频数、第一次出现的位置和最后一次出现的位置
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (!first.containsKey(x)) {
                first.put(x, i);
            }
            last.put(x, i);
            count.put(x, count.getOrDefault(x, 0) + 1);
        }

        // 计算数组的度
        int degree = 0;
        for (int x : count.values()) {
            degree = Math.max(degree, x);
        }

        // 计算最短连续子数组的长度
        int minLength = nums.length;
        for (int x : count.keySet()) {
            if (count.get(x) == degree) {
                minLength = Math.min(minLength, last.get(x) - first.get(x) + 1);
            }
        }

        return minLength;
    }
}
