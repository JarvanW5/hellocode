package javaguide.leetcode.hashmap;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: JarvanW
 * @Date: 2024/7/10
 * @Description: 快乐数
 * @Requirements: 编写一个算法来判断一个数 n 是不是快乐数。
 * <p>
 * 「快乐数」 定义为：
 * <p>
 * 对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和。
 * 然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。
 * 如果这个过程 结果为 1，那么这个数就是快乐数。
 * 如果 n 是 快乐数 就返回 true ；不是，则返回 false 。
 * <p>
 * 示例 1：
 * <p>
 * 输入：n = 19
 * 输出：true
 * 解释：
 * 1^2 + 9^2 = 82
 * 8^2 + 2^2 = 68
 * 6^2 + 8^2 = 100
 * 1^2 + 0^2 + 0^2 = 1
 */

public class code202 {
    private static int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            totalSum += d * d;
        }
        return totalSum;
    }

    public static boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        // 判断 seen 集合中是否有 n
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getNext(n);
        }
        return n == 1;
    }

    public static void main(String[] args) {
        int n = 19;
//        boolean happy = isHappy(n);
//        System.out.println(happy);

        Set<String> mySet = new HashSet<>();
        mySet.add("apple");
        mySet.add("banana");
        mySet.add("cherry");

// 检查集合中是否包含 "banana"
        boolean containsBanana = mySet.contains("banana");
        System.out.println(containsBanana); // 输出 true

// 检查集合中是否包含 "grape"
        boolean containsGrape = mySet.contains("grape");
        System.out.println(containsGrape); // 输出 false

    }
}
