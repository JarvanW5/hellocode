package javaguide.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: JarvanW
 * @Date: 2024/6/25
 * @Description: 水果成篮
 * @Version: 1.8
 * @Requirement: 你正在探访一家农场，农场从左到右种植了一排果树。这些树用一个整数数组 fruits 表示，其中 fruits[i] 是第 i 棵树上的水果 种类 。
 * <p>
 * 你想要尽可能多地收集水果。然而，农场的主人设定了一些严格的规矩，你必须按照要求采摘水果：
 * <p>
 * 你只有 两个 篮子，并且每个篮子只能装 单一类型 的水果。每个篮子能够装的水果总量没有限制。
 * 你可以选择任意一棵树开始采摘，你必须从 每棵 树（包括开始采摘的树）上 恰好摘一个水果 。采摘的水果应当符合篮子中的水果类型。每采摘一次，你将会向右移动到下一棵树，并继续采摘。
 * 一旦你走到某棵树前，但水果不符合篮子的水果类型，那么就必须停止采摘。
 * 给你一个整数数组 fruits ，返回你可以收集的水果的 最大 数目。
 */
public class code904 {

    public static int totalFruit(int[] fruits) {
        int left = 0;
        int sum = 1;
        for (int right = left + 1; right < fruits.length; right++) {
            if (fruits[right] == fruits[left]) {
                sum++;
            } else {
                left++;
            }
        }

        return sum;
    }

    /**
     * @param fruits
     * @return
     */
    public static int totalFruit2(int[] fruits) {
        int n = fruits.length;
        Map<Integer, Integer> cnt = new HashMap<>();

        int left = 0, ans = 0;
        for (int right = 0; right < n; ++right) {
            // fruits[right] 表示数组 fruits 中索引为 right 的元素，即当前要统计出现次数的元素。
            // cnt.getOrDefault(key, defaultValue) 是 Map 接口的方法，用于获取指定 key 对应的值，如果该 key 不存在，则返回 defaultValue 指定的值。
            // 在这里，fruits[right] 作为 key，用来从 cnt 中获取该元素出现的次数。如果 fruits[right] 已经在 cnt 中，则返回它的当前值；否则返回 0。
            cnt.put(fruits[right], cnt.getOrDefault(fruits[right], 0) + 1);
            while (cnt.size() > 2) {
                cnt.put(fruits[left], cnt.get(fruits[left]) - 1);
                if (cnt.get(fruits[left]) == 0) {
                    cnt.remove(fruits[left]);
                }
                ++left;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }

    public static void main(String[] args) {


        int[] fruits = {3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4};

        int fruit = totalFruit2(fruits);
        System.out.println(fruit);


    }
}
