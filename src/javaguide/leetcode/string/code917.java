package javaguide.leetcode.string;

import java.util.Objects;

/**
 * @Author: JarvanW
 * @Date: 2024/7/16
 * @Description: 仅仅反转字母
 * @Requirements: 给你一个字符串 s ，根据下述规则反转字符串：
 * <p>
 * 所有非英文字母保留在原有位置。
 * 所有英文字母（小写或大写）位置反转。
 * 返回反转后的 s 。
 * 示例 1：
 * <p>
 * 输入：s = "ab-cd"
 * 输出："dc-ba"
 * 示例 2：
 * <p>
 * 输入：s = "a-bC-dEf-ghIj"
 * 输出："j-Ih-gfE-dCba"
 * 示例 3：
 * <p>
 * 输入：s = "Test1ng-Leet=code-Q!"
 * 输出："Qedo1ct-eeLg=ntse-T!"
 */

public class code917 {
    // 用于反转字符串中的字母，非字母字符的位置保持不变
    public static String reverseOnlyLetters(String s) {
        // 判断输入字符串是否为空，若为空则直接返回
        if (Objects.equals(s, ""))
            return s;
        // 将字符串转换为字符串数组
        char[] arr = s.toCharArray();
        // 使用双指针法，分别指向字符串的起始位置和结束位置
        int start = 0, end = s.length() - 1;
        // 在循环中，先判断起始位置的字符是否为字母，如果不是则向后移动指针，直到找到一个字母字符。
        // 再判断结束位置的字符是否为字母，如果不是则向前移动指针，直到找到一个字母字符
        while (start < end) {
            while (arr[start] < 'A' || (arr[start] > 'Z' && arr[start] < 'a')
                    || arr[start] > 'z') {
                start++;
                if (start >= end) {
                    return new String(arr);
                }
            }
            while (arr[end] < 'A' || (arr[end] > 'Z' && arr[end] < 'a')
                    || arr[end] > 'z') {
                end--;
                if (start >= end) {
                    return new String(arr);
                }
            }
            // 交换起始位置和结束位置的字母字符
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            // 将起始指针向后移动一位，结束指针向前移动一位
            start++;
            end--;
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        String s = "以！=【】sbde!=ab-cd";
        String s1 = reverseOnlyLetters(s);
        System.out.println(s);
        System.out.println(s1);
    }
}
