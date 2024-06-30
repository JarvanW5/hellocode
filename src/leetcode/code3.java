package leetcode;

import java.util.HashMap;

/**
 * @Author:JarvanW
 * @Date: 2024/3/25
 * @Description: 无重复字符的最长子串
 * @Version:1.8
 * @Requirement: 给定一个字符串 s ，请你找出其中不含有重复字符的最长子串的长度。
 *
 */
public class code3 {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, right = 0;
        int res = 0;
        while (right < s.length()) {
            char c = s.charAt(right++);
            map.put(c, map.getOrDefault(c, 0) + 1);
            while (map.get(c) > 1) {
                char l = s.charAt(left++);
                map.put(l, map.getOrDefault(l, 0) - 1);
            }
            res = Math.max(res, right - left);
        }
        return res;
    }
}
