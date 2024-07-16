package javaguide.leetcode.string;

/**
 * @Author: JarvanW
 * @Date: 2024/7/16
 * @Description: 541. 反转字符串 II
 * @Requirements: 给定一个字符串 s 和一个整数 k，从字符串开头算起，每计数至 2k 个字符，就反转这 2k 字符中的前 k 个字符。
 * <p>
 * 如果剩余字符少于 k 个，则将剩余字符全部反转。
 * 如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "abcdefg", k = 2
 * 输出："bacdfeg"
 * 示例 2：
 * <p>
 * 输入：s = "abcd", k = 2
 * 输出："bacd"
 */

public class code541 {
    public static String reverseStr(String s, int k) {
        StringBuilder res = new StringBuilder();
        int length = s.length();
        int start = 0;
        while (start < length) {
            // 找到k处和2k处
            StringBuilder temp = new StringBuilder();
            // 与length进行判断，如果大于length了，那就将其置为length
            int firstK = Math.min(start + k, length);
            int secondK = Math.min(start + (2 * k), length);

            //无论start所处位置，至少会反转一次
            temp.append(s, start, firstK);
            res.append(temp.reverse());

            // 如果firstK到secondK之间有元素，这些元素直接放入res里即可。
            if (firstK < secondK) { //此时剩余长度一定大于k。
                res.append(s, firstK, secondK);
            }
            start += (2 * k);
        }
        return res.toString();
    }

    public static String reverseStr1(String s, int k) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i += 2 * k) {
            if (i + k >= arr.length) {
                reverse(arr, i, arr.length - 1);
            } else {
                reverse(arr, i, i + k - 1);
            }

        }
        return new String(arr);

    }

    //将闭区间[start,end]的子字符串进行反转
    public static void reverse(char[] chars, int start, int end) {
        for (int i = start; i <= (end + start) / 2; ++i) {
            char temp = chars[i];
            chars[i] = chars[end - i + start];
            chars[end - i + start] = temp;
        }
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        String s1 = reverseStr(s, k);
        String s2 = reverseStr1(s, k);

        System.out.println(s1);
        System.out.println(s2);
    }
}
