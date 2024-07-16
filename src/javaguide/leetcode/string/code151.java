package javaguide.leetcode.string;

/**
 * @Author: JarvanW
 * @Date: 2024/7/16
 * @Description: 反转字符串中的单词
 * @Requirements: 给你一个字符串 s ，请你反转字符串中 单词 的顺序。
 * <p>
 * 单词 是由非空格字符组成的字符串。s 中使用至少一个空格将字符串中的 单词 分隔开。
 * <p>
 * 返回 单词 顺序颠倒且 单词 之间用单个空格连接的结果字符串。
 * <p>
 * 注意：输入字符串 s 中可能会存在前导空格、尾随空格或者单词间的多个空格。返回的结果字符串中，单词间应当仅用单个空格分隔，且不包含任何额外的空格。
 * 示例 1：
 * <p>
 * 输入：s = "the sky is blue"
 * 输出："blue is sky the"
 * 示例 2：
 * <p>
 * 输入：s = "  hello world  "
 * 输出："world hello"
 * 解释：反转后的字符串中不能存在前导空格和尾随空格。
 * 示例 3：
 * <p>
 * 输入：s = "a good   example"
 * 输出："example good a"
 * 解释：如果两个单词间有多余的空格，反转后的字符串需要将单词间的空格减少到仅有一个。
 */

public class code151 {
    public static String reverseWords(String s) {
        //去除多余的空格
        StringBuilder sb = reverseSpace(s);
        //将字符串反转
        reverseString(sb, 0, sb.length() - 1);
        //反转每个单词
        reverseEachWord(sb);
        return new String(sb);
    }

    // 将字符串s中的字符进行翻转，将连续的空格压缩成一个空格，返回翻转后的字符串
    public static StringBuilder reverseSpace(String s) {
        // 初始化两个指针 start 和 end 分别指向字符串 s 的首尾字符
        int start = 0, end = s.length() - 1;
        // 跳过 start 指向的连续空格字符
        while (s.charAt(start) == ' ') start++;
        // 跳过 end 指向的连续空格字符
        while (s.charAt(end) == ' ') end--;
        // 创建一个 StringBuilder 对象 sb 用于存储翻转后的字符
        StringBuilder sb = new StringBuilder();
        // 当 strat 小于等于 end 时，进行以下操作
        while (start <= end) {
            // 如果 start 指向的字符是空格，则将空格字符添加到 sb 中，并将 start 指针移动到下一个非空格字符
            if (s.charAt(start) == ' ') {
                sb.append(' ');
                ++start;
                while (s.charAt(start) == ' ') {
                    ++start;
                }
            }
            // 将 start 指向的字符添加到 sb 中，并将 start 指针移动到下一个字符
            sb.append(s.charAt(start++));
        }
        // 返回翻转后的字符串 sb
        return sb;
    }

    // 用于反转 sb 中的指定范围的字符串 从 start 到 end
    public static void reverseString(StringBuilder sb, int start, int end) {
        while (start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            ++start;
            --end;
        }
    }

    // 将字符串中的每个单词进行反转，使用两个指针 start 和 end 来确定每个单词的起始和结束位置
    public static void reverseEachWord(StringBuilder sb) {
        // 初始化 start 和 end 为 0
        int start = 0, end = 0;
        while (end < sb.length()) {
            while (end < sb.length() && sb.charAt(end) != ' ') {
                ++end;
            }
            reverseString(sb, start, end - 1);
            end += 1;
            start = end;
        }
    }

    public static void main(String[] args) {
        String s = "the sky is blue";
//        String[] s1 = s.split(" ");
//        for (String string : s1) {
//            System.out.println(string);
//        }
        String s1 = reverseWords(s);
        System.out.println(s1);
    }
}
