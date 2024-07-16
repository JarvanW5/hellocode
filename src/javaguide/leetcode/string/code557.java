package javaguide.leetcode.string;

/**
 * @Author: JarvanW
 * @Date: 2024/7/16
 * @Description: 反转字符串中的单词 III
 * @Requirements: 给定一个字符串 s ，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "Let's take LeetCode contest"
 * 输出："s'teL ekat edoCteeL tsetnoc"
 * 示例 2:
 * <p>
 * 输入： s = "Mr Ding"
 * 输出："rM gniD"
 */

public class code557 {
    // 将字符串 s 中的每个单词进行反转，单词之间以空格分隔
    public static String reverseWords(String s) {
        // 将字符串 s 转换为字符数组 chars
        char[] chars = s.toCharArray();
        // 使用双指针 start 和 end 来标识每个单词的起始和结束位置
        int start = 0, end = 0;
        // 遍历字符数组，当 end 指针到达单词的结束位置时，调用 reverse 函数将该单词进行反转
        while (end < chars.length) {
            while (end < chars.length && chars[end] != ' ') {
                end++;
            }
            reverse(chars, start, end - 1);
            end = end + 1;
            start = end;
        }
        return new String(chars);
    }

    // 反转字符串
    public static void reverse(char[] s, int start, int end) {
        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String s1 = reverseWords(s);
        System.out.println(s1);

    }
}
