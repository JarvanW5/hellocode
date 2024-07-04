package javaguide.leetcode.hashmap;

import java.util.HashMap;

/**
 * @Author: JarvanW
 * @Date: 2024/7/4
 * @Description: 有效的字母异位词
 * @Requirements: 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 * <p>
 * 注意：若 s 和 t 中每个字符出现的次数都相同，则称 s 和 t 互为字母异位词。
 */

public class code242 {

    public static boolean isAnagram(String s, String t) {
        int[] records = new int[26];

        for (int i = 0; i < s.length(); i++) {
            records[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            records[t.charAt(i) - 'a']--;
        }
        for (int record : records) {
            if (record != 0){
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {

//        String s = "anagram";
        String s = "car";
//        String t = "nagaram";
        String t = "tar";
        System.out.println(isAnagram(s, t));

    }
}
