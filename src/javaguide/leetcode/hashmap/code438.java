package javaguide.leetcode.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @Author: JarvanW
 * @Date: 2024/7/10
 * @Description: 找到字符串中所有字母异位词
 * @Requirements: 给定两个字符串 s 和 p，找到 s 中所有 p 的 异位词 的子串，返回这些子串的起始索引。不考虑答案输出的顺序。
 * <p>
 * 异位词 指由相同字母重排列形成的字符串（包括相同的字符串）。
 * <p>
 * 示例 1:
 * <p>
 * 输入: s = "cbaebabacd", p = "abc"
 * 输出: [0,6]
 * 解释:
 * 起始索引等于 0 的子串是 "cba", 它是 "abc" 的异位词。
 * 起始索引等于 6 的子串是 "bac", 它是 "abc" 的异位词。
 * 示例 2:
 * <p>
 * 输入: s = "abab", p = "ab"
 * 输出: [0,1,2]
 * 解释:
 * 起始索引等于 0 的子串是 "ab", 它是 "ab" 的异位词。
 * 起始索引等于 1 的子串是 "ba", 它是 "ab" 的异位词。
 * 起始索引等于 2 的子串是 "ab", 它是 "ab" 的异位词。
 */

public class code438 {

    public static List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int length1 = p.length();
        int length2 = s.length();
        int length = length2 - length1 + 1;

        char[] charArray1 = p.toCharArray();
        Arrays.sort(charArray1);
        String p1 = new String(charArray1);

        for (int i = 0; i < length; i++) {
            String substring = s.substring(i, i + length1);
            char[] charArray = substring.toCharArray();
            Arrays.sort(charArray);
            String s1 = new String(charArray);
            if (s1.equals(p1)) {
                arrayList.add(i);
            }
        }

        return arrayList;

    }

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";

//        String s1 = "bac";
//
//        char[] charArray = s1.toCharArray();
//        Arrays.sort(charArray);
//
//        String s2 = new String(charArray);
//
//        s1 = charArray.toString();
//
//        boolean equals = s1.equals(p);
//
//        boolean equals1 = s2.equals(p);
//
//        String s3 = Arrays.toString(charArray);
//
//        boolean equals2 = s3.equals(p);
//
//        System.out.println(equals);
//
//        System.out.println(equals1);
//
//        System.out.println(equals2);

        List<Integer> list = findAnagrams(s, p);

        for (Integer i : list) {
            System.out.println(i);
        }

    }
}
