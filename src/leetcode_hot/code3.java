package leetcode_hot;

import java.util.HashMap;

/**
 * @Author:JarvanW
 * @Date:2024/4/18
 * @Description:无重复字符串
 * @Version:1.8
 * @Requirement:
 */
public class code3 {
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int left = 0;
        int right = 0;
        int res = 0;
        while (right < s.length()) {
            char r = s.charAt(right++);
            hashMap.put(r, hashMap.getOrDefault(r, 0) + 1);
            while (hashMap.get(r) > 1) {

                char l = s.charAt(left++);
                hashMap.put(l, hashMap.getOrDefault(l,0) - 1);

            }

            res = Math.max(res,right-left);
        }

        return res;
    }

    public static void main(String[] args) {
        String s = "abcabcabc";

        int result = lengthOfLongestSubstring(s);

        System.out.println(result);


    }
}
