package leetcode_hot;

/**
 * @Author:JarvanW
 * @Date:2024/4/21
 * @Description: 最小覆盖子串
 * @Version:1.8
 * @Requirement:
 */

import java.util.HashMap;
import java.util.Map;

public class code76 {
    public static String minWindow(String s, String t) {
        // 创建两个哈希表，用于记录 t 中每个字符的出现次数和当前窗口中每个字符的出现次数
        Map<Character, Integer> tMap = new HashMap<>();
        Map<Character, Integer> windowMap = new HashMap<>();

        // 初始化 tMap
        for (char c : t.toCharArray()) {
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }

        // 初始化左右指针和最小子串的起始位置和长度
        int left = 0, right = 0;
        int start = 0, minLen = Integer.MAX_VALUE;

        // 记录滑动窗口中已经包含 t 中字符的数量
        int count = 0;

        // 开始滑动窗口
        while (right < s.length()) {
            // 右指针向右移动，更新窗口中的字符出现次数
            char c1 = s.charAt(right);
            windowMap.put(c1, windowMap.getOrDefault(c1, 0) + 1);

            // 如果当前字符是 t 中的字符，并且窗口中的该字符数量达到了 t 中该字符的数量，则 count 加 1
            if (tMap.containsKey(c1) && windowMap.get(c1).intValue() == tMap.get(c1).intValue()) {
                count++;
            }

            // 如果当前窗口中包含了 t 中所有字符，尝试缩小窗口
            while (count == tMap.size()) {
                // 更新最小子串的起始位置和长度
                if (right - left + 1 < minLen) {
                    start = left;
                    minLen = right - left + 1;
                }

                // 左指针向右移动，缩小窗口
                char c2 = s.charAt(left);
                windowMap.put(c2, windowMap.get(c2) - 1);

                // 如果左指针移动过程中使得窗口中该字符数量不满足 t 中该字符的数量，则 count 减 1
                if (tMap.containsKey(c2) && windowMap.get(c2).intValue() < tMap.get(c2).intValue()) {
                    count--;
                }

                left++;
            }

            // 右指针向右移动，扩大窗口
            right++;
        }

        // 如果找到了最小子串，则返回该子串，否则返回空字符串
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String result = minWindow(s,t);
        System.out.println(result);
    }
}

