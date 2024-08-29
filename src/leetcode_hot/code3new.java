package leetcode_hot;

import java.util.HashMap;

/**
 * @Author: JarvanW
 * @Date: 2024/8/29
 * @Description:
 * @Requirements:
 */

public class code3new {
    public static int lengthOfLongestSubstring(String s) {
        int result = 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int left = 0;
        int right = 0;
        while (right < s.length()) {
            char c = s.charAt(right++);
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);


            while (hashMap.get(c) > 1) {
                char l = s.charAt(left++);
                hashMap.put(l, hashMap.getOrDefault(l, 0) - 1);
            }
            result = Math.max(result, right - left);

        }


        return result;
    }

    public static void main(String[] args) {
        String s = "abcabcabc";

        int result = lengthOfLongestSubstring(s);

        System.out.println(result);


    }

}
